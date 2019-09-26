/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 *
 * @author sasadara_j
 */
public class RoleInterceptor  extends ActionSupport implements Interceptor{
    private static final long serialVersionUID = 1L;
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
         //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        String role = ServletActionContext.getRequest().getParameter("role");
        if(role.equals("s")){
         return "nopermission";
        }else{
            return ai.invoke();
           
        }
       
    }
    
}
