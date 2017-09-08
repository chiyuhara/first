var ajaxPostSend =  function() {
	var id = $("input[name=id]").val();
	var pass = $("input[name=password]").val();
	var pass2 = $("input[name=password2]").val();
	var name = $("input[name=name]").val();
	var check = $('.idCheck').attr('check');
	alert(check);
	
	if(name == ""){
		alert("이름를 입력해주세요.");
		$('#name').focus();
		return false;
	}
	else if(id == ""){
		alert("아이디를 입력해주세요.");
		$('#id').focus();
		return false;
	}else if(pass == ""){
		alert("비밀번호를 입력해주세요.");
		$('#password').focus();
		return false;
	}else if(pass2 == ""){
		alert("비밀번호 확인을 해주세요. ");
		$('#password2').focus();
		return false;
	}else if(pass != pass2){
		alert("입력한 비밀번호가 일치 하지 않습니다. ");
		$('#password2').focus();
		return false;
	}else if(check == 0){
		alert("아이디 중복체크를 해주세요.")
		return false;
	}
	
	parent.startLayer();
	var url = "join.do";
	var postString = "";
	postString   = "login_id=" + $('#id').val();
	postString += "&pass=" + $('#password').val();
	postString += "&name=" + $('#name').val();

	
	$.ajax({

		type: "POST",
		url: url,
		data: postString,
		success: function(msg) {
			setTimeout('parent.stopLayer('+msg+')',2500);
	   }
	});
 };