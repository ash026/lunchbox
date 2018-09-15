<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tiffin Registration</title>
</head>
<body>
<%@ include file="header.jsp" %>

    <div align="center">
        <form:form action="/lunchbox/tiffin" method="post" modelAttribute="tiffin">
            <table border="0">
                <tr>
                    <td colspan="2" align="center" ><h1>Tiffin Registration</h1></td>
                </tr>
                <tr>
                    <td>Your beautiful Name:</td>
                    <td><form:input path="personName" /></td>
                </tr>
                <tr>
                    <td>Tiffin Type:</td>
                    <td><form:select path="type" items="${tiffinList}" /></td>
                </tr>
                <tr>
                    <td>Place</td>
                    <td><form:select path="place" items="${place}" /></td>
                </tr>
              <tr>
                    <td>Special</td>
                    <td>
                    <form:radiobutton path="special" value="y" label="Y" /> 
                    <form:radiobutton path="special" value="n" label="N" /> 
                </tr> 
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Enroll" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>