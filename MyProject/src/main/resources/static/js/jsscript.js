$(function(){
    // 회원 가입 처리
    $('#submit').click(function(e){
        e.preventDefault();
        if($("#inputName").val() ==''){
            alert('이름을 입력하세요');
            $("#inputName").focus();
            return false;
        }

        var email = $('#InputEmail').val();
        if(email == ''){
            alert('이메일을 입력하세요');
            $("#InputEmail").focus();
            return false;
        } else {
            var emailRegex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            if (!emailRegex.test(email)) {
                alert('이메일 주소가 유효하지 않습니다. ex)abc@gmail.com');
                $("#inputEmail").focus();
                return false;
            }
        }

        if($("#inputPassword").val() ==''){
            alert('비밀번호를 입력하세요');
            $("#inputPassword").focus();
            return false;
        }

        if($("#inputPasswordCheck").val() ==''){
            alert('비밀번호를 다시 한번 더 입력하세요');
            $("#inputPasswordCheck").focus();
            return false;
        }
        
        if($("#inputPassword").val()!== $("#inputPasswordCheck").val()){
            alert('비밀번호를 둘다 동일하게 입력하세요');
            return false;
        }

        if($("#inputMobile").val() ==''){
            alert('휴대폰 번호를 입력하세요');
            $("#inputMobile").focus();
            return false;
        }
              
    });

});