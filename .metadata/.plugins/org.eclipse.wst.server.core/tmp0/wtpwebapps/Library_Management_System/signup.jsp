<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
            
            <button class="btn"><a class="fa fa-home" href="index.jsp">Home</a></button>
            
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
                                                <h2 class="headerSignup">Registration Form</h2>
                                            <form action="register" method="post">
                                                <div class="form-group">
                                            <label for="firstname">User Name</label>
                                            <input type="text" class="form-control" id="exampleInputfirstname" name="username" required>
                                          </div>
                                          <div class="form-group">
                                            <label for="Email1">Email address</label>
                                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" required>
                                          </div>
                                          <div class="form-group">
                                            <label for="phoneno">Phone Number</label>
                                            <input type="number" class="form-control" id="exampleInputphoneno" name="phone" required>
                                          </div>
                                          
                                          <div class="form-group">
                                            <label for="Password">Password</label>
                                            <input type="password" class="form-control" id="exampleInputPassword" name="password" required>
                                          </div>
                                          <button type="submit" class="btn btn-primary" name="create">Sign up</button>
                                        </form>
                                        
        								
    									
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