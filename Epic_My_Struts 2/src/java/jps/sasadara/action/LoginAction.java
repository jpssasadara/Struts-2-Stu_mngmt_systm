/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.action;

import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import jps.sasadara.models.User;
import jps.sasadara.service.hibernate.login;
import org.apache.struts2.interceptor.SessionAware;

public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private Map<String, Object> session;

	

	public String home() {
		return SUCCESS;
	}

	// ---------------------------- Log Out register user

	
	public String logOut() {
		session.remove("loginId");
		addActionMessage("You Have Been Successfully Logged Out");
		return SUCCESS;
	}

	// ---------------------------- Login register user

	public String loginRegisterUser() {
		//if (getEmail().equals("sasadara") && password.equals("sasadara123")) {
                login lg = new login();
                
                 User us = lg.getPassword(email);
                if(us!=null){
                if (getEmail().equals(us.getUserId()) && password.equals(us.getPassword())) {
			session.put("loginId", getEmail());
                        session.put("object",us.getRole());
			return SUCCESS;
		} else {
			addActionError("Please Enter Valid emailId or Password");
			return LOGIN;
		}}else{
                    addActionError("Please Enter Valid emailId or Password");
			return LOGIN;
                }
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
        
         public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> map) {
		this.session = map;
	}

   

}
