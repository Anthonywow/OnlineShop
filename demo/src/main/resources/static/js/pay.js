$(function () {
    var url = "/shopcart/showshopcart";
    var sumPrice = 0;
    $.getJSON(url,function (data) {
        var html ='<div class="cart-table-th" id="orderList">' +
            '<div class="wp">' +
            '<div class="th th-item">' +
            '<div class="td-inner">商品信息</div>' +
            '</div>' +
            '<div class="th th-price">' +
            '<div class="td-inner">单价</div>' +
            '</div>' +
            '<div class="th th-amount">' +
            '<div class="td-inner">数量</div>' +
            '</div>' +
            '<div class="th th-sum">' +
            '<div class="td-inner">金额</div>' +
            '</div>\n' +
            '</div>' +
            '</div>';
        var idNumber = 0;
        data.map(function (item) {
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
                '<div style="width:30px; margin-left:80px;" />' +item.number+
                '</div>' +
                '</div>' +
                '</div>' +
                '</li>' +
                '<li class="td td-sum">' +
                '<div class="td-inner">' +
                '<em tabindex="0" class="J_ItemSum number" name="myprice">' + item.sumPrice + '</em>' +
                '</div>' +
                '</li>' +
                '</ul>';
        });
        $('#orderList').html(html);
        //结算当前购物车总价
        var arr = document.getElementsByName("myprice");
        console.log("长度："+arr.length);
        for(var i=0; i<arr.length; i++){
            // console.log(arr.item(i).innerHTML);
            sumPrice += parseFloat(arr.item(i).innerHTML);
        }
        sumPrice = sumPrice.toFixed(2);
        document.getElementById("J_ActualFee").innerHTML = sumPrice;
        document.getElementById("mysumPrice").innerHTML = sumPrice;
    })
});