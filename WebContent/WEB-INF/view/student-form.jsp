<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>


	<form:form action="processForm" modelAttribute = "student">
	
	First name: <form:input path="firstName"/>
	
	<br><br>
	
	Last name: <form:input path="lastName"/>
	
	<br><br>
	
	Country:
	
	<form:select path="country">
	
		<form:options items="${student.countryOptions}"/>	
	</form:select>
	
	<br><br>
	
	Favorite Language:
	
		C++ <form:radiobutton path ="favoriteLanguage" value= "C++"/>
		Java <form:radiobutton path ="favoriteLanguage" value= "Java"/>
		Ruby <form:radiobutton path ="favoriteLanguage" value= "Ruby"/>
		C# <form:radiobutton path ="favoriteLanguage" value= "C#"/>
		Python<form:radiobutton path ="favoriteLanguage" value= "Python"/>
	
	
	
	Operating Systems:
	
	Linux <form:checkbox path ="operatingSystems" value= "Linux"/>
	Windows <form:checkbox path ="operatingSystems" value= "Windows"/>
	Mac OS <form:checkbox path ="operatingSystems" value= "Mac OS"/>
	
	
	
	<br><br>
	
	
	
	<input type="submit" value= "Submit"/>
	</form:form>

</body>
</html>