<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>
<c:forEach var = "i" begin = "1" end = "5">
List<c:out value = "${i}"/><br/>
</c:forEach>
</h3>
<h2>
Through model ${listModel}
</h2>
</body>
</html>