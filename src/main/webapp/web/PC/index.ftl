
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人主页</title>
</head>
<script type="text/javascript" src="/bbs-demo/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function addbbs() {
		window.open("");
	}
</script>
<body>
	<div id="header" style="background-color: #FFA500; height: 50px;">
		<h1 style="">
			<a href="/bbs-demo/index/logout">注销登录</a>
		</h1>
	</div>

	<div id="menu"
		style="background-color: #FFD700; height: 500px; width: 100px; float: left;">
		<div>
			<div class="img_bg">
				<a href="/bbs-demo/changeimg"><img src="${user.userhead}"
					alt="点击修改头像" width="100" /></a><br>
			</div>
			<input type="button" value="hello" onclick="testJson()">
			用户名:${user.useraccound}<br> 生 日:${user.userbirth}<br>
		</div>
	</div>
	<div id="content"
		style="background-color: #EEEEEE; height: 500px; width: 957px; float: left;">
		<!-- 定义的变量 -->
		<table>
			<#list bbsPage.getList() as x>
			<tr>
				<td style="text-align: left;">标题：${x.bbstilte}
					&nbsp;&nbsp;&nbsp;</td>
				<td style="text-align: left;">内容：${x.USERBBS}&nbsp;&nbsp;&nbsp;</td>
				<td style="text-align: left;">时间：${x.data}</td>
				<td style="text-align: left;"><a href="/bbs-demo/changebbs/${x.id}"><input
						type="button" value="修改"></a>
			</tr>
			</#list>
		</table>
		<#include "/_paginate.ftl" /> 
		<@paginate currentPage=bbsPage.pageNumber totalPage=bbsPage.totalPage
		actionUrl="/bbs-demo/index/"/><input type="button" value="添加"
			onclick="addbbs()">
	</div>
	${sessionID}

</body>
</html>