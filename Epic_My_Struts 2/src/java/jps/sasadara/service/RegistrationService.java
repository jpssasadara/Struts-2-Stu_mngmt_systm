/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.service;

import jps.sasadara.models.User;
import jps.sasadara.service.hibernate.Registration;

/**
 *
 * @author sasadara_j
 */
public class RegistrationService {
    public boolean AddUser(User ss){
        System.out.println("user"+ss.getPassword());
        return Registration.registerStudent(ss);
    }
    
}
