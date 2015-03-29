<%-- 
    Document   : confirmation
    Created on : Mar 28, 2015, 11:54:12 AM
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
        <a id="current" href="home.jsp">Log in</a> <br />
        <a href="catalog">Sign Up</a> <br />
        <a href="about.jsp">About</a> <br />
        <a href="contactUs.jsp">Contact Us</a> <br />
    </div>
</div>
<div class="bodymain">
    <div style="float: left">
    <h1>"Select Menu!!"</h1>
    <form action="ConfirmationController" method="POST">
        <table>
            <tr>
                <td>Enter email id:</td>
                <td> <input type="text" name="emailId" value="" size="50" /> </td>
            </tr>
            <tr>
                <td>Enter name of the person:</td>
                <td> <input type="text" name="Nameofperson" value="" size="50" /> </td>
            </tr>
            <tr>
                <td>Number of attendees:</td>
                <td> <input type="text" name="attendees" value="" size="10" /> </td>
            </tr>
            <tr>
                <td></td>
                <td> <input type="submit" value="send confirmation" name="sendConfirmation" /> </td>
            </tr>
        
    
    </table>
    </form>
    
    </div>
    
    <div style="float: left; margin-left: 50px; margin-top: 20px; border: 1px solid black;">
        
        <h3>Selected menu:</h3>
        <c:forEach var="c" items="${selectedMenu}">
            ${c}<br/>
        </c:forEach> 
            <br/> <a href="menu.jsp">Click here to edit menu</a>
            <br/> <a href="dinein.jsp">Click here to edit Time and date</a>
    </div>
</div>
    
    
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>