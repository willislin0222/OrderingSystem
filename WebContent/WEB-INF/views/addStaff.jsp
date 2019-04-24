<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>員工註冊</title>
</head>
<body>
    <h3>員工註冊</h3>    <br>
    <form method="post" action="${pageContext.request.contextPath}/staff/addStaff">
       <table>
           <tr>
               <td><label>姓名：</label></td>
               <td><input type="text" name="sta_name"></td>
           </tr>
           <tr>
               <td><label>工號：</label></td>
               <td><input type="text" name="sta_id"></td>
           </tr>
           <tr>
               <td><label>電話：</label></td>
               <td><input type="text" name="sta_tel"></td>
           </tr>
            <tr>
               <td><label>性別：</label></td>
               <td><input type="text" name="sta_sex"></td>
           </tr>
           <tr>
               <td><input type="submit" value="註冊"></td>
           </tr>
       </table>
    </form>
</body>
</html>