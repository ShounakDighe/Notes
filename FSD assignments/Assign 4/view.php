<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Student Records</h2>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Roll No/ID</th>
                <th>Contact Number</th>
            </tr>
            <?php
            include 'db.php';

            $sql = "SELECT first_name, last_name, roll_no, contact_number FROM students";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                while ($row = $result->fetch_assoc()) {
                    echo "<tr>
                            <td>" . htmlspecialchars($row["first_name"]) . "</td>
                            <td>" . htmlspecialchars($row["last_name"]) . "</td>
                            <td>" . htmlspecialchars($row["roll_no"]) . "</td>
                            <td>" . htmlspecialchars($row["contact_number"]) . "</td>
                          </tr>";
                }
            } else {
                echo "<tr><td colspan='4'>No records found</td></tr>";
            }

            $conn->close();
            ?>
        </table>
    </div>
</body>
</html>
