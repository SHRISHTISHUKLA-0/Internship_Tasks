const mongoose = require('mongoose');

mongoose.connect("mongodb://127.0.0.1:27017/Task_1_Auth");

const userSchema = mongoose.Schema({
    username: String,
    name: String,
    age: Number,
    email: String,
    password: String,
    post: [{ type: mongoose.Schema.Types.ObjectId, ref: "posts"}],
});

module.exports = mongoose.model('user', userSchema);
