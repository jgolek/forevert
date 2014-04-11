<!DOCTYPE html>
<html lang="en">
  <%@include file="views/header.jsp" %>
  <body>
  
   <div class="navbar navbar-default" >
      	<div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">foreverT</a>
	        </div>
	        
	        <div class="collapse navbar-collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="#">Edit</a></li>
	          </ul>
	      
		        <ul class="nav navbar-nav navbar-right">
		       	  <li><form action="/index.jsp"><a type="button" class="btn btn-primary btn-sm navbar-btn">Save</a></form></li>
			      <li><a href="/index.jsp">View</a></li>
			    </ul>
			    <!-- why? -->
			    <ul></ul>
		     </div><!--/.nav-collapse -->
	     </div>
      </div>
    
    <div class="container">
    	<div class="row">
    	  <div class="col-xs-12 col-md-2" style="padding-right:20px; border-right: 1px solid #ccc;">
				<%@include file="views/navigation.jsp" %>
    	  </div>
		</div>
    </div>
    
    <script src="js/jquery-1.11.0.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>