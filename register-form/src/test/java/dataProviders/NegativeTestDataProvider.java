package dataProviders;


import org.testng.annotations.DataProvider;

public class NegativeTestDataProvider {

    @DataProvider(name="negativeSignUpDataProvider")
    public Object[][] negativeSignUpDataProvider () {
        return new Object[][]{
//                {"chrome", "abc123", "password","password", "Ms", "fi", "la", "bla@test.com", "12/14/1999", "Romanian", true, "", "", "" , "" ,
//                        "","", "You need to accept our T&C!"},
//                {"chrome", "", "","", "", "", "", "", "", "", false, "Please choose a username", "Please choose a password", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
                {"chrome", "abc123", "12345678","12345678", "Ms", "Alin", "Bogdan", "costel@gmail.com", "12/13/2025", "Romania", true, "", "", "" , "" ,
                        "","", "You need to accept our T&C!"},
////                {"chrome", "a", "","", "", "", "", "", "", "", false, "Minimum of 4 characters is required!", "Password is required!", "" , "" ,
////                        "","Email is required!", "You need to accept our T&C!"},
////                {"chrome", "abc", "","", "", "", "", "", "", "", false, "Minimum of 4 characters is required!", "Password is required!", "" , "" ,
////                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "abcd", "","", "", "", "", "", "", "", false, "", "Password is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
////                BUG - No "Invalid User!" error message is displayed when a username contains special characters
//                {"chrome", "@#$%", "","", "", "", "", "", "", "", false, "Invalid username!", "Password is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
////                BUG - No "Invalid User!" error message is displayed when a username contains spaces
//                {"chrome", "Popescu Daniel", "","", "", "", "", "", "", "", false, "Invalid username!", "Password is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "Abcdefghijklmopqrstuvwxyzabcdefghijklll", "","", "", "", "", "", "", "", false, "Maximum of 35 characters allowed!", "Password is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "", "p","", "", "", "", "", "", "", false, "Username is required!", "Minimum of 8 characters is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "", "passwor","", "", "", "", "", "", "", false, "Username is required!", "Minimum of 8 characters is required!", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
////                BUG - No pass confirm error "Passwords do not match!" when correct password is inserted and password confirmation input is blank
//                {"chrome", "", "password","", "", "", "", "", "", "", false, "Username is required!", "", "Passwords do not match!" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "", "password","passwor", "", "", "", "", "", "", false, "Username is required!", "", "Passwords do not match!" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "", "password","password", "", "", "", "", "", "", false, "Username is required!", "", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "f", "l", "", "", "", false, "", "", "" , "Minimum of 2 characters is required!" ,
//                        "Minimum of 2 characters is required!","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "fi", "l", "", "", "", false, "", "", "" , "" ,
//                        "Minimum of 2 characters is required!","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "fi", "la", "", "", "", false, "", "", "" , "" ,
//                        "","Email is required!", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "fi", "la", "blabla123", "", "", false, "", "", "" , "" ,
//                        "","Invalid email address!", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "fi", "la", "bla@test.com", "", "", false, "", "", "" , "" ,
//                        "","", "You need to accept our T&C!"},
////                BUG - Date from future must be not allowed for date of birth
//                {"chrome", "abc123", "password","password", "Mr", "fi", "la", "bla@test.com", "12/13/2025", "", false, "", "", "" , "" ,
//                        "","", "You need to accept our T&C!"},
//                {"chrome", "abc123", "password","password", "Mr", "fi", "la", "bla@test.com", "12/14/1999", "", false, "", "", "" , "" ,
//                        "","", "You need to accept our T&C!"},
////                Valid Test Data
//                {"chrome", "abc123", "password","password", "Ms", "fi", "la", "bla@test.com", "12/14/1999", "Romanian", true, "", "", "" , "" ,
//                        "","", "You need to accept our T&C!"},
        };
    }
}