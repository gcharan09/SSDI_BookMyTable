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
        <a id="current" href="../home.jsp">Home</a> <br />
        <a href="catalog">Catalog</a> <br />
        <a href="about.jsp">About</a> <br />
        <a href="../contactUs.jsp">Contact Us</a> <br />
    </div>
</div>
<div class="bodymain">

<h1>Login Form - Error</h1>
&nbsp;
<h2> If You have come to this page, 
    either the credentials are wrong or 
    You don't have rights to login!</h2>
&nbsp;
<p>You did not log in successfully.</p>
&nbsp;
<p>Please check your username and password and try again.</p>

&nbsp;
<h2> Click on 'Admin' to Login again</h2>
<!--<input type="button" onclick="adminback()" value="Login Again">-->


</div>
 <%@ include file="../footer.jsp" %>
