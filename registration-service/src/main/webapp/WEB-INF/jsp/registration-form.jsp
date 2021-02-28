<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
    <h1>Registration form</h1>
    <form:form method="POST" action="/registration" modelAttribute="userForm">
        <div>
            <form:label path="name">Name</form:label>
            <form:input path="name" type="text" placeholder="name" />
            <form:errors path="name" />
        </div>
        <div>
            <form:label path="surname">Surname</form:label>
            <form:input path="surname" type="text" placeholder="surname" />
            <form:errors path="surname" />
        </div>
        <div>
            <form:label path="patronymic">Patronymic</form:label>
            <form:input path="patronymic" type="text" placeholder="patronymic" />
            <form:errors path="patronymic" />
        </div>
        <button>Submit</button>
    </form:form>
</body>

</html>