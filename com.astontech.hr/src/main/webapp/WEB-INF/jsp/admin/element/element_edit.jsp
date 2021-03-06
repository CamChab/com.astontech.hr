<%@ include file="../includes/header.jsp" %>
<%@ include file="../includes/navbar.jsp" %>
<%@ include file="../includes/subnav_admin.jsp" %>

<div class="wrapper">

    <%--SIDEBAR HERE--%>
    <%@ include file="element_side_bar.jsp" %>

    <div id="main-wrapper" class="col-md-11 pull-right">
        <div class="col-lg-8 col-md-7 col-sm-6">
            <%--FORM--%>
            <c:set var="idx" value="0" scope="page"/>
            <form:form class="form-horizontal" modelAttribute="elementType" action="/admin/element/update" method="post">
                <form:hidden path="id" />
                <form:hidden path="version" />

                <div class="row">
                    <div class="form-group">
                        <label for="inputElementName" class="col-sm-2 control-label">Element Type</label>
                        <div class="col-sm-10">
                            <form:input path="elementTypeName" type="text" id="inputElementTypeName" cssClass="form-control"></form:input>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-10">
                        <hr>
                    </div>
                </div>

                <c:forEach items="${elementType.elementList}" var="element">
                    <form:hidden path="elementList[${idx}].id"/>
                    <form:hidden path="elementList[${idx}].version"/>
                    <div class="row">
                        <div class="form-group">
                            <label for="inputElement" class="col-sm-3 control-label">Element</label>
                            <div class="col-sm-7">
                                <div class="input-group">
                                    <form:input path="elementList[${idx}].elementName" id="inputElement" cssClass="form-control"/>
                                    <span class="input-group-btn">
                                        <button name="remove_${idx}" class="btn-btn-default">Remove</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <c:set var="idx" value="${idx + 1}" scope="page"/>
                </c:forEach>

                <div class="row">
                    <div class="form-group">
                        <label for="inputElement" class="col-sm-3 control-label">Element</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="inputNewElement"/>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <button class="btn btn-primary">Update</button>
                </div>

            </form:form>

        </div>
    </div>


</div>

<%@ include file="../includes/footer.jsp" %>