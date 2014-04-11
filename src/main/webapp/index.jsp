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
	            <li class="active"><a href="#">View</a></li>
	          </ul>
	      
		        <ul class="nav navbar-nav navbar-right">
		       	  <li><form action="#"><a type="button" class="btn btn-primary btn-sm navbar-btn">Run Test</a></form></li>
			      <li><a href="/edit.jsp">Edit</a></li>
			    </ul>
			    <!-- why? -->
			    <ul></ul>
		     </div><!--/.nav-collapse -->
	     </div>
      </div>
    
    <div class="container">
    	<div class="row">
    	  <div class="col-xs-12 col-md-2" style="padding-right:0px" >
				<%@include file="views/navigation.jsp" %>
    	  </div>
    	  <div class="col-md-8" style="padding-left:40px; border-left: 1px solid #ccc;">
    	    <h4> Request  </h3>
    	    <table class="table">
			<tbody>
			 <tr class="odd">
			 	<td>GET</td> <td>http://{host}/</td> </tr>
			</tbody>
			</table>

    	    <h4> Response </h3>
    	    <table class="table">
			<tbody>
			 <tr class="odd">
			 	<td> payload </td> <td> { user: 'jacek' } </td> </tr>
			</tbody>
			</table>
    	  </div>
		</div>
    </div>
    
    <script src="js/jquery-1.11.0.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>