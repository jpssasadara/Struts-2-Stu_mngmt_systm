/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import jps.sasadara.models.User;
import jps.sasadara.service.RegistrationService;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sasadara_j
 */
public class RegistrationAction extends ActionSupport  {
    
    private User user ;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    // Registration validation
    public void validate(){
        if(StringUtils.isEmpty(user.getUserId())){
            addFieldError("user.userId","User ID cannot be blank");
        }
        if(StringUtils.isEmpty(user.getPassword())){
            addFieldError("user.password","Password cannot be blank");
        }
        if(StringUtils.isEmpty(user.getRole())){
            addFieldError("user.role","Role cannot be blank");
        }
    } 
    public String execute(){
        RegistrationService regservice = new RegistrationService();
        if(regservice.AddUser(user)){
        addActionMessage("You Have Been Successfully Registered");
         return SUCCESS;
        }
        addActionMessage("Sorry this email address is already registered !! ");
        return LOGIN;
        
       
    }

  
    
}
