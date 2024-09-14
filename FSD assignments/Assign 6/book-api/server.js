const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const bookRoutes = require('./routes/books');

const app = express();

// Middleware
app.use(cors());
app.use(bodyParser.json());
app.use('/books', bookRoutes);

// Connect to MongoDB
mongoose.connect('mongodb+srv://shounakdighe:shounak@shounakdighe.mnjgh.mongodb.net/?retryWrites=true&w=majority&appName=ShounakDighe', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

mongoose.connection.on('connected', () => {
    console.log('Connected to MongoDB');
});

mongoose.connection.on('error', (err) => {
    console.log(`MongoDB connection error: ${err}`);
});

// Start the server
const PORT = process.env.PORT || 5000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
