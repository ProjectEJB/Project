$(document).ready(function () {
    reload();
    
    
    proccessAction();
});


function proccessAction() {
   
    $('#btnAdd').click(function () {

        addNewItem();
    });

    $('#btnBack').on('click',function () {
        window.location.href = "Customer.jsp";
    });

    $('.btnDelete').on('click',function () {
        var id = $(this).data('id');
    
        deleteItem(id);
        console.log('tuananh');
    });
    $( "#txtcustID" ).keyup(function() {
        
        var id= $( "#txtcustID" ).val();
        $.ajax({
        dataType: "json",
        type: 'GET',
        url: "/SaleManager-web/SaleManager/customer/detail?id=" +id,
        contentType: "application/json",
        success: function (data) {
            console.log(data);
            if(data === null){
                $('#btnAdd').prop('disabled',false);
                 $('#alert').text('');
            }
            else{
                $('#btnAdd').prop('disabled',true);               
                $('#alert').text('Id nay da co');
            }
        },
        error: function (data) {

        }
    });
});
}
;

function reload() {
    $.ajax({
        dataType: "json",
        type: 'GET',
        url: "/SaleManager-web/SaleManager/customer/list",
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
    var id = $("#txtcustID").val();
    var name = $("#txtname").val();
    var address = $("#txtaddress").val();
    var amount = $("#txtamount").val();
    var status = $("#txtstatus option:selected").text();
    var item = {
        "custID": id,
        "custName": name,
        "address": address,
        "amount": amount,
        "status": status

    };
    $.ajax({
        dataType: "json",
        type: 'POST',
        data: JSON.stringify(item),
        contentType: "application/json",
        url: "/SaleManager-web/SaleManager/customer/addCustomer",
        success: function (data) {

            var successUrl = "Customer.jsp"; // might be a good idea to return this URL in the successful AJAX call
            window.location.href = successUrl

        },
        error: function (data) {

        }
    });
}
function deleteItem(custID) {
    var id = custID;
    console.log(id);
    $.ajax({
        dataType: "json",
        type: 'DELETE',
        
        contentType: "application/json",
        url: "/SaleManager-web/SaleManager/customer/deleteCustomer?id="+id,
        success: function (data) {

            var successUrl = "Customer.jsp"; // might be a good idea to return this URL in the successful AJAX call
            window.location.href = successUrl

        },
        error: function (data) {

        }
    });
}
