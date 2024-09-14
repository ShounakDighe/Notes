<?php
include 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $roll_no = $_POST['roll_no'];

    $stmt = $conn->prepare("DELETE FROM students WHERE roll_no = ?");
    $stmt->bind_param("s", $roll_no);

    if ($stmt->execute()) {
        echo "Record deleted successfully!";
    } else {
        echo "Error: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
}
?>
