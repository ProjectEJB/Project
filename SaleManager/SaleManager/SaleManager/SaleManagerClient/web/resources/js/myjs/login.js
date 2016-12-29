$(document).ready(function () {

    function login() {
        var username = $("#txtUsername").val();
        var password = $("#txtPassword").val();
        var item = {
            "userName": username,
            "password": password

        };
        $.ajax({
            dataType: "json",
            type: 'POST',
            data: JSON.stringify(item),
            contentType: "application/json",
            url: "/SaleManager-web/SaleManager/login",
            success: function (data) {
                if (data == 1) {
                    var successUrl = "index.html"; // might be a good idea to return this URL in the successful AJAX call
                    window.location.href = successUrl
                } else {
                    alert("Sai Tên Đăng Nhập Hoặc Mật Khẩu")
                }
            },
            error: function (data) {

            }
        });
    }
    function proccessAction() {
        $('#btnLogin').click(function () {

            login();
        });
    }
    ;

    proccessAction();
});



