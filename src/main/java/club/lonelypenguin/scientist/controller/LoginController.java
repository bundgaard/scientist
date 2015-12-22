/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.lonelypenguin.scientist.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dbundgaard
 */
@ManagedBean(name = "login")
@SessionScoped
public class LoginController implements Serializable {
    public static final long serialVersionUID = 1L;
    
    private String userName;
    private String password;

    public LoginController() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString(){
        return "LoginController";
    }
    
    /*
    Implement logic if username and password is okay and exists; for now return null
    */
    public String loginButtonAction(){
        return null;
    }

}
