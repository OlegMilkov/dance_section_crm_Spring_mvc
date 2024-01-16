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
        }

        form {
            width: 50%;
            margin: 0 auto;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            border-radius: 10px;
        }

        input[type="text"], input[type="date"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h2>Employee Info</h2>

<form action="saveChild">

    <input type="hidden" name="id" value="${child.id}"/>

    Name<input type="text" name="name" value="${child.name!}"/>
    <br><br>
    Surname<input type="text" name="surname" value="${child.surname!}"/>
    <br><br>
    Group name<input type="text" name="group_name" value="${child.group_name!}"/>
    <br><br>
    Birthday<input type="date" name="birthday" value="${child.birthday!}"/>
    <br><br>

    Payment<input type="text" name="payment" value="${child.payment!}"/>
    <br><br>

    Health certificate
    <input type="radio" name="health_certificate" value="+" <#if child.health_certificate! == '+'>checked</#if>> Принесла
    <input type="radio" name="health_certificate" value="-" <#if child.health_certificate! == '-'>checked</#if>> Не принесла
    <br><br>

    Form
    <input type="radio" name="form" value="+" <#if child.form! == '+'>checked</#if>> Принесла
    <input type="radio" name="form" value="-" <#if child.form! == '-'>checked</#if>> Не принесла
    <br><br>

    Safety rules
    <input type="radio" name="safety_rules" value="+" <#if child.safety_rules! == '+'>checked</#if>> Принесла
    <input type="radio" name="safety_rules" value="-" <#if child.safety_rules! == '-'>checked</#if>> Не принесла
    <br><br>

    Birth certificate
    <input type="radio" name="birth_certificate" value="+" <#if child.birth_certificate! == '+'>checked</#if>> Принесла
    <input type="radio" name="birth_certificate" value="-" <#if child.birth_certificate! == '-'>checked</#if>> Не принесла
    <br><br>



    <input type="submit" value="OK">
</form>
</body>
</html>
