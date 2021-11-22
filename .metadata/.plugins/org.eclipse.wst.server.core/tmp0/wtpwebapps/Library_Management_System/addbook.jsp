<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<style type="text/css">
		.container{
			margin-top: 8%;
			width: 400px;
			border: ridge 1.5px white;
			padding: 20px;
		}
		
	</style>



</head>

<body class="bodyContent">

<div class="navBars">
        
        <nav>
            
            
            <form action="profile" method="post">
            <input type="submit" value="Home" class="fa fa-home" name="submit">
            </form>
            
          </nav>
        </div>
	
        
    

<main class="site-wrapper">
        <div class="pt-table desktop-768">
          <div class="pt-tablecell page-home relative" style="background-image: url(https://images.unsplash.com/photo-1486870591958-9b9d0d1dda99?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80);
          background-position: center;
          background-size: cover;">
                          <div class="overlay"></div>
      
                          <div class="container">
                              <div class="row">
                                  <div class="col-xs-12 col-md-offset-1 col-md-10 col-lg-offset-2 col-lg-8">
                                      
      
                                      <div class="hexagon-menu clear">
                                          <div>
                                            <div class="container">
                                                <h2 class="headerSignup">Add new Book</h2>
                                            <form action="book" method="post" enctype="multipart/form-data">
                                                <div class="form-group">
                                            <label for="firstname">Book code</label>
                                            
                                            <input type="text" name="bcode" id="code" class="form-control" placeholder="Enter Book code" required><br>
                                          </div>
                                          
                                          <div class="form-group">
                                            <label for="Password">Book title</label>
                                            <input type="text" name="title" id="code" class="form-control" placeholder="Enter Book title" required><br>
                                          </div>
                                          <div class="form-group">
                                            <label for="Password">Author name</label>
                                            <input type="text" name="author" id="author" class="form-control" placeholder="Enter Author name" required><br>
                                          </div>
                                          <div class="form-group">
                                            <label for="Password">Description</label>
                                            <textarea type="text" name="description" id="description" class="form-control" rows="5" cols="60" placeholder="Enter Description"></textarea><br>
                                          </div>
                                          <div class="form-group">
                                            <label for="Password">Upload Book image</label>
                                            <input type="file" name="photo" id="photo" required><br>
                                          </div>
                                          <input type="submit" name="submit" value="Add new Book" class="btn btn-primary">
                                          
                                        </form>
                                        
                                        <h3><%=request.getAttribute("Message")%></h3>
                                        </div>
                                          </div>
                                          
                                          
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
        </main>




</body>
</html>