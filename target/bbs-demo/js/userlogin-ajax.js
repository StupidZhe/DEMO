function addRemark(formID,useraccound,userpassword){
	var options = {
		dataType : 'json',
		type : 'post',
        success : function(data)
        {  
        	if(data.res==100)
        	{
				alert("登录成功");
				window.location.href = "index";
        	}else if(data.res==59){
        		alert("账号不存在");
        	}else if(data.res==45){
        		alert("!!!!!!!!!!");
        	}else{
        		alert("密码错误");
        	}
        }
	};
    if(($("#useraccound").val())!= "") 
    {
       	if(($("#userpassword").val())=="")
    	{
       		alert("密码不能空");
    	}else{
        $("#"+formID).ajaxSubmit(options);
   	}
    }
    else{
    	alert("账号不能为空");
    }
}	