function passwordCheck()
{
	if($('#password').val() != $('#password2').val())
	{
		$('#passwordCheckTD').text("비밀번호가 일치하지 않습니다.").css("color","red");
	}
	else if($('#password').val() == $('#password2').val())
	{
		$('#passwordCheckTD').text("비밀번호가 일치합니다.").css("color","black");
	}
}

function idCheck(){
	if($("input[name=id]").val() == "")
	{
		$('#idCheck').attr("value",0).text("아이디를 입력하세요").css("color","red");
		$('#id').focus();
	} else {
	
	var url = "idCheck.do";
	var postString = "";
	postString   = "login_id=" + $('#id').val();
	
	$.ajax({

		type: "POST",
		url: url,
		data: postString,
		success: function(msg) {
			if(msg == 1){
				$('#idCheck').attr("value",0).text("중복").css("color","red");
				
			}
			else{
				$('#idCheck').attr("value",1).text("사용가능").css("color","black");
				
			}
	   }
	});
}
}

function chkword(obj, maxByte) {
	 
    var strValue = obj.value;
    var strLen = strValue.length;
    var totalByte = 0;
    var len = 0;
    var oneChar = "";
    var str2 = "";

    for (var i = 0; i < strLen; i++) {
        oneChar = strValue.charAt(i);
        if (escape(oneChar).length > 4) {
            totalByte += 2;
        } else {
            totalByte++;
        }

        // 입력한 문자 길이보다 넘치면 잘라내기 위해 저장
        if (totalByte <= maxByte) {
            len = i + 1;
        }
    }

    // 넘어가는 글자는 자른다.
    if (totalByte > maxByte) {
        str2 = strValue.substr(0, len);
        obj.value = str2;
        chkword(obj, 4000);
    }
}

$(document).ready(function(){
	$("input[name=name]").keyup(function(){
		$(this).val($(this).val().replace(/[a-z0-9]/gi,''));
	})
	$("input[name=id]").keyup(function(){
	
		$(this).val($(this).val().replace(/[^a-z0-9]/gi,''));
		
		if($(this).val().length > 12){
			$(this).val().substr(0,12);
			return false;
		}
		 
	});
})