/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.itexps;

/**
 *
 * @author rajes
 */
public class Login {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", password=" + password + '}';
    }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
}
