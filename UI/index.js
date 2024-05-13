class Car{
    constructor(brand){
        this.brand = brand;
    }
}

class Model extends Car {
    constructor(brand, mod) {
        super(brand);
        this.model = mod;
    }

    show() {
        return this.brand + ', It is a ' + this.model + " model" ; // Access brand directly
    }

    static display() {
        console.log("From static method");
    }
}
const car = new Model("TATA", 2024);
// console.log(Car.display());
Model.display(); // Correct way to call static method
console.log(car.show()); // Call instance method