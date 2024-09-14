<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script>
        function validateForm() {
            var firstName = document.forms["regForm"]["first_name"].value;
            var lastName = document.forms["regForm"]["last_name"].value;
            var rollNo = document.forms["regForm"]["roll_no"].value;
            var password = document.forms["regForm"]["password"].value;
            var confirmPassword = document.forms["regForm"]["confirm_password"].value;
            var contactNumber = document.forms["regForm"]["contact_number"].value;

            if (firstName == "" || lastName == "" || rollNo == "" || password == "" || confirmPassword == "" || contactNumber == "") {
                alert("All fields must be filled out");
                return false;
            }
            if (password !== confirmPassword) {
                alert("Passwords do not match");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>Student Registration</h2>
        <form name="regForm" action="register_process.php" method="post" onsubmit="return validateForm()">
            First Name: <input type="text" name="first_name"><br>
            Last Name: <input type="text" name="last_name"><br>
            Roll No/ID: <input type="text" name="roll_no"><br>
            Password: <input type="password" name="password"><br>
            Confirm Password: <input type="password" name="confirm_password"><br>
            Contact Number: <input type="text" name="contact_number"><br>
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
