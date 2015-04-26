
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
   <a href="order?action=others">Cart</a >  |   <a a href="#">My Orders</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="SignInController?action=loginPage">Log in</a> <br />
        <a href="SignInController?action=signupPage">Sign Up</a>
    </div>
</div>
<div class="bodymain">
    <div style="float: left">
    <h1>Enter Contact Details !!</h1>
    <form action="ConfirmationController" method="POST">
        <table>
            <c:if test="${sessionScope.typeOfUser != 'RegisteredUser'}">
            <tr>
                <td>Enter email id:</td>
                <td> <input type="text" name="emailId" value="" size="50" /> </td>
            </tr>
            <tr>
                <td>Enter name of the person:</td>
                <td> <input type="text" name="Nameofperson" value="" size="50" /> </td>
            </tr>
            </c:if>
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
