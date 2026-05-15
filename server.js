const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;
app.get('/', (req, res) => {
    res.send('Hello, World from Docker second node js application- rakhi !');
});
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
