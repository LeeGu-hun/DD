
<%@ page language="java" pageEncoding="UTF-8"
    contentType="text/html; charset=UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<style>
h1{text-align: center;} 
.scroll-sidebar{ background-color: #BDBDBD; height: 50px; margin-bottom: 0px;}
.sidebar-item{list-style: none; display: inline-block; padding: 15px;}
.middle{height: 700px; background-color: blue;}

li span{display: table-cell;
padding-left: 200px;
text-align: left;
vertical-align: middle;}
</style>
<script type="text/javascript">

</script>
</head>
<body>
<h1>드론 상태 확인</h1>
<div class="scroll-sidebar">
	
		<ul>
			<li class="sidebar-item">
			<span>드론no</span>
		</li>
		<li class="sidebar-item">
			<span>영업소no</span>
		</li>
		<li class="sidebar-item">
			<span>드론 작동</span>
		</li>
		<li class="sidebar-item">
			<span>드론 동작 현황</span>
		</li>
		<li class="sidebar-item">
			<span>드론 상태</span>
		</li>
		</ul>
		<div class="middle" style="margin-top: 0px;">
		</div>
		
		<div class="footer">
		<p style="text-align: right; margin-right: 100px; font-size: 30px;">합계 :
		<input type="text" style="height: 35px;"/>
		</p>
	
		
		</div>
	
		
		
	
	


</div>
		


</body>
</html>