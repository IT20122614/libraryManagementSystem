<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Return book</title>
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
                                      
										<table>
										<c:forEach var = "cus2" items="${borrow}">
										
											<tr class="paddingstyle2">
												<td style="padding: 10px;">
                                                	
                                                	<img src="data:image/png;base64,${cus2.base64Image}" width="280" height="400" alt="image">
                                            	</td>
                                            	<th style="padding: 40px;">
                                                	<h2 class="styleTextss" style="font-weight: bold;">${cus2.title}</h2>
                                                	<h3 class="styleTextss">${cus2.author}</h3>
                                                	<p class="imageBook">${cus2.description} </p>
                                                	<form action="return" method="post">
                                                	Code: 
                                                	<input type="text" name="code" value="${cus2.code}"><br>
                                                	The date book should be returned
                                                	<input type="date" name="rdate" value="${cus2.date}">
                                                	<input type="submit" name="submit" value="Confirm return" class="btn btn-outline-success">
                                                	</form>
                                                	<p style="color: red;">*Please return your Book</p>
                                            	</th>
											</tr>
											<tr style="padding: 30px;">
                                            <td></td>
                                            <td></td>

                                        </tr>
                                        <tr style="padding: 30px;">
                                            <td></td>
                                            <td></td>

                                        </tr>
                                        </c:forEach>
										</table>
                                      
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
        </main>

</body>
</html>