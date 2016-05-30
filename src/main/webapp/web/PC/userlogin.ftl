<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<script type="text/javascript" src="/bbs-demo/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/jquery-form.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/userlogin-ajax.js"></script>
<body>
		<div align="center"><h1>登录</h1></div>
		<div align="center">
		<form action="login" method="post" id="form" >
		<table>
			<tr>
				<td>UserAccound:</td>
				<td><input type="text" name="useraccound" value="" id="useraccound"></td>
			</tr>
			<tr>
				<td>UserPassword:</td>
				<td><input type="password" name="userpassword" value="" id="userpassword"></td>
			</tr>
			<tr><td></td><td><input type="button" value="登录" onclick="addRemark('form','useraccound','userpassword')"><a href="userregister">注册</a></td></tr>
		</table>
		</form>
		</div>
</body>
</html>