package org.example.calculator;

public class Calculator {
    public static void main(String[] args) {
        if (args.length == 3) {
            double result = new Calculator().compute(Double.parseDouble(args[0]),
                    Double.parseDouble(args[2]),
                    args[1]);
            System.out.println(args[0] + args[1] + args[2] + " = " + result);
        } else {
            System.err.println("Please use the following syntax: Calculator <operand1>  <operator> <operand2>");
        }
    }

    /**
     * Returns the result of the calculation of two doubles using the operation indicated by the operator.
     *
     * @param d1       first operand
     * @param d2       second operand - In case of SQRT this param is ignored.
     * @param operator - it could one of: +, -, /, *, SQRT.
     */
    public double compute(double d1, double d2,
                          String operator) throws IllegalArgumentException {
        double result;
        switch (operator) {
            case "+":
                result = d1 + d2;
                break;
            case "-":
                result = d1 - d2;
                break;
            case "*":
                result = d1 * d2;
                break;
            case "/":
                if (d2 == 0) {
                    throw new IllegalArgumentException("Divide by ZERO");
                } else {
                    result = d1 / d2;
                }
                break;
            case "SQRT":
                result = Math.sqrt(d1);
                break;
            default: {
                throw new IllegalArgumentException("UNSUPPORTED OPERATOR: " + operator);
            }
        }
        return result;
    }
}