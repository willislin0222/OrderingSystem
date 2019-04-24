<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户基本信息</title>
</head>
<body>
  <form name="userInfo" action="${pageContext.request.contextPath}/staff/updateStaff" method="post">
	<table>	
	  <tr>
	   <td>員工編號：</td>
	   <td><input type="text" name="sta_no" readonly value="${requestScope.staffVO.sta_no }"/></td>
	  </tr>  
	  <tr>
	   <td>員工姓名：</td>
	   <td><input type="text" name="sta_name" readonly value="${requestScope.staffVO.sta_name }"/></td>
	  </tr>
	  <tr>
	   <td>員工分機：</td>
	   <td><input type="text" name="sta_tel" readonly value="${requestScope.staffVO.sta_tel }"/></td>
	  </tr>
	  <tr>
	   <td>員工工號：</td>
	   <td><input type="text" name="sta_id" readonly value="${requestScope.staffVO.sta_id }"/></td>
	  </tr>
	   <tr>
	   <td>性別：</td>
	   <td><input type="text" name="sta_sex"  value="${requestScope.staffVO.sta_sex }"/></td>
	  </tr>
	  <tr>
	   <td>加入日期：</td>
	   <td><input type="text" name="sta_joindate" readonly value="${requestScope.staffVO.sta_joindate }"/></td>
	  </tr>
	   <tr>
	   <td><input type="hidden" name="sta_status" value="${requestScope.staffVO.sta_status }"></td>
	  </tr>
	  <tr>
	    <td><input type="submit" value="修改"></td>
	    <td><a href="${pageContext.request.contextPath}/staff/stafflist">返回員工列表</a> <br></td>
	  </tr>	
	</table>
  </form>
</body>
</html>