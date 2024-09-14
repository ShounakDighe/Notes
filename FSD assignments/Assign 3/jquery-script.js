$(document).ready(function() {
    // Change button text using jQuery
    $('#changeTextButton').click(function() {
        $(this).text('Text Changed with jQuery!');
    });

    // Set background-image using jQuery CSS property
    $('body').css('background-image', 'url("background.jpg")');

    // Access HTML form data using jQuery
    $('#registrationForm').submit(function(event) {
        event.preventDefault(); // Prevent form submission for validation
        
        var username = $('#username').val().trim();
        var email = $('#email').val().trim();
        var phone = $('#phone').val().trim();
        var password = $('#password').val();
        var confirmPassword = $('#confirmPassword').val();

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

    // Add attribute using jQuery
    $('#dynamicImage').attr('alt', 'Updated Dynamic Image');
});
