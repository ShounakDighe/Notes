// JavaScript for Form Validation
document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission for validation
    
    // Retrieve values
    var username = document.getElementById('username').value.trim();
    var email = document.getElementById('email').value.trim();
    var phone = document.getElementById('phone').value.trim();
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;

    // Validate fields
    if (username === '' || email === '' || phone === '' || password === '' || confirmPassword === '') {
        alert('All fields are required.');
        return;
    }

    // Validate phone number
    if (!/^\d{10}$/.test(phone)) {
        alert('Phone number must be 10 digits.');
        return;
    }

    // Validate password
    if (!/(?=.*[A-Z])(?=.*\d)(?=.*[@$#&]).{7,}/.test(password)) {
        alert('Password must be at least 7 characters long and include one capital letter, one digit, and one special character from (&, $, #, @).');
        return;
    }

    // Validate confirm password
    if (password !== confirmPassword) {
        alert('Passwords do not match.');
        return;
    }

    // Validate email
    if (!/^[^\s@]+@[^\s@]+\.[a-zA-Z]{2,3}$/.test(email)) {
        alert('Invalid email address.');
        return;
    }

    alert('Form submitted successfully!');
});

// JavaScript for DOM Manipulation
document.getElementById('changeImageButton').addEventListener('click', function() {
    document.getElementById('dynamicImage').src = 'new-image.jpg';
});

document.getElementById('changeTextButton').addEventListener('click', function() {
    this.textContent = 'Text Changed!';
});

function addTextNode() {
    var newNode = document.createTextNode('This is a new text node.');
    document.body.appendChild(newNode);
}

// Add a text node
addTextNode();

// Delete an element
function deleteNode() {
    var element = document.getElementById('dynamicImage');
    if (element) {
        element.remove();
    }
}

// Uncomment the following line to delete the image element
// deleteNode();
