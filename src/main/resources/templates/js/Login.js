$(function () {
    $('#login').click(function(){
        $.post("http://localhost:8080/",
            {
                username:$('#username').val(),
                password:$('#password').val()
            },
            function(data,status){
                alert("����: \n" + data + "\n״̬: " + status);
            });
    });
});
