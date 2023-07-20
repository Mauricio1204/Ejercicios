<?php

$n1 = 0; $n2 = 0; $c = 0; $r = 0;

if(isset($_POST["btnCalcular"])){

    $n1 = (int)$_POST["txtn1"];
    $n2 = (int)$_POST["txtn2"];

    $c = (int)($n1/ $n2);
    $r = $n1 % $n2;

}
?> 
<html>
<head>
    <title>Problema 02</title>
    <style type="text/css">
    
    TextoFondo{
        background-color:#CCFFFF;
    }
    
    </style>
</head>
<body>
    <form method="post" action="Problema02.php">
    <table width="241" border="0">
    <tr>
    <td colspan="2"><strong>Problema 02</strong></td>
</tr>
<tr>
    <td width="81">Numero 1</td>
    <td width="150">
        <input name="txtn1" type="text" id="txtn1" value="<?=$n1?>"/>
    </td>
</tr>
<tr>
    <td>Numero 2</td>
    <td>
    <input name="txtn2" type="text" id="txtn2" value="<?=$n2?>"/>
</td>
</tr>
<tr>
    <td>Cociente</td>
    <td><input name="txtc" type="text" class="TextoFondo" id="txtc" value="<?=$c?>"></td>
</tr>
<tr>
    <td>Residuo</td>
    <td><input name="txtr" type="text" class="TextoFondo" id="txtr" value="<?=$r?>"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>
        <input name="btnCalcular" type="submit" id="btnCalcular" value="Calcular"/></td>
</tr>
</table>
</form>       
</body>
</html>