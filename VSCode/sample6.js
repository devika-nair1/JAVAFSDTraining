const person = {
    firstName: "Devika",
    lastName:"Rakesh",
    age:24,
    eyeCoolor:"black"
};

let id = Symbol('id');
person[id] = 180115;

console.log(person[id]);