<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    //DB에 가서 작업하도록 하는 역할을 하는 페이지
    //1. 드라이버로드
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //2. 연결설정
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Connection conn = DriverManager.getConnection(url, "yh", "1234");
    //3. 질의문 준비
    String sql = "select * from id=? and password=?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    
    //4. 질의문 세팅
    stmt.setString(1, id);
    stmt.setString(2, password);
    
    //5. 질의문 실행
    ResultSet rs = stmt.executeQuery();
    if(rs.next()){
    	//DB에서 성공적으로 데이터가 가져온경우
    	//로그인 처리를 해야한다.
    	session.setAttribute("id", id);
    	session.setAttribute("name", rs.getString("name"));	
    	//로그인이 잘 되엇으므로 다음 페이지(게시목록)로 이동
    	response.sendRedirect("getBoardList.jsp");
    }else{
    	//DB에서 데이터를 가져오지 못한 경우
    	//아이디
    	response.sendRedirect("getBoardList.jsp");
    }
    //6. 닫기
    stmt.close();
    conn.close();
    
    //화면전환
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>