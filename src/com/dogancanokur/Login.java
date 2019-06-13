package com.dogancanokur;

public class Login {

    public boolean loginCheck(String username, String userUsername, String userPassword) {
        String password = "123";

        return password.equals(userPassword) && username.equals(userUsername);

//        if (password.equals(userPassword) && username.equals(userUsername)) {
//            return true;
//        } else {
//            return false;
//        }

    }
}
