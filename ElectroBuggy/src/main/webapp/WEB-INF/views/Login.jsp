<!DOCTYPE html>
<html>
<style>


input[type=text], input[type=password] {
	width: auto;
	padding: 12px 20px;
	margin:  24px 0 12px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border;
}

button {
	background-color: #3399ff;
	padding: 14px 20px;
	margin:  24px 0 12px 0;
	border: none;
	cursor: pointer;
	width: auto;
}

/* button:hover {
	opacity: 0.8;
}
 */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* .imgcontainer {
	text-align: left;
	margin: 24px 0 12px 0;
}

img.avatar {

	width: 40%;
	border-radius: 50%;
} */



</style>
 
<%-- <jsp:include page="Navbar.jsp"></jsp:include>
  --%>
<body background="resources/img/bg2.jpg">


	<h2><center>Login Form</center></h2>

	<form action="perform_login" method="post">
	 <!-- <form action="login" method="post">  -->
<!-- 		<div class="imgcontainer">
			<img
				src="resources/img/User.jpg"
				alt="User" class="user">
		</div>
 -->
		<div class="container">
			<label><span class="glyphicons glyphicons-user"></span><b>Username</b></label><input type="text"
				placeholder="Enter Username" name="username" required><br>

			<label><span class="glyphicons glyphicons-lock"></span><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" minlength="4" maxlength="10"  onkeyup="checkPass();" required><br>

			<button type="submit" value="SUBMIT">Login</button>

			<button type="button" class="cancelbtn">Cancel</button>
		<input type="checkbox" checked="checked"> Remember me
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</div>

		<div class="container" style="background-color:">
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>

</body>

<jsp:include page="Footer.jsp"></jsp:include>
</html>
