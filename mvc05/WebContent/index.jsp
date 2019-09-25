<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<div>
		<div id="header">
			<h1>비트교육센터</h1>
		</div>
		<div id="menu">
		<% String root=request.getContextPath(); %>
			<ul>
				<li><a href="<%=root %>/index.jsp">HOME</a></li>
				<li><a href="<%=root %>/intro.jsp">INTRO</a></li>
				<li><a href="<%=root %>/list.jsp">BBS</a></li>
				<li><a href="<%=root %>/login.jsp">LOGIN</a></li>
			</ul>
		</div>
		<div id="content">
			<h2>리스트페이지</h2>
			<table>
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>날짜</th>
						<th>금액</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</div>
		<div id="footer">
		
		</div>
	</div>
</body>
</html>