$(document).ready(function () {
    function formatList(list) {
        $.each(list, function (i, value) {
            value.index = i + 1;
        });
    }
//    function action(list) {
//        $('.btnDetail').click(function () {
//            var id = $(this).data('id');
//            var listClub = [];
//            $.each(list, function (i, value) {
//                if (value.id === id) {
//                    listClub = value.listClub;
//                }
//            });
//            $.each(listClub, function (i, value) {
//                console.log("name:" + value.name);
//            });
//            var result = {};
//            result.list = listClub;
//            var template = $('#tplListClub').html();
//            var html = Mustache.render(template, result);
//            $('#listClub').html(html);
//            $("#dialogListClub").dialog({
//                resizable: false,
//                height: "auto",
//                width: "400px",
//                show: {
//                    effect: "blind",
//                    duration: 1000
//                },
//                hide: {
//                    effect: "explode",
//                    duration: 1000
//                },
//                modal: true,
//                buttons: {
//                    Cancel: function () {
//                        $(this).dialog("close");
//                    }
//                }
//            });
//        });
//    }
    function reload() {
        $.ajax({
            dataType: "json",
            type: 'GET',
            url: "/SaleManager-web/SaleManager/purchaseorder/listRender",
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
        var orderNo = $("#txtorderNo").val();
        var orderDate = $("#txtorderDate").val();
        var discAmount = $("#txtdiscAmount").text();
        var taxAmount = $("#txttaxAmount").text();
        var amount = $("#txtamount").text();
        var invtID = $("#txtInvtID").val();
        var purchasePrice = $("#txtDongia").text();
        var discAmt = $("#txtchietkhau").text();
        var quantity = $("#txtSoluong").val();
        var purchase = {
            "orderNo": orderNo,
            "orderDate": orderDate,
            "discAmt": discAmount,
            "taxAmt": taxAmount,
            "amount": amount,
            "purchasePrice": purchasePrice,
            "invtID": invtID,
            "qty": quantity
        }
        $.ajax({
            dataType: "json",
            type: 'POST',
            data: JSON.stringify(purchase),
            contentType: "application/json",
            url: "/SaleManager-web/SaleManager/purchaseorder/return",
            success: function (data) {
//                getListProduct();
//                reload();
                var successUrl = "PurchaseOrder.jsp"; // might be a good idea to return this URL in the successful AJAX call
                window.location.href = successUrl

            },
            error: function (data) {
                alert("Mã Đơn Hàng Đã Tồn Tại")
            }
        });
    }
    function listInvent() {
        var invtID = $("#txtInvtID").val();


        $.ajax({
            dataType: "json",
            type: 'GET',
            data: {InvtID: invtID},
            contentType: "application/json",
            url: "/SaleManager-web/SaleManager/purchaseorder/getinventory",
            success: function (data) {
                $('#txtSoluong').on('change', function () {
                    var soluong = $("#txtSoluong").val();
                    var gia = $("#txtthanhtien").text();
                    var ck = $("#txtchietkhau").val();

                    document.getElementById("txtthanhtien").textContent = data.salesPriceL * soluong;
                    document.getElementById("txttaxAmount").textContent = data.salesPriceL * soluong * 10 / 100;
                    document.getElementById("txtamount").textContent = (data.salesPriceL * soluong) - ((data.salesPriceL * soluong) * ck / 100) + (data.salesPriceL * soluong) * 10 / 100;


                })

                $('#txtchietkhau').on('change', function () {
                    var soluong = $("#txtSoluong").val();
                    var gia = $("#txtthanhtien").text();
                    var ck = $("#txtchietkhau").val();

                    document.getElementById("txtthanhtien").textContent = data.salesPriceL * soluong;
                    document.getElementById("txtdiscAmount").textContent = ck;
                    document.getElementById("txttaxAmount").textContent = data.salesPriceL * soluong * 10 / 100;
                    document.getElementById("txtamount").textContent = (data.salesPriceL * soluong) - ((data.salesPriceL * soluong) * ck / 100) + (data.salesPriceL * soluong) * 10 / 100;

                }
                )





                var soluong = $("#txtSoluong").val();
                var ck = $("#txtchietkhau").val();
                document.getElementById("txtthanhtien").textContent = data.salesPriceL * soluong;
                document.getElementById("txtamount").textContent = data.salesPriceL - (data.salesPriceL * ck / 100) + data.salesPriceL * 10 / 100;
                document.getElementById("txtdiscAmount").textContent = ck;
                document.getElementById("txtInventName").textContent = data.invtName;
                document.getElementById("txtDongia").textContent = data.salesPriceL;

            },
            error: function (data) {
                alert("Mã hàng không đúng");
                document.getElementById("txtInventName").textContent = "";
                document.getElementById("txtDongia").textContent = "";
                document.getElementById("txtchietkhau").textContent = "";
                document.getElementById("txtVAT").textContent = "";
            }
        });
    }
    function proccessAction() {
        $('#btnAdd').click(function () {
            var orderNo = $("#txtorderNo").val();
            if (orderNo == "") {
                alert("Bạn Phải Nhập Số Hóa Đơn")
                document.getElementById("#txtorderNo").focus();
            }
            if ($("#txtorderDate").val() == "") {
                alert("Bạn Phải Nhập Ngày Hóa Đơn")
                document.getElementById("#txtorderDate").focus();

            }
            if ($("#txtInvtID").val() == "") {
                alert("Bạn Phải Nhập Mã Hàng")
                document.getElementById("#txtInvtID").focus();

            }
            if ($("#txtSoluong").val() == "") {
                alert("Bạn Phải Nhập Số Lượng")
                document.getElementById("#txtInvtID").focus();

            }


            if ($("#txtchietkhau").val() == "") {
                alert("Bạn Phải Nhập Chiết Khấu")
                document.getElementById("#txtInvtID").focus();

            } else {
                addNewItem();
            }
        });
//        $('#btnSearch').click(function () {
//
//            listInvent();
//        });


    }
    ;
    $('#txtInvtID').on('change', function () {

        listInvent();
    })
    reload();
    proccessAction();
});



