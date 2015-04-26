<%-- 
    Document   : signin
    Created on : Apr 4, 2015, 6:04:52 PM
    Author     : SRINEAL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<div>


<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="SignInController?action=loginPage">Log in</a> <br />
        <a id="current" href="index.jsp">Home</a> <br />
    </div>
</div>
<div class="bodymain">
    
    <h2>${message}</h2>
    <c:if test="${signType == 'signup'}">
    <form action="SignInController" method="POST">
        <table>
            <tr>
                <td>First Name</td>
                <td><input type="text" value="" name="firstName" required/></td><br/>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" value="" name="lastName" required/></td><br/>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td><input type="number" value="" name="phoneNumber" required/></td><br/>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" value="" name="email" required/></td><br/>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" value="" name="password" required/></td><br/>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><input type="password" value="" name="confirmPassword" required/></td><br/>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <input type="hidden" value="signup" name="action"/>
                <td><input type="submit" value="Signup" /></td><br/>
            </tr>
        </table>
    </form>
    </c:if>
    
    <c:if test="${signType == 'login'}">
    <form action="SignInController" method="POST">
        <table>
            <tr>
                <td>Email</td>
                <td><input type="email" value="" name="email" required/></td><br/>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" value="" name="password" required/></td><br/>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <input type="hidden" value="login" name="action"/>
                <td><input type="submit" value="Login" /></td><br/>
            </tr>
        </table>
    </form>
    </c:if>
    
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>

