package org.example.login;

public class AdminLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Admin logged in – can manage books");
    }
}
