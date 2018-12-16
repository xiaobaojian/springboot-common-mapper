<%@page contentType="text/html; UTF-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <table>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.pname}</td>
                <td>${product.price}</td>
                <td>${product.pcount}</td>
                <td>${product.description}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
