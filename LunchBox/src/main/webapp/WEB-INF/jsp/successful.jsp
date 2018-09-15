<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
<%@ include file="header.jsp" %>

    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the details of your tiffin:</h3>
                </td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${tiffin.personName}</td>
            </tr>
            <tr>
                <td>Place:</td>
                <td>${tiffin.place}</td>
            </tr>
            <tr>
                <td>Special:</td>
                <td>${tiffin.special}</td>
            </tr>
            <tr>
                <td>Place:</td>
                <td>${tiffin.place}</td>
            </tr>
 
        </table>
    </div>
    <br>
   <center> <a href="/lunchbox/"><button name="Your Lunch">Home</button></a></center>
    
</body>
</html>