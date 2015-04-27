<%-- 
    Document   : allOrders
    Created on : Apr 26, 2015, 10:15:13 PM
    Author     : gcharan09
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
        <a id="current" href="index.jsp">Home</a> <br />
    </div>
</div>
<div class="bodymain">
    
        <h3>All Orders:</h3>
        <c:forEach var="c" items="${allOrders}">
            <a href="AdminController?action=getDetails&orderNumber=${c}">${c}</a><br/>
        </c:forEach> 
</div>    
</div>
    </div>
    
<%@ include file="footer.jsp" %>