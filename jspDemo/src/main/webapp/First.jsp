<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>
<!-- example od declaration tag -->
<%!
int a=10;
int b=20;
String s="swastin sahoo";
public int sum(int a,int b){
	return a+b;
}
public String rev(String s)
{
StringBuilder sb =new StringBuilder(s);
return sb.reverse().toString();
}

%>
<!-- example of scriplet tag -->
<%
out.println(a);
out.println(sum(10,20));
out.println(rev("swastin"));
%>
<!-- example of expression tag -->

<h2> The value of a is <%= a %></h2>

</body>
</html>