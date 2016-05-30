



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/bbs-demo/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/jquery-form.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/changebbs-ajax.js"></script>
<body>
	<form method="post" action="/bbs-demo/changebbs/save" id="form" name="form">
		<div align="center">
			标 题：<input type="text" width=10000 value="${bbs.bbstilte}" id="usertitle"
				name="usertitle"><br>
		</div>
		<div align="center">
			内 容：
			<textarea name="textfield" cols="100" rows="30" id="textfield">${bbs.USERBBS}</textarea>
		</div>
		<div align="center">
			<input type="button" onclick="addRemark('form')" value="保存"><input
				type="reset"><a href="/bbs-demo/index"><input type="button"
				value="返回"></a>最后一次更改时间：<input type="text" readonly="readonly"
				value="${bbs.data}">
		</div>
	</form>
</body>
</html>
