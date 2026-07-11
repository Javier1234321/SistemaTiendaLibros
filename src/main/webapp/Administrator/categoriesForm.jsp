<%@ include file="../Layout/header.jsp" %>

<%@ include file="../Layout/slidebar.jsp" %>

<%@ include file="../Layout/navbar.jsp" %>
<h1 class="mt-0 text-center bg-light">Actualizar Categorias</h1>
<form action="${pageContext.request.contextPath}/Category/form" method="post">
    <div class="row mb-2">
        <label for="name" class="col-form-label col-sm-2">Nombre de Categoria</label>
        <div class="col-sm-3">
            <input type="text" name="name" id="name" value="${category.category}" class="form-control">
        </div>
            <c:if test="${errores !=null && errores.containskey('nombre')}">
                <div style="color:red;">
                    ${errores.nombre}
                </div>
            </c:if>
    </div>
    <div class="row mb-2">
        <label for="description" class="col-form-label col-sm-2">Descripcion</label>
        <div class="col-sm-10">
            <input type="text" name="description" id="description" value="${category.description}" class="form-control">
        </div>
            <c:if test="${errores !=null && errores.containskey('nombre')}">
                <div style="color:red;">
                    ${errores.nombre}
                </div>
            </c:if>
    </div>
    <div class="row mb-2">
        <div>
            <input class="btn btn-primary" type="submit" value="${category.id!=null && category.id>0? "Editar": "Crear"}">
        </div>
    </div>
    
</form>
<%@ include file="../Layout/footer.jsp" %>