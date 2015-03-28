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
        <a href="#">Sign In</a>  |  <a href="order?action=others">Cart</a >  |   <a a href="#">My Orders</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="home.jsp">Home</a> <br />
        <a href="catalog">Catalog</a> <br />
        <a href="about.jsp">About</a> <br />
        <a href="contactUs.jsp">Contact Us</a> <br />
    </div>
</div>
<div class="bodymain">
    <form action="" method="POST">
        <input type="hidden" value="DineIn" name="action"/>
        <input type="submit" value="Sign up" />
    </form>
    <form action="" method="POST">
        <input type="hidden" value="DineIn" name="action"/>
        <input type="submit" value="Log in" />
    </form>
    <h1>"Dine in or Take away !!"</h1>
    <form action="DiningController" method="POST">
        <input type="hidden" value="DineIn" name="action"/>
        <input type="submit" value="Dine In" />
    </form>
    
    <form action="DiningController" method="POST">
        <input type="hidden" value="TakeAway" name="action"/>
        <input type="submit" value="Take Away" />
    </form>
    
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>

