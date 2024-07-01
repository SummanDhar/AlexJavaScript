//primitive(callByValue)
//7 Types: String,Number,Boolean,null,undefined,Symbole(for making any valu unique),BigInt

//JvaScript is a Dynamically typed language whice means that data types of variables are determined by the value they holdat run time.
const id = Symbol('123')
const anotherId = Symbol('123')
console.log(id == anotherId);
const bigNumber = 3444444444444444444444444488888888888885555n
console.log( typeof bigNumber);

//ReferenceType(NonPrimitive)
//1.Arrays 2.Objects 3.Function
const heros = ["saktiman","nagraj","doga"];
let muObj = {
    name: "Suman",
    age: 21,
}
const myFunction = function(){
    console.log("Hello World");
}