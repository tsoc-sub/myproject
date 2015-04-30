<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#prev").click(function(){
        var month = $("#month").val()-1;
        $("#month").text(month);
        //$("#month").text("Hello world!");
    });
    $("#next").click(function(){
        var month = $("#month").val()+1;
        $("#month").text(month);
        //$("#month").html("<b>Hello world!</b>");
    });
});
</script>
</head>
<body>

<button id="prev">prev month</button>
<button id="next">next month</button>
<p id="month">0</p>

</body>
</html>
