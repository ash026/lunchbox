<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
* {
    box-sizing: border-box;
}


/* The grid: Four equal columns that floats next to each other */
.column {
    float: left;
    width: 25%;
    padding: 10px;
}

/* Style the images inside the grid */
.column img {
    opacity: 0.8; 
    cursor: pointer; 
}

.column img:hover {
    opacity: 1;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* The expanding image container */
.container {
    position: relative;
    display: none;
}

/* Expanding image text */
#imgtext {
    position: absolute;
    bottom: 15px;
    left: 15px;
    color: white;
    font-size: 20px;
}

/* Closable button inside the expanded image */
.closebtn {
    position: absolute;
    top: 10px;
    right: 15px;
    color: white;
    font-size: 35px;
    cursor: pointer;
}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<br>
<br>

<div class="row">
  <div class="column">
    <img src="/pic1.jpeg" alt="food1" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src="/pic2.jpeg" alt="food1" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src="/pic3.jpeg" alt="food1" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src="/pic6.jpeg" alt="food1" style="width:100%" onclick="myFunction(this);">
  </div>
</div>

<div class="container">
  <span onclick="this.parentElement.style.display='none'" class="closebtn">&times;</span>
  <img id="expandedImg" style="width:100%">
  <div id="imgtext"></div>
</div>

<script>
function myFunction(imgs) {
    var expandImg = document.getElementById("expandedImg");
    var imgText = document.getElementById("imgtext");
    expandImg.src = imgs.src;
    imgText.innerHTML = imgs.alt;
    expandImg.parentElement.style.display = "block";
}
</script>
<center><p style="color: black"> We deliver tiffins at your door steps. Now you need not to worry about your lunch.
We have plenty of options available like veg, non veg , north indian and south indian.
Food is prepared and packed by professionals. To try our food please click at below link-
</p>
<center>
<a href="/lunchbox/tiffinActivateHome"><button name="Your Lunch">Your Lunch</button></a></center>


</body>
</html>