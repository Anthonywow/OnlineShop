$(function () {
    var url="/shopcart/showshopcart";
    $.getJSON(url,function (data) {
        var html ='';
        var idNumber = 0;
        var sumPrice = 0;
        //遍历商品列表，添加进购物车列表界面
        data.map(function (item,index){
            if(item.title == null){
                html += '<div class="messageshow">你的购物车什么都没有~</div>';
            }else {
                idNumber++;
                html += '<ul class="item-content clearfix">' +
                    '<li class="td td-item">' +
                    '<div class="item-pic">' +
                    '<a href="#" target="_blank" data-title="' + item.title + '" class="J_MakePoint" data-point="tbcart.8.12">' +
                    '<img src="'+item.src+'" class="itempic J_ItemImg" style="width:100%"></a>' +
                    '</div>' +
                    '<div class="item-info">' +
                    '<div class="item-basic-info">' +
                    '<a href="#" target="_blank" title="' + item.title + '" class="item-title J_MakePoint" data-point="tbcart.8.11">' + item.title + '</a>' +
                    '</div>' +
                    '</div>' +
                    '</li>' +
                    '<li class="td td-info">' +
                    '<div class="item-props item-props-can">' +
                    '<span class="sku-line">&nbsp</span>' +
                    '<span class="sku-line">&nbsp</span>' +
                    '<i class="theme-login am-icon-sort-desc"></i>' +
                    '</div>' +
                    '</li>' +
                    '<li class="td td-price">' +
                    '<div class="item-price price-promo-promo">' +
                    '<div class="price-content">' +
                    '<div class="price-line">' +
                    '<em class="price-original">78.00</em>' +
                    '</div>' +
                    '<div class="price-line">' +
                    '<em class="J_Price price-now" tabindex="0">' + item.unitPrice + '</em>' +
                    '</div>' +
                    '</div>' +
                    '</div>' +
                    '</li>' +
                    '<li class="td td-amount">' +
                    '<div class="amount-wrapper ">' +
                    '<div class="item-amount ">' +
                    '<div class="sl">' +
                    '<input class="min am-btn" name="" type="button" value="-" />' +
                    '<input type="text" value="' + item.number + '" style="width:30px;" />' +
                    '<input class="add am-btn" name="" type="button" value="+" />' +
                    '</div>' +
                    '</div>' +
                    '</div>' +
                    '</li>' +
                    '<li class="td td-sum">' +
                    '<div class="td-inner">' +
                    '<em tabindex="0" class="J_ItemSum number" name="myprice">' + item.sumPrice + '</em>' +
                    '</div>' +
                    '</li>' +
                    '<li class="td td-op">' +
                    '<div class="td-inner">' +
                    '<a herf="javascript:;" onclick="deleteItem('+idNumber+')" data-point-url="#" class="delete">' +
                    '删除</a>' +
                    '</div>' +
                    '</li>' +
                    '</ul>';
            }
        });
        $('#list').html(html);
        //结算当前购物车总价
        var arr = document.getElementsByName("myprice");
        console.log("长度："+arr.length);
        for(var i=0; i<arr.length; i++){
            // console.log(arr.item(i).innerHTML);
            sumPrice += parseFloat(arr.item(i).innerHTML);
        }
        sumPrice = sumPrice.toFixed(2);
        document.getElementById("J_Total").innerHTML = sumPrice;
    });
});

function deleteItem(deleteid) {
    var r=confirm("确认删除？");
    if(r){
        $.ajax({
            url:"/shopcart/deleteWareOfShopcart",
            type:"POST",
            data:{
                _method:"DELETE",
                id:deleteid},
            dataType:"json",
            success:function(result){
                if(result.success){
                    alert("删除成功!");
                }
                else{
                    alert(data.errmessage);
                }
            }
        }
        );
    }
    window.location.href = "shopcart";
}