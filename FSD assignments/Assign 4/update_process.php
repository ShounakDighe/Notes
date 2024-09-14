<?php
include 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $roll_no = $_POST['roll_no'];
    $contact_number = $_POST['contact_number'];

    $stmt = $conn->prepare("UPDATE students SET contact_number = ? WHERE roll_no = ?");
    $stmt->bind_param("ss", $contact_number, $roll_no);

    if ($stmt->execute()) {
        echo "Update successful!";
    } else {
        echo "Error: " . $stmt->error;
    }

    $stmt->close();
    $conn->close();
}
?>
