<%-- 
    Document   : Login_Registration
    Created on : Sep 25, 2019, 9:14:23 AM
    Author     : sasadara_j
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
           <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>
                .......Home Page....
            </title>
    </head>
<body>
    <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-4 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <div class ="well">
	
         <s:actionerror />
	<s:form class="form-signin" id="idLoginForm" action="loginUser" >
             <div class="form-label-group">
		<s:textfield key="email"  class="form-control" placeholder="Email address" label="Email Address"  />
             </div>
             <div class="form-label-group">
                 <s:password key="password" placeholder="Password" class="form-control" label="Password" />
             </div>
	         <s:submit  value="Login" />
	</s:form>
    </div>
    </div>
    </div>
   
       <div class="card card-signin my-5">
         <div class="card-body">
           <h5 class="card-title text-center">Sign Up</h5>
           <div class ="well">
                
               <s:actionmessage />
                <s:form  id="idLoginForm" action="RegistrationAction" >
                     <div class="form-label-group">
                        <s:textfield  key="user.userId"  class="form-control" placeholder="Email address" label="Email Address"  />
                     </div>
                     <div class="form-label-group">
                         <s:password  key="user.password" placeholder="Password" class="form-control" label="Password" />
                     </div>
                     <div class="form-label-group">
                        <s:textfield  key = "user.role" class="form-control" placeholder="User Role" label="User Role"  />
                     </div>
 
                         <s:submit  value="Register" />
                </s:form>
           </div>
         </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
