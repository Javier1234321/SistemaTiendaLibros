<%-- 
    Document   : categories.jsp
    Created on : 8 jul 2026, 19:23:12
    Author     : javie
--%>
<%@ include file="../Layout/header.jsp" %>

<%@ include file="../Layout/slidebar.jsp" %>

<%@ include file="../Layout/navbar.jsp" %>

<h1 class="mt-0 text-center bg-light">Categorías</h1>
<table class="table table-hover table-striped">
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Descripcion</th>
        <th>Editar</th>
        <th>Ocultar</th>
    </tr>
    <c:forEach items="${categories}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.category}</td>
            <td>${p.description}</td>
            <td><a class="btn btn-sm btn-success" href="${pageContext.request.contextPath}/Category/form?id=${p.id}">Editar</a></td>
            <td>${p.bitStatus}</td>
        </tr>
    </c:forEach>
</table>
<%@ include file="../Layout/footer.jsp" %>
