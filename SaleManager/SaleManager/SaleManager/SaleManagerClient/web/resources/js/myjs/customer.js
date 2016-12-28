$(document).ready(function () {
    function formatList(list) {
        $.each(list, function (i, value) {
            value.index = i + 1;
        });
    }
    function action(list) {
        $('.btnDetail').click(function () {
            var id = $(this).data('id');
            var listClub = [];
            $.each(list, function (i, value) {
                if (value.id === id) {
                    listClub = value.listClub;
                }
            });
            $.each(listClub, function (i, value) {
                console.log("name:" + value.name);
            });
            var result = {};
            result.list = listClub;
            var template = $('#tplListClub').html();
            var html = Mustache.render(template, result);
            $('#listClub').html(html);
            $("#dialogListClub").dialog({
                resizable: false,
                height: "auto",
                width: "400px",
                show: {
                    effect: "blind",
                    duration: 1000
                },
                hide: {
                    effect: "explode",
                    duration: 1000
                },
                modal: true,
                buttons: {
                    Cancel: function () {
                        $(this).dialog("close");
                    }
                }
            });
        });
    }
    function reload() {
        $.ajax({
            dataType: "json",
            type: 'GET',
            url: "/SaleManager-web/SaleManager/customer/list",
            contentType: "application/json",
            success: function (data) {
                var result = {};
                result.list = data;
                formatList(result.list);
                var template = $('#tplList').html();
                var html = Mustache.render(template, result);
                $('#listLeague').html(html);
                action(result.list);
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
        var status = $("#txtstatus").val();
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
//                getListProduct();
//                reload();
                var successUrl = "Customer.jsp"; // might be a good idea to return this URL in the successful AJAX call
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

            window.location.href="Customer.jsp";
        });
        
    }
    ;
    reload();
    proccessAction();
});



