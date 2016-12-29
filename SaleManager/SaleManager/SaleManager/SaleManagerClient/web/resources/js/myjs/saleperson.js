$(document).ready(function () {
    
    function reload() {
        $.ajax({
            dataType: "json",
            type: 'GET',
            url: "/SaleManager-web/SaleManager/saleperson/list",
            contentType: "application/json",
            success: function (data) {
                var result = {};
                result.list = data;
                
                var template = $('#tplList').html();
                var html = Mustache.render(template, result);
                $('#listLeague').html(html);
                
                proccessAction();
            },
            error: function (data) {

            }
        });
    }
    function addNewItem() {
        var id = $("#txtid").val();
        var name = $("#txtname").val();
        var address = $("#txtaddress").val();
        var status = $("#txtstatus option:selected").text();
        var item = {
            "id": id,
            "name": name,
            "address": address,
            "status": status

        };
        $.ajax({
            dataType: "json",
            type: 'POST',
            data: JSON.stringify(item),
            contentType: "application/json",
            url: "/SaleManager-web/SaleManager/saleperson/addSaleperson/",
            success: function (data) {
//                getListProduct();
//                reload();
                var successUrl = "Saleperson.jsp"; // might be a good idea to return this URL in the successful AJAX call
                window.location.href = successUrl

            },
            error: function (data) {

            }
        });
    }
    function proccessAction() {
        $('#btnAdd').click(function () {

            addNewItem();
        });
        $('#btnBack').click(function () {

            window.location.href="Saleperson.jsp";
        });
        $('.btnDelete').on('click',function () {
        var id = $(this).data('id');
    
        deleteItem(id);
        console.log(id);
        });
    }
    ;
    
    function deleteItem(saleID) {
    var id = saleID;
    console.log(id);
    $.ajax({
        dataType: "json",
        type: 'DELETE',
        
        contentType: "application/json",
        url: "/SaleManager-web/SaleManager/saleperson/deleteSaleperson?id="+id,
        success: function (data) {

            var successUrl = "Saleperson.jsp"; // might be a good idea to return this URL in the successful AJAX call
            window.location.href = successUrl

        },
        error: function (data) {

        }
    });
}
    reload();
    proccessAction();
});



