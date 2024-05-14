const fs = require("fs").promises;

fs.readFile("file1.txt", "utf-8")
    .then((data) => {
        console.log(data);
        return fs.readFile("file2.txt", "utf-8"); // Return the promise
    })
    .then((data2) => {
        console.log(data2);
        return fs.readFile("file3.txt", "utf-8"); // Return the promise
    })
    .then((data3) => {
        console.log(data3);
        return fs.readFile("file3.txt", "utf-8"); // Return the promise
    })
    .catch((error) => console.log(error));