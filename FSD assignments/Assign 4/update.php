<!DOCTYPE html>
<html>
<head>
    <title>Update Student Details</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script>
        function validateUpdateForm() {
            var contactNumber = document.forms["updateForm"]["contact_number"].value;
            if (contactNumber == "") {
                alert("Contact number must be filled out");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>Update Student Details</h2>
        <form name="updateForm" action="update_process.php" method="post" onsubmit="return validateUpdateForm()">
            Roll No/ID: <input type="text" name="roll_no"><br>
            Contact Number: <input type="text" name="contact_number"><br>
            <input type="submit" value="Update">
        </form>
    </div>
</body>
</html>
