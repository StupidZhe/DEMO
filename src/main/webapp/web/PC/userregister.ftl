
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<script type="text/javascript" src="/bbs-demo/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/jquery-form.min.js"></script>
<script type="text/javascript" src="/bbs-demo/js/userregister-ajax.js"></script>
<body>
	<div align="center">
		<h1 style="margin: 50px auto;">信息注册</h1>
		<div class="cont_register">
			<form name="userregister" method="post"
				action="userregister/registerResult" id="form">
				<table style="center: 30px;">
					<tr>
						<td><font color="red" style="padding-right: 5px;">*</font>用户名称：</td>
						<td><input type="text" name="useraccound" id="useraccound"><sub>(账号字符不小于6位)</sub></td>
					</tr>
					<tr></tr>
					<tr>
						<td><font color="red" style="padding-right: 5px;">*</font>密码：</td>
						<td><input type="password" name="userpsw" id="userpsw"><sub>（密码字符不小于6位）</sub></td>
					</tr>
					<tr></tr>
					<tr>
						<td><font color="red" style="padding-right: 5px;">*</font>确认密码：</td>
						<td><input type="password" name="verifyuserpsw"
							id="verifyuserpsw"></td>
					</tr>
					<tr></tr>
					<tr>
						<td align="right"><font color="red"
							style="padding-right: 5px;">*</font>出生日期：</td>
						<td><select name="birthyear">
								<option value=1911>1991</option>
								<option value=1991>1991</option>
								<option value=1992>1992</option>
								<option value=1993>1993</option>
								<option value=1994>1994</option>
								<option value=1995>1995</option>
								<option value=1996>1996</option>
								<option value=1997 selected>1997</option>
								<option value=1998>1998</option>
								<option value=1999>1999</option>
								<option value=2000>2000</option>
						</select>年 <select name="birthmonth">
								<option value=1 selected>01</option>
								<option value=2>02</option>
								<option value=3>03</option>
								<option value=4>04</option>
								<option value=5>05</option>
								<option value=6>06</option>
								<option value=7>07</option>
								<option value=8>08</option>
								<option value=9>09</option>
								<option value=10>10</option>
								<option value=11>11</option>
								<option value=12>12</option>
						</select>月 <select name="birthday">
								<option value=1 selected>01</option>
								<option value=2>02</option>
								<option value=3>03</option>
								<option value=4>04</option>
								<option value=5>05</option>
								<option value=6>06</option>
								<option value=7>07</option>
								<option value=8>08</option>
								<option value=9>09</option>
								<option value=10>10</option>
								<option value=11 selected>11</option>
								<option value=12>12</option>
								<option value=13>13</option>
								<option value=14>14</option>
								<option value=15>15</option>
								<option value=16>16</option>
								<option value=17>17</option>
								<option value=18>18</option>
								<option value=19>19</option>
								<option value=20>20</option>
								<option value=21>21</option>
								<option value=22>22</option>
								<option value=23>23</option>
								<option value=24>24</option>
								<option value=25>25</option>
								<option value=26>26</option>
								<option value=27>27</option>
								<option value=28>28</option>
								<option value=29>29</option>
								<option value=30>30</option>
								<option value=31>31</option>
						</select>日</td>
					</tr>
					<tr>
						<td align="right"><font color="red"
							style="padding-right: 5px;">*</font>邮箱：</td>
						<td><input type="text" name="useremail"></td>
					</tr>
					<tr>
						<td align="right"><font color="red"
							style="padding-right: 5px;">*</font>性别：</td>
						<td><input name="usersex" type="radio" value=1
							checked="checked"
							style="float: left; margin-top: 5px; margin-right: 5px;">
							<label style="float: left;">男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<input name="usersex" type="radio" value=0
							style="float: left; margin-top: 5px; margin-right: 5px;"><label
							style="float: left;">女&nbsp;&nbsp;&nbsp;&nbsp;</label></td>
					<tr>
						<td align="right">验证码：</td>
						<td><input type="text" name="safecode" width="500"
							maxlength="4" style="width: 142px; float: left"> <img
							alt="code" name="randimage" id="randimage" src="userregister/Captcha"
							width="100" height="28" border="2" style="float: right" /></td>
						<!--验证码输入框 -->
					</tr>
					<tr>
						<td align="right"></td>
						<td><label> <span class="check_right"> <input
									type="button" title="点击注册" class="login_type" value=" 提交 "
									onclick="check()" />
							</span>
						</label></td>
					</tr>
				</table>
			</form>
		</div>
		<hr>
	</div>
</body>
</html>