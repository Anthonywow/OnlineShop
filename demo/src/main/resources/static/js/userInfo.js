//用户登录
var user;
var password;
var email;
var password_p1;
var passwordRepeat_p1;
$('#btn_login').click(function(){
    password = $('#password').val();
    user = $("#user").val();
    if(user==""){
        alert("用户名不能为空");
    }
    if(password==""){
        alert("密码不能为空");
    }
    $.ajax({
        'type'    : "POST",
        'url'     : "/gjy/login_check",
        'data'    : {
            "username": user,
            "password": password
        },
        'dataType':'json',
        'success' : function(data) {
            if(data.success){
                if(data.username == "manager"){
                    window.location.href = "manager";
                }else {
                    window.location.href = "home";
                }
                // window.location.href = "manager";
            }
            else{
                alert(data.errmessage);
            }
        },
        'error'   : function(data){
            alert('error');
        }
    });
});

//注册->登录
$('#btn_register').click(function(){
    window.location.href = "/gjy/register";
});
//用户注册
//验证邮箱+检查两次的密码输入是否一致
$('#btn_register1').click(function(){
    email = $("#email").val();
    password_p1 = $("#password_p1").val();
    passwordRepeat_p1 = $("#passwordRepeat_p1").val();
    //验证邮箱
    var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
    var obj = document.getElementById("email"); //要验证的对象
    if(obj.value === ""){ //输入不能为空
        alert("输入不能为空!");
        return false;
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
        alert("邮箱不符合规范!");
        return false;
    }else{
        if(password_p1==passwordRepeat_p1){
            $.ajax({
                'type'    : "POST",
                'url'     : "/gjy/register_check",
                'data'    : {
                    "username": email,
                    "password": password_p1
                },
                'dataType':'json',
                'success' : function(data) {
                    if(data.success){
                        window.location.href = "login";
                    }
                    else{
                        alert(data.errmessage);
                    }
                },
                'error'   : function(data){
                    alert('error');
                }
            });
        }else{
            alert("两次密码输入不一致！");
        }
    }
});



