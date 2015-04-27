<%-- 
    Document   : admins
    Created on : Apr 14, 2015, 1:08:52 PM
    Author     : SRINEAL
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
        <a href="contactUs.jsp">Contact Us</a> <br />
    </div>
</div>
<div class="bodymain">
    <h1>
        Administrator Menu
    </h1>
    
    <form  action="AdminController" method="POST">
        <input type="hidden" name="action" value="viewOrders"/>
        <input class="adminbtn" type="submit" value="Display All Orders"/>
    </form>
        
        <p> You are logged in as a Administrator</p>
    <div class="adminout">
            <form action="AdminController" method="post">
                <input type="hidden" name="action" value="Logout"/>
            <input type="submit" value="Logout" class="adminlogout">
        </form>
        </div>
</div>
</div>
    </div>
    
<%@ include file="../footer.jsp" %>