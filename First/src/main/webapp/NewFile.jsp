<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //여기에 자바를 마음껏 쓸 수 있어요...
    //구구단을 찍어봅시다.
    //2단
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
첫번째 jsp 파일입니다. <br>
<%
for(int i = 1; i<10; i++){
	//System.out.println(2*i);
	//out.println(2*i);
	%>
	2 * <%=i %> = <%= 2*i %><br>
	<%
}
%>
</body>
</html>