package service;

import model.UserData;

public class UserCreator {

    public static final String TESTDATA_USER = "testdata.User";
    public static final String TESTDATA_PASSWORD ="testdata.Password";

    public static UserData withCredentialsFromProperty() {
        return new UserData(TestDataReader.getTestData(TESTDATA_USER),
                TestDataReader.getTestData(TESTDATA_PASSWORD));
    }
}
