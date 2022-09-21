<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gêneros</title>
</head>
    <body>
        <h1>Gêneros</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>NOME</th>
            </tr>
            <C:forEach var="g" items="${generos}">
                <tr>
                    <td>${g.id}</td>
                    <td>${g.nome}</td>
                </tr>
            </C:forEach>
        </table>
    </body>
</html>