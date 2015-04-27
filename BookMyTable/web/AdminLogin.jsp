<%-- 
    Document   : adminLogin
    Created on : Nov 26, 2014, 1:40:34 PM
    Author     : Venkatesh
--%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
<div class="navigate">
    <div id="navdiv">
        <a href="#">Sign In</a>  |  <a href="order?action=others">Cart</a >  |   <a  href="Admin.jsp">Admin</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="home.jsp">Home</a> 
        <a href="catalog">Catalog</a> 
        <a href="about.jsp">About</a> 
        <a href="contactUs.jsp">Contact Us</a> 
    </div>
</div>
<div class="bodymain">
    <h2>Admin Login</h2>

<form action="j_security_check" method="post">
    
    <input type="text" name="j_username" placeholder="UserName"><br>
    
    <input type="password" name="j_password" placeholder="Password"><br>
    <label>&nbsp;</label>
    <input type="submit" value="Login">
</form>
   
           <h2> ${amessage}</h2>
          
</div>
          <%@ include file="../footer.jsp" %>
    