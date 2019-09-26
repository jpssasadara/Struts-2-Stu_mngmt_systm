<%@page import="java.util.Random"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       <head>
  <title>Hello</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
    </head>
    <body>
        <div class="container">
            <h1>
                Hello <s:property value="%{#session['loginId']}"/><br>
                  Your Role :. <s:property value="%{#session['object']}"/><br>
                <a href="<s:url action="logOut"/>">LogOut</a>
            </h1>  
        
        </div>
   <div class="container">   
       
        <s:set name="webFramework" value="framework"/>

        <s:if test="%{#webFramework=='Struts 2'}">
                This is Struts 2
        </s:if>
        <s:elseif test="%{#webFramework=='Struts 1'}">
            This is Struts 1
        </s:elseif>
        <s:else>
            Other framework
        </s:else>  
 
  <h3>Student Details</h3>
  <table class="table">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        
         <th></th>
        
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Default</td>
        <td>Defaultson</td>
        <td>def@somemail.com</td>
        <td>
            <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>      
      <tr class="success">
        <td>Success</td>
        <td>Doe</td>
        <td>john@example.com</td>
        <td>
            <a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="uemail"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="deleterecord.action?uemail=<s:property value="uemail"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>
      <tr class="danger">
        <td>Danger</td>
        <td>Moe</td>
        <td>mary@example.com</td>
        <td>
            <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>
      <tr class="info">
        <td>Info</td>
        <td>Dooley</td>
        <td>july@example.com</td>
        <td>
            <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>
      <tr class="warning">
        <td>Warning</td>
        <td>Refs</td>
        <td>bo@example.com</td>
        <td>
            <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>
      <tr class="active">
        <td>Active</td>
        <td>Activeson</td>
        <td>act@example.com</td>
        <td>
            <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-update">Update</button>
	    </a>
	    <a href="CRUD.action?role=<s:property value="%{#session['object']}"/>">
		<button class="button-delete">Delete</button>
            </a>
	</td>
      </tr>
    </tbody>
  </table>
</div>
            
    </body>
</html>

