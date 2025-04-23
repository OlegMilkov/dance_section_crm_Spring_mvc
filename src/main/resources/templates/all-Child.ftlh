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

        input[type="button"],
        input[type="submit"]{
            padding: 10px;
            margin: 5px;
            cursor: pointer;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        input[type="button"]:hover,
        input[type="submit"]:hover {
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
    <title>Dance studio Db</title>
</head>
<body>
<h2>Students</h2>

<form action="addNewChild" method="post" style="display:inline;">
    <input type="submit" value="Add"/>
</form>

<input type="button" value="Debtor" onclick="window.location.href='showAllDebtor'"/>

<table>
    <thead>
    <tr>
        <th class="center">Name</th>
        <th class="center">Surname</th>
        <th class="center">
            <label for="sortSelection">Group name:</label>
            <select id="sortSelection" name="sortSelection" onchange="sortChildren(this.value)">
                <option value=""></option>
                <option value="sortedByGroupAsc">SortedByGroup 1-3</option>
                <option value="sortedByGroupDesc">SortedByGroup 3-1</option>
            </select>
        </th>
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
    <#list allChild as child>
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

                <form action="${deleteButton}" method="post" style="display:inline;">
                    <input type="hidden" name="_method" value="DELETE"/>
                    <input type="submit" value="Delete"/>
                </form>
            </td>
        </tr>
    </#list>
    </tbody>
</table>

<script>
    function sortChildren(value) {
        window.location.href = value;
    }
</script>
</body>
</html>
