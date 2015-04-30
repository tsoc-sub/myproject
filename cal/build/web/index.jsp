<%-- 
    Document   : index
    Created on : 2015. 4. 12, 오후 10:59:39
    Author     : TSOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <script type="text/javascript">
            var month = 1;

            function prev(f) {
                month -= 1;
                f.submit();
            }

            function next() {
                month += 1;
                f.submit();
            }
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="cal" method="post">
            <table border="1">
                <tr>
                    <td colspan="3"><button onclick="prev(this.form)"><<</button><label>month :</label><script>document.write(month)</script><button onclick="next(this.form)">>></button></td>
                <br><br><input type="text" value="a"/>
                </tr>
                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                </tr>
                <tr>
                    <td>a</td>
                    <td>b</td>
                    <td>c</td>
                </tr>
            </table>
        </form>
    </body>
</html>
