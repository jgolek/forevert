$( document ).ready(function() {
	
    $( "#saveButton" ).click(function( event ) {
	
    	$.ajax({
		    type: "PUT",
		    url: location.pathname,
		    contentType: "application/json",
		    data: JSON.stringify( { "content": editor.getValue() } )
		}).done(function(){
			window.location.href = location.pathname
		});
	});
    
});

