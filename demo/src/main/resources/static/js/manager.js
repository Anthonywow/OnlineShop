var url='/wareList/getWareList';
$.getJSON(url,function (data) {
    var html = '';
    data.map(function(item,index){
        console.log(item.id);
        html += '<tr>' +
            '<td><input type="checkbox" /></td>' +
            '<td>'+item.id+'</td>' +
            '<td><a href="#">'+item.title+'</a></td>' +
            '<td>零食</td>' +
            '<td class="am-hide-sm-only"><i class="am-icon-check am-text-warning"></i></td>' +
            '<td class="am-hide-sm-only">'+ item.price +'</td>' +
            '<td><div class="am-btn-toolbar">' +
            '<div class="am-btn-group am-btn-group-xs">' +
            '<button class="am-btn am-btn-default am-btn-xs am-text-danger am-round" onclick="deleteItem('+ item.id +')"><span class="am-icon-trash-o"></span></button>' +
            '</div>' +
            '</div></td>' +
            '</tr>';
    });
    $('#tablelist').html(html);
});

//删除商品
function deleteItem(deleteid) {
    var r=confirm("确认删除？");
    if(r){
        $.ajax({
                url:"/wareList/deleteWare",
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
    window.location.href = "manager";
}