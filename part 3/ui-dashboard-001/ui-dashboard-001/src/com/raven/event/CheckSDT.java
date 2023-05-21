
package com.raven.event;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSDT {
        private static final String PHONE_NUMBER_REGEX = "^[0-9]{10}$";

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
