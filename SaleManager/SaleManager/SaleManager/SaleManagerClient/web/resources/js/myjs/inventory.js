$(document).ready(function () {    
    reload();
    proccessAction();
});

function proccessAction() {
        $('#btnAdd').click(function () {

            addNewItem();
        });
        $('#btnBack').click(function () {

            window.location.href="Inventory.jsp";
        });
        $('.btnDelete').on('click',function () {
        var id = $(this).data('id');
    
        deleteItem(id);
        console.log(id);
        });
    }

function reload() {
        $.ajax({
            dataType: "json",
            type: 'GET',
            url: "/SaleManager-web/SaleManager/inventory/list",
            contentType: "application/json",
            success: function (data) {
                var result = {};
                result.list = data;
                
                var template = $('#tplList').html();
                var html = Mustache.render(template, result);
                $('#listLeague').html(html);
                
                console.log('tuananh');
                proccessAction();
            },
            error: function (data) {

            }
        });
    }
    function deleteItem(invID) {
    var id = invID;
    console.log(id);
    $.ajax({
        dataType: "json",
        type: 'DELETE',
        
        contentType: "application/json",
        url: "/SaleManager-web/SaleManager/inventory/deleteInventory?id="+id,
        success: function (data) {

            var successUrl = "Inventory.jsp"; // might be a good idea to return this URL in the successful AJAX call
            window.location.href = successUrl

        },
        error: function (data) {

        }
    });
}
    function addNewItem() {
        var id = $("#txtinvtID").val();
        var name = $("#txtinvtName").val();
        var classname = $("#txtclassName option:selected").text();
        var unit = $("#txtunitIDL").val();
        
        var item = {
            "invtID": id,
            "invtName": name,
            "className": classname,
            "unitIDL": unit
           

        };
        console.log(item);
        $.ajax({
            dataType: "json",
            type: 'POST',
            data: JSON.stringify(item),
            contentType: "application/json",
            url: "/SaleManager-web/SaleManager/inventory/addInventory",
            success: function (data) {
//                getListProduct();
//                reload();
                var successUrl = "Inventory.jsp"; // might be a good idea to return this URL in the successful AJAX call
                window.location.href = successUrl

            },
            error: function (data) {

            }
        });
    }
    