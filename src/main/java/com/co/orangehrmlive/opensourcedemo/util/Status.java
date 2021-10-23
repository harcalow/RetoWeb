package com.co.orangehrmlive.opensourcedemo.util;

public enum Status {
    ALL("All"),
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private final String value;

    public String getValue() {
        return value;
    }

    Status(String value) {
        this.value = value;
    }
}
