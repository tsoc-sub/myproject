
<%-- 
    Document   : index
    Created on : 2015. 4. 12, 오후 10:59:39
    Author     : TSOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    
    <script type="text/javascript">
        function flowtime() {
            chantime_m = setTimeout("timebar_m()", 1000);
        }

        function timebar_m() {
            var ti = document.all.timebox_m.value;
            ti = ti - 1;

            if (ti < 1) {
                document.all.timebox_m.value = "end count";
            } else {
                document.all.timebox_m.value = ti;
                chantime = setTimeout("timebar_m()", 1000);
            }
        }

        function cleartime() {
            clearTimeout(chantime_m);
        }

        function move(para) {
            var nmonth = document.all.month.value;
            if (para == "prev") {
                document.all.timebox_m.value = nmonth - 1;
            }
            if (para == "next") {
                document.all.timebox_m.value = nmonth + 1;
            }
        }

        flowtime();

    </script>

    <body>
        <input type ="text" name = "timebox_m" value = "300"><br>
        
    </body>
</html>