<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>員工列表 here</title>
</head>
<body>
   <table border="1">
   	  <tr>
          <td>員工編號</td>
          <td>姓名</td>
          <td>刪除</td>
        </tr>   
      <c:forEach var="staffList"   items="${requestScope.staffList}">
        <tr>
          <td><a href="${pageContext.request.contextPath}/staff/getStaffInfo?Sta_no=${staffList.sta_no}">
                ${staffList.sta_no}</a></td>
          <td>${staffList.sta_name}</td>
          <td><a href="${pageContext.request.contextPath}/staff/deleteStaff?Sta_no=${staffList.sta_no}">
                ${staffList.sta_no}</a></td>
        </tr>                         
      </c:forEach>
    </table>
    <br>
    <a href="${pageContext.request.contextPath}">返回首页</a>
</body>
</html>