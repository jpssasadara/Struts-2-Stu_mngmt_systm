/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jps.sasadara.interceptor;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

public class LoginInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
               
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> sessionAttributes = invocation
				.getInvocationContext().getSession();

		if (sessionAttributes == null
				|| sessionAttributes.get("loginId") == null) {
			return "login";
		} else {
			if (!((String) sessionAttributes.get("loginId")).equals(null)) {
				return invocation.invoke();
			} else {
				return "login";
			}
		}

	}

}
