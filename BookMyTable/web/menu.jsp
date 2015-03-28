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
    <div style="float: left">
    <h1>"Select Menu!!"</h1>
    <form action="MenuController" method="POST">
    <input type="checkbox" name="menuItems" value="Salad" />Salad <br/>
    <input type="checkbox" name="menuItems" value="Soup" />Soup <br/>
    <input type="checkbox" name="menuItems" value="SoftDrink" />Soft drink <br/>
    <input type="checkbox" name="menuItems" value="Manchuria" />Manchuria <br/>
    <input type="checkbox" name="menuItems" value="ChilliPanner" />Chilli panner <br/>
    
    <input type="submit" value="Update Menu" name="update" />
    
    </form>
    <form action="MenuController" method="post">
        <input type="hidden" value="confirm" name="confirm">
        <input type="submit" value="save menu" name="save menu" />
    </form>
    </div>
    
    <div style="float: left; margin-left: 50px; margin-top: 20px; border: 1px solid black;">
        
        <h3>Selected menu:</h3>
        <c:forEach var="c" items="${selectedMenu}">
            ${c}<br/>
        </c:forEach> 
          
    </div>
</div>
    
    
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>
