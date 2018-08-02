
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<h1 align=center>Registration form</h1>
</head>
<body>
<FORM name="myForm" METHOD="POST" ACTION="" >
<TABLE align="center">
  <TR>
    <TD>Username</TD>
    <TD>
      <INPUT TYPE="TEXT" NAME="username" required>
    </TD>
  </TR>
  
    <TR>
    <TD>Password</TD>
    <TD>
      <INPUT TYPE="password" NAME="password" required>
    </TD>
  </TR>
  
    <TR>
    <TD>Re-enter Password</TD>
    <TD>
      <INPUT TYPE="password" NAME="password1" required>
    </TD>
  </TR>
  
    <TR>
    <TD>DOB</TD>
    <TD>
      <INPUT TYPE="DATE" NAME="dob">
    </TD>
  </TR>
  
     <TR>
    <TD>Gender</TD>
    <TD>
       <input type="radio" name="gender" value="male"> Male<br>
  	<input type="radio" name="gender" value="female"> Female<br>
    </TD>
  </TR>
  
  <TR>
    <TD>Country</TD>
    <TD>  <select name="cars">
    <option value="India">India</option>
    <option value="UnitedStates">UnitedStates</option>
    <option value="China">China</option>
    <option value="Russia">Russia</option>
  </select></TD>
  </TR>
    <TR>
    <TD>Degree</TD>
    <TD>   <input type="checkbox" value="B.Tech">B.Tech<br>
           <input type="checkbox"  value="MBA" >MBA<br>
           <input type="checkbox"  value="DualDegree" >DualDegree<br>
    </TD>
  </TR>
     
</TABLE>
</FORM>

</body>
</html>
