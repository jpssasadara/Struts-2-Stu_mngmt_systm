/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.service.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import jps.sasadara.models.User;

public class Registration {
	public static boolean registerStudent(User user) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(User.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {	
					
					//User st = new User(userId, password,role);
					
					
				
					
					// start a transaction
					session.beginTransaction();
					
					
					System.out.println("Saving instructor: " + user);
					session.save(user);					
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				catch(Exception ex){
                                    return false;
                                }
				finally {
					factory.close();
				}
		        return true;
	}

}
