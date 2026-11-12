package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public String capitalize(String input) {
        if (input == null) {
            return null;
        }
        return StringUtils.capitalize(input);
    }
}