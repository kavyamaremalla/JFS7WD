const function1 = () => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log('function 1 finished');
      resolve('message');
    }, 500);
  });
};

const funtcion2 = async () => {
  const result1 = await function1();
  console.log('result1: ', result1);
};

funtcion2();