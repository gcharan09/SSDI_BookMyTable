<%-- 
    Document   : success
    Created on : Mar 28, 2015, 12:47:45 PM
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
    <h3>"${message}"</h3>
    
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>