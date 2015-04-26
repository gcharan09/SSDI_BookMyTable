
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
        <a id="current" href="index.jsp">Home</a> <br />
    </div>
</div>
<div class="bodymain">
    <div style="float: left">
        <a href="DiningController?action=DineIn"><<= Click here to change date and time </a>
    <h1>"Select your Order !!"</h1>
    <form action="MenuController" method="POST">
    <input type="checkbox" name="menuItems" value="Salad" />Salads <br/>
    <input type="checkbox" name="menuItems" value="Soup" />Soups <br/>
    <input type="checkbox" name="menuItems" value="SoftDrink" />Drinks <br/>
    <input type="checkbox" name="menuItems" value="Manchuria" />Chinese <br/>
    <input type="checkbox" name="menuItems" value="ChilliPanner" />Indian<br/>
    
    </br>
    <input type="submit" value="Update Cart" name="update" />
    </br>
    </br>
    
    </form>
    <form action="MenuController" method="post">
        <input type="hidden" value="confirm" name="confirm">
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
