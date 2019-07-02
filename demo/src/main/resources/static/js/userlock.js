$(function () {
    var url="/gjy/user_lock";
    $.getJSON(url,function (data) {
        if(data.username == "0000" ) {
            html = '<a id="username_lock" href="login" target="_top" class="h">亲，请登录&nbsp</a>' +
                '<a id="text_register" href="register" target="_top">免费注册</a>';
            $('#userlockbind').html(html);
        }else{
            document.getElementById("username_lock").innerHTML = data.username;//更改用户名
            // $('#text_register').attr('style','display:none');
            document.getElementById("text_register").innerHTML = "，欢迎！";//隐藏文字“请注册”
        }
    });
});