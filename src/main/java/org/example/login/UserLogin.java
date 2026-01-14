package org.example.login;

public class UserLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("User logged in – view only access");

    }
}
