
<%-- 
    Document   : menu
    Created on : Mar 26, 2015, 3:20:53 PM
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
        <a id="current" href="index.jsp">Home</a> <br />
    </div>
</div>
<div class="bodymain">
    <div style="float: left">
    <h1>"Select your Take Away Order !!"</h1>
    <form action="TakeAwayController" method="POST">
    <input type="checkbox" name="menuItems" value="Salad" />Salads <br/>
    <input type="checkbox" name="menuItems" value="Soup" />Soups <br/>
    <input type="checkbox" name="menuItems" value="SoftDrink" />Drinks <br/>
    <input type="checkbox" name="menuItems" value="Manchuria" />Chinese <br/>
    <input type="checkbox" name="menuItems" value="ChilliPanner" />Indian<br/>
    
    </br>
    <input type="submit" value="Update Cart" name="updateTAW" />
    </br>
    </br>
    
    </form>
    <form action="TakeAwayController" method="post">
        <input type="hidden" value="confirmTAW" name="confirmTAW">
        <input type="submit" value="Save Cart" name="save menu" />
    </form>
    </div>
    <div style="float: left; margin-left: 50px; margin-top: 20px; border: 1px solid black;">
        
        <h3>Selected Items</h3>
        <c:forEach var="c" items="${selectedMenu}">
            ${c}<br/>
        </c:forEach> 
          
    </div>
</div>
    
    
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>
