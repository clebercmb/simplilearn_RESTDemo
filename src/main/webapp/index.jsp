<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

    <form action="rest/EmployeeService/employees" method="post">
        <label>
            Enter id: <input type="text" name="empid"/><br/>
        </label>
        <label>
            Enter name: <input type="text" name="name"/><br/>
        </label>
        <label>
            Enter age: <input type="text" name="age"/><br/>
        </label>
        <label>
            Enter password: <input type="text" name="password"/><br/>
        </label>
        <input type="submit" value="save"/>
    </form>

</body>
</html>