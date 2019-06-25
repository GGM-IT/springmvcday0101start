<%--
  Created by IntelliJ IDEA.
  User: Tarena
  Date: 2019/5/21
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!--引入jquery的js库-->
    <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
    <script type="text/javascript">

     $(function () {
         $("#btn").click(function () {
             alert("hello");
         });
     });


 </script>

</head>

<body>
 <a href="/user/testString">请求</a>
 <a href="/user/testVoid">void请求</a></br>
 <a href="/user/testModelVoid">请求</a>
 </br>
<button id="btn">testString</button>
</body>
</html>
