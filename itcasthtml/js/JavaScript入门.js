function newWindow() {
	var $flag = confirm("是否创建新的窗口？");
	if($flag == true) {
		var $newInfo = prompt("请输入要打开的窗口网址","https://www.imooc.com/");
		if($newInfo!=null){
			window.open($newInfo,"慕课网","width=400px,height=500px,menubar=no,toolbar=no");
		}else{
			alert("请输入正确网址");
		}
	}else{
		alert("您已取消创建新窗口操作");
	}
}