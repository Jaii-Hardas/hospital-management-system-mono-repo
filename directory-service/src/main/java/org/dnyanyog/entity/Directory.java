package org.dnyanyog.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Directory {

  @Id @GeneratedValue @Column private long userid;

  @Column private String username;

  @Column private String email;
  @Column private long mobno;

  @Column private String role;
  @Column private String password;
  @Column private String confirm;

  public long getMobno() {
    return mobno;
  }

  public void setMobno(long mobno) {
    this.mobno = mobno;
    		
  }

  public static Directory getInstance() {
    return new Directory();
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;

  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
	
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;

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
