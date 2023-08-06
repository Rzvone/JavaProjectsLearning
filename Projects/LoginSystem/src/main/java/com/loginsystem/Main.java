package com.loginsystem;

public class Main {

    public static void main(String[] args) {
        IdAndPassword idAndPassword = new IdAndPassword();

        new LoginPage(idAndPassword.getLoginInfo());
    }

}
