
<%-- 
    Document   : dinein
    Created on : Mar 23, 2015, 7:15:17 PM
    Author     : SRINEAL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<%@page contentType="text/html" import="java.util.*" %>

<div>
<div class="navigate">
    <div id="navdiv">
        <a href="order?action=others">Cart</a >  |   <a a href="#">My Orders</a>  |   <a a href="Admin.jsp">Manager</a>
    </div>
</div>

<div>
<div class="body">
    <div class="leftbody">
        <a id="current" href="index.jsp">Home</a> <br />
<!--        <a href="about.jsp">About</a> <br />
        <a href="contactUs.jsp">Contact Us</a> <br />-->
    </div>
</div>
<div class="bodymain">
    <h1>"Dine in page !!"</h1>
    <p>Please select the Time for your Reservation: 
        <% String timee= new java.util.Date().toString().substring(11, 16);
            int hrs= Integer.parseInt(timee.substring(0,2));
            int mins=Integer.parseInt(timee.substring(3, 5));
            if(mins<30){
                mins=30;
            }else {
                hrs=hrs+1;
                mins=30;
            }
            String minTime=hrs+":"+mins;
            %></p>
    <form action="menu.jsp">
    <input type="text" name="date17" id="scrollDefaultExample" value="">
			<script type="text/javascript">
                            <c:if test="${sessionScope.typeOfUser != 'RegisteredUser'}">
            $('#scrollDefaultExample').timepicker({ 
                                    'minTime': "<%=minTime%>",
                                    'maxTime': '10:30pm',
                                    'scrollDefault': 'now'
                                });
                            </c:if>
                            <c:if test="${sessionScope.typeOfUser == 'RegisteredUser'}">
                                $(function(){
					$('*[name=date17]').appendDtpicker({
						"inline": true,
						"futureOnly": true,
						"minTime":"09:00",
						"maxTime":"22:00"
					});
				});
                            </c:if>
			</script>
    <input type="hidden" name="action" value="dateAndTime">
    <input type="submit" value="submit" />
    </form>
</div>
    
</div>
    </div>
    
<%@ include file="footer.jsp" %>
