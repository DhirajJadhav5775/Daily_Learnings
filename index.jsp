<%@ page import = "java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This Is First JSP Program</h1>
	<%!    //this is an declarative tag
	//used to declare variables and methods
			
			int squaremethod(int iNo)
			{
				int square = iNo * iNo;
				return square;
			}
	%>
	<%		//this is an scriptlet tag used to embed java code 
			int iNo = 12;
			int result = squaremethod(iNo);
			out.println("Square Is: " + result + "<br>");
			
			if(result % 2 == 0)
			{
				out.println("Square Is Even");
			}
			else
			{
				out.println("Square Is Odd");
			}
	%>
</body>
</html>