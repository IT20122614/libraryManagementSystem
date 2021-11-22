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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


</head>
<body class="bodyContent">
<c:forEach var = "cus" items="${userD}">

    <div class="navBars">
        
        <nav>
            
            
            
          </nav>
        </div>
    
    
    

    <main class="site-wrapper">
        <div class="pt-table desktop-768">
          <div class="pt-tablecell page-home relative" style="background-image: url(https://images.unsplash.com/photo-1486870591958-9b9d0d1dda99?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80);
          background-position: center;
          background-size: cover;">
                          <div class="overlay"></div>
      
                          <div>
                              <div class="row">
                                  
                                  
                                  <div class="hexagon-menu clear">
                                  
                                  <div class="hexagon-item">
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <a  class="hex-content">
                                                  <span class="hex-content-inner">
                                                      <span class="icon">
                                                          <i class="fa fa-universal-access"></i>
                                                      </span>
                                                      <form action="profileEdit" method="post">
                                              			<input type="submit" value="Edit Profile" name="submit" style="background-color: transparent; color: white; border-style: none;">
                                              		</form>
                                                  </span>
                                                  <svg viewBox="0 0 173.20508075688772 200" height="200" width="174" version="1.1" xmlns="http://www.w3.org/2000/svg"><path d="M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z" fill="#1e2530"></path></svg>
                                              </a>
                                          </div>
                                  <div class="hexagon-item">
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <a  class="hex-content" href="findbook.jsp">
                                                  <span class="hex-content-inner">
                                                      <span class="icon">
                                                          <i class="fa fa-life-ring"></i>
                                                      </span>
                                                      <span class="title">find Book</span>
                                                  </span>
                                                  <svg viewBox="0 0 173.20508075688772 200" height="200" width="174" version="1.1" xmlns="http://www.w3.org/2000/svg"><path d="M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z" fill="#1e2530"></path></svg>
                                              </a>
                                          </div>
                                  	
                                  	
                                          <div class="hexagon-item">
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <a  class="hex-content" href="borrow.jsp">
                                                  <span class="hex-content-inner">
                                                      <span class="icon">
                                                          <i class="fa fa-clipboard"></i>
                                                      </span>
                                                      <span class="title">Borrow</span>
                                                  </span>
                                                  <svg viewBox="0 0 173.20508075688772 200" height="200" width="174" version="1.1" xmlns="http://www.w3.org/2000/svg"><path d="M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z" fill="#1e2530"></path></svg>
                                              </a>
                                          </div>
                                           <div class="hexagon-item">
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              
                                              <a  class="hex-content">
                                                  <span class="hex-content-inner">
                                                      <span class="icon">
                                                          <i class="fa fa-clipboard"></i>
                                                      </span>
                                                     
                                                      <form action="borrowed" method="post">
                                              			<input type="submit" value="Return" name="submit" style="background-color: transparent; color: white; border-style: none;">
                                              			</form>
                                                  </span>
                                                  <svg viewBox="0 0 173.20508075688772 200" height="200" width="174" version="1.1" xmlns="http://www.w3.org/2000/svg"><path d="M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z" fill="#1e2530"></path></svg>
                                              </a>
                                          </div>
                                          <div class="hexagon-item">
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              <div class="hex-item">
                                                  <div></div>
                                                  <div></div>
                                                  <div></div>
                                              </div>
                                              
                                              <a  class="hex-content">
                                                  <span class="hex-content-inner">
                                                      <span class="icon">
                                                          <i class="fa fa-clipboard"></i>
                                                      </span>
                                                     
                                                      <div class="stats">
                                                        <form action="display" method="post">
                                                        <input type="submit" value="View all books" name="submit" style="background-color: transparent; color: white; border-style: none;">
                                                        </form>
                                                    </div>
                                                  </span>
                                                  <svg viewBox="0 0 173.20508075688772 200" height="200" width="174" version="1.1" xmlns="http://www.w3.org/2000/svg"><path d="M86.60254037844386 0L173.20508075688772 50L173.20508075688772 150L86.60254037844386 200L0 150L0 50Z" fill="#1e2530"></path></svg>
                                              </a>
                                          </div>
                                  
                                  </div>
                                      
      
                                    <div class="container d-flex justify-content-center align-items-center">
                                        <div class="card">
                                            <div class="upper"> <img src="https://i.imgur.com/Qtrsrk5.jpg" class="img-fluid"> </div>
                                            <div class="user text-center">
                                                <div class="profile"> <img src="R.png" class="rounded-circle" width="80"> </div>
                                            </div>
                                            <div class="mt-5 text-center">
                                                <h4 class="mb-0">${cus.username }</h4> <span class="text-muted d-block mb-2">${cus.email }</span>
                                                <form action="logout" method="post">
                                                	<input type="submit" class="btn btn-primary btn-sm follow" value="logout">
                                                </form>
                                                 
                                                 
                                                <div class="d-flex justify-content-between align-items-center mt-4 px-4">
                                                    <div class="stats">
                                                        <h6 class="mb-0">Phone</h6> <span>${cus.phone }</span>
                                                    </div>
                                                    
                                                    
                                                    
                                                    
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                  
                              </div>
                          </div>
                      </div>
                  </div>
        </main>
</c:forEach>
</body>
</html>