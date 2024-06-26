package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class DirectoryServiceResponse {

  private String status;
  private String message;

  private long mobno;
  private String role;
  private String password;
  private String confirm;

  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private long userid;

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  private String email;

  public static DirectoryServiceResponse getInstance() {
    return new DirectoryServiceResponse();
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getMobno() {
    return mobno;
  }

  public void setMobno(long mobno) {
    this.mobno = mobno;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirm() {
    return confirm;
  }

  public void setConfirm(String confirm) {
    this.confirm = confirm;
  }
}
