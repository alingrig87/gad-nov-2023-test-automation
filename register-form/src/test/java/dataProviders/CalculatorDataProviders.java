package dataProviders;

import org.testng.annotations.DataProvider;

public class CalculatorDataProviders {
    // Data providers
    @DataProvider(name = "calculatorPositiveDataProvider")
    public Object[][] calculatorDataProvider() {
        return new Object[][]{
                {1, 3, "+", 4},
                {2, 5, "-", -3},
                {2, 6, "*", 12},
                {2, 3, "/", 0.666666},
                {4, 2, "+", 6},
                {8, 4, "-", 4},
                {3, 7, "*", 21},
                {6, 2, "/", 3},
                {5, 3, "+", 8},
                {9, 4, "-", 5},
                {3, 2, "*", 6},
                {7, 3, "/", 2.3333333333333335},
                {4, 4, "+", 8},
                {6, 2, "-", 4},
                {5, 5, "*", 25},
                {8, 2, "/", 4},
                {2, 8, "+", 10},
                {5, 3, "-", 2},
                {6, 4, "*", 24},
                {9, 3, "/", 3}
        };

    }
}