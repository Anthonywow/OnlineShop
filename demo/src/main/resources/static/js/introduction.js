var title;
var unit_price;
var sum_price;
var number;
var src;
//显示商品详情
var url = "/wareList/getIntroduction/"+getQueryString('id');
$.getJSON(url,function (data) {
    document.getElementById("title").innerHTML = data.title;
    document.getElementById("price").innerHTML = data.price;
    document.getElementById("a01").herf = data.picSrc;
    document.getElementById("jqzoom").src = data.picSrc;
    document.getElementById("img01").src = data.picSrc;
});

//“加入购物车”按钮点击事件——将商品添加到购物车中
$('#addshopcart').click(function () {
    title = document.getElementById("title").innerHTML;
    unit_price = document.getElementById("price").innerHTML;
    number =document.getElementById("text_box").value;
    src = document.getElementById("jqzoom").src;
    sum_price = unit_price*number;
    // alert(title+"+"+unit_price+"+"+number+"+"+sum_price);
    $.ajax({
        'type'    : "POST",
        'url'     : "/shopcart/addshopcart",
        'data'    : {
            "src": src,
            "title": title,
            "unit_price": unit_price,
            "number": number,
            "sum_price":sum_price
        },
        'dataType':'json',
        'success' : function(data) {
            if(data.success){
                alert("加入购物车成功!");
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

//对地址进行处理
function getQueryString(name){
    var reg=new RegExp("(^|&)"+name+"=([^&]*)(&|$)");
    var r=window.location.search.substr(1).match(reg);
    if(r!=null){//获取地址不为空的情况下返回 需要的信息
        return decodeURIComponent(r[2]);
    }
    return '';
}