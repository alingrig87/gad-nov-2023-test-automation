package dataProviders;

import org.testng.annotations.DataProvider;

public class SignUpPageDataProvider {

    @DataProvider(name = "signUpPageDataProvider")
    public Object[][] signUpPageDataProvider() {
        return new Object[][] {
                {"chrome", true},
                {"firefox", true},
                {"edge", true},
                {"safari", false}
        };
    }
}
