package com.ntg.testing.rest.restapi.dto;

public class LoginRequest {
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

  private String userName ;
  private String password;
}