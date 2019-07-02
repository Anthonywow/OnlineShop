var url='/wareList/getWareList';
$.getJSON(url,function (data) {
    var html='';
    data.map(function (item,index) {
        // console.log(item.id);
        html += '<li>' +
            '<div class="i-pic limit" id="'+item.id+'">' +
            '<a href="introduction?id='+item.id+'">'+
            '<img src="'+ item.picSrc +'"/>' +
            '</a>'+
            '<p class="title fl">'+ item.title+'</p>' +
            '<p class="price fl">' +
            '<b>¥</b>' +
            '<strong>'+ item.price +'</strong>' +
            '</p>' +
            '<p class="number fl">' +
            '销量<span>1110</span>' +
            '</p>' +
            '</div>' +
            '</li>'
    });
    $('#bottomul').html(html);
});

