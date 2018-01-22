<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<#--我是注释-->
this is freemarker demo
<br/>

name:${name}<br/>
age:${age}<br/>

<#--遍历list-->
<#list list as l>${l} </#list><br/>

<#--遍历map-->
<#list datas?keys as key>
    key:${key}
value:${datas[key]}<br/>
</#list><br/>

username:${user.name}
username:${user.getName()}
</body>
</html>