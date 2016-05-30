<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>更改头像</title>

</head>

<body>

	<form name="uploadheadimage" action="/bbs-demo/changeimg/changeM"
		method="post" enctype="multipart/form-data" accept="image/*">

		<input type="file" name="photo" size="20" /> <input type="submit"
			value="上传" name="photo" /> <input type="reset" value="重置"> <a
			href="/bbs-demo/index">返回主页</a>
	</form>
	<img alt="王茜学长超帅" src="${user.userhead}" width="200">

</body>
</html>