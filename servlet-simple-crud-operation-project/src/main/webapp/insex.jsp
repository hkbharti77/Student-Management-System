<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index - Page</title>
</head>
<body>
	<h3>This is My First Page with Servlet API</h3>

	<h2>Even or odd Number</h2>

	<form method="post">
		Enter a number: <input type="number" name="number" required> <br>
		<input type="submit" value="check">
	</form>

	<%--
	
	--%>
	<%
	 String numberStr = request.getParameter("number");

    if (numberStr != nullxc ) {
        
            int num = Integer.parseInt(numberStr);
            String res = (num % 2 == 0) ? "Even" : "Odd";
            out.println("<h3>" + num + " : " + res + "</h3>");
        
    }
	%>

	<%-- <h2>Factorial by 7</h2>--%>

	<%--<%
	 int num = 7;
	int fact = 1;
	for(int i=1;i<=num;i++){
		fact = fact * i;
	}
	--	<h3>Factorial 7 : <%= fact %></h3>
	%>
	
	<h2> Loop to print Number from 0 to 30 with colour</h2>
	<%
	 int i =0;
	while(i<= 30){
		if(i % 2 == 0){
			out.println("<h6 style='color : red;'>" + i + "<h6>");
		}
		else {
			out.println("<h6 style = 'color : green;'>" + i + "<h6>");
		}
		i++;
	}
	--%>
</body>
</html>