<html>
    <head>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="col-lg-6">
            <form:form modelAttribute="demo" action="/demo" method="post" cssClass="form-horizontal">
                <fieldset>
                    <legend>Form Input Demo</legend>
                    <br>

                    <form:hidden path="demoId"/>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">Text</label>
                    </div>

                </fieldset>
            </form:form>
        </div>
    </body>

</html>