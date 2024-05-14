const fs = require("fs").promises;

 async function displayFiles() {
  try {
    let data1 = await fs.readFile("file1.txt", "utf-8");
    let data2 = await fs.readFile("file2.txt", "utf-8");
    let data3 = await fs.readFile("file3.txt", "utf-8");

    console.log(data1);
    console.log(data2);
    console.log(data3);
  } catch (error) {
    console.log(error);
  }
}

displayFiles();
