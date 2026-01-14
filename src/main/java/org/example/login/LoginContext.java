package org.example.login;

public class LoginContext {
    private LoginStrategy loginStrategy;

    public LoginContext(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }
    public void executeLogin(){
        loginStrategy.login();
    }
}
