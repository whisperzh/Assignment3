package com.ood.Util;

public class KeyBinding {

    private String operation;
    private char key;
    public KeyBinding(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }
}
