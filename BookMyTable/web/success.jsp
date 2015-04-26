
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
        <a href="order?action=others">Cart</a >  |   <a a href="#">My Orders</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="home.jsp">Log in</a> <br />
        <a href="catalog">Sign Up</a> <br />
    </div>
</div>
<div class="bodymain">
    <h3>"${message}"</h3>
    
    <c:if test="${displayMenu == 'true'}">
        <h3>Menu Selected</h3> <br/>
        <table>
            <tr>
                <th>Menu</th>
                <th>Quantity</th>
            </tr>
        <c:forEach var="item" items="${menuDetails}">
                <tr>
                    <td>${item.menu}</td>
                    <td>${item.quantity}</td>
                </tr>
            
        </c:forEach>
        </table>
    </c:if>

</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>