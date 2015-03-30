<%-- 
    Document   : dinein
    Created on : Mar 23, 2015, 7:15:17 PM
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
<<<<<<< HEAD
        <a id="current" href="home.jsp">Log in</a> <br />
        <a href="catalog">Sign Up</a> <br />
=======
        <a id="current" href="home.jsp">Home</a> <br />
        <a href="catalog">Catalog</a> <br />
>>>>>>> origin/master
        <a href="about.jsp">About</a> <br />
        <a href="contactUs.jsp">Contact Us</a> <br />
    </div>
</div>
<div class="bodymain">
    <h1>"Dine in page !!"</h1>
    <p>Please select Date and time:</p>
<<<<<<< HEAD
    <form action="menu.jsp">
=======
    <form actiopn="DiningController">
>>>>>>> origin/master
    <input type="text" name="date17" value="">
			<script type="text/javascript">
				$(function(){
					$('*[name=date17]').appendDtpicker({
						"inline": true,
						"futureOnly": true,
						"minTime":"09:00",
						"maxTime":"22:00",
                                                "maxDate":"+1M"
					});
				});
			</script>
    <input type="hidden" name="action" value="dateAndTime">
    <input type="submit" value="submit" />
    </form>
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>
