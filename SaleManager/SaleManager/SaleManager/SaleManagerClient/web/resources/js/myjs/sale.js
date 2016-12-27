$(document).ready(function () {
    function formatList(list) {
        $.each( list, function( i, value ) {
            value.index = i + 1;
        });
    }
    function action(list) {
        $('.btnDetail').click(function() {
            var id = $(this).data('id');
            var listClub = [];
            $.each( list, function( i, value ) {
                if (value.id === id) {
                    listClub = value.listClub;
                }
            });
            $.each( listClub, function( i, value ) {
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
            url: "/SaleManager-web/SaleManager/sale/list",
            contentType : "application/json",
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
    reload();
});



