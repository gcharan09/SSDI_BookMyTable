
<%-- 
    Document   : index
    Created on : Feb 23, 2015, 10:15:40 AM
    Author     : SRINEAL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<div>
<div class="navigate">
    <div id="navdiv">
       <a href="order?action=others">Cart</a >  |   <a a href="#">My Orders</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="SignInController?action=loginPage">Log in</a> <br />
        <a href="SignInController?action=signupPage">Sign Up</a> <br />
        <!-- <a href="about.jsp">About</a> <br />
        <a href="contactUs.jsp">Contact Us</a> <br /> -->
    </div>
</div>
<div class="bodymain">
    
    <h1>"Dine in or Take away !!"</h1>
    <form action="DiningController" method="POST">
        <input type="hidden" value="DineIn" name="action"/>
        <input type="submit" value="Dine In" />
    </form>
    </br>
    
    <form action="DiningController" method="POST">
        <input type="hidden" value="TakeAway" name="action"/>
        <input type="submit" value="Take Away" />
    </form>
    
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>

