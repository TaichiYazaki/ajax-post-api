$(function () {
    $('#searchAddress').on("submit", function (e) {
        e.preventDefault();
        $.ajax({
            url: $(this).attr("action")
            , type: 'POST'
            , contentType: "application/json"
            , data: {
                zipcode: $('#zipcode').val()
            }
            , dataType: 'json'
            , async: true
            , success: function (data) {
                $("#zip").empty();
                $("#kana").empty();
                $("#address").empty();
                $.each(data.results,
                    function (index, result) {
                        $("#zip").append("〒" + result.zipcode);
                        $("#kana").append(result.kana1);
                        $("#kana").append(result.kana2);
                        $("#kana").append(result.kana3);
                        $("#address").append(result.address1);
                        $("#address").append(result.address2);
                        $("#address").append(result.address3);

                    });
            }

        })
    })
})