<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
            color: #333;
        }

        h2 {
            text-align: center;
            color: #007BFF;
            font-size: 40px;
            margin-bottom: 5px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            text-align: center;
            padding: 12px;
            border: 1px solid #ddd;
        }

        th {
            background-color: #007BFF;
            color: #fff;
            vertical-align: center; /* Вертикальне вирівнювання тексту вгору */
        }

        .center {
            width: 10%;
        }

        .highlight {
            background-color: #ffcccc;
            font-weight: bold;
        }

        input[type="button"] {
            padding: 10px;
            margin: 5px;
            cursor: pointer;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        input[type="button"]:hover {
            background-color: #0056b3;
        }

        #sortSelection {
            background-color: #007BFF;
            border: 0;
            transition: background-color 0.3s ease, color 0.3s ease;
            color: #fff;
        }

        #sortSelection:focus {
            background-color: #fff;
            color: #007BFF;
        }
    </style>
</head>
<body>
<h2> Debtors </h2>
<input type="button" value="Main page" onclick="window.location.href='mainPage'"/>

<table>
    <thead>
    <tr>
        <th class="center">Name</th>
        <th class="center">Surname</th>
        <th class="center">Group name</th>
        <th class="center">Birthday</th>
        <th class="center">Health Certificate</th>
        <th class="center">Form</th>
        <th class="center">Safety Rules</th>
        <th class="center">Birth Certificate</th>
        <th class="center">Payment</th>
        <th class="center">Operation</th>
    </tr>
    </thead>
    <tbody>
    <#list allDebtor as child>
        <#assign updateButton = "/updateInfo?childId=" + child.id>
        <#assign deleteButton = "/deleteChild?childId=" + child.id>
        <tr>
            <td class="center">${child.name}</td>
            <td class="center">${child.surname}</td>
            <td class="center">${child.group_name}</td>
            <td class="center">${child.birthday}</td>
            <td class="center<#if child.health_certificate == '-'> highlight </#if>">${child.health_certificate}</td>
            <td class="center<#if child.form == '-'> highlight </#if>">${child.form}</td>
            <td class="center<#if child.safety_rules == '-'> highlight </#if>">${child.safety_rules}</td>
            <td class="center<#if child.birth_certificate == '-'> highlight </#if>">${child.birth_certificate}</td>
            <td class="center">${child.payment}</td>
            <td class="center">
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
