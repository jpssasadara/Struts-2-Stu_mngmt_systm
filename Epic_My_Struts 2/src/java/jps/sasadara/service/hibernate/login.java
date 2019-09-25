/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.service.hibernate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jps.sasadara.models.User;

/**
 *
 * @author sasadara_j
 */
public class login {
    User user;
    public  User getPassword( String email){
      SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
					        .addAnnotatedClass(User.class)
					        .buildSessionFactory();  
  Session session = factory.getCurrentSession();
  
				
				try {
					session.beginTransaction();
					
					
					//Student tempInstructor = session.get(Student.class, 1);
					//System.out.println(tempInstructor.getEmail());
					 
					/*Query q = session.createQuery("from Student");
					List<Student> students = q.list();
					 for(Student s : students) {
						 System.out.println(s);
					 }*/
					
					//look ==> https://www.youtube.com/watch?v=RuBfc8kfSas
					Query q = session.createQuery("from User where email= :xxx");
					q.setParameter("xxx",email);
					user = (User) q.uniqueResult();
					
					
					
					
						
					
					// commit transaction
					session.getTransaction().commit();
					
					
				}
                                catch(Exception ex){
                                return user;
                                }
				
				finally {
					factory.close();
				}
		        return user;
	}

}
