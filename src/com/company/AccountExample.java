package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String inputAccount){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(inputAccount);
        return matcher.matches();

    }
}
