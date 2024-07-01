//Numbers
const balance = new Number(100)
console.log(balance);

console.log(balance.toString().length);//toString
console.log(balance.toFixed(1));//tofixed
const otherNumber = 123.8987
console.log(otherNumber.toPrecision(4));//toPrecision
const hundreds = 10000000000
console.log(hundreds.toLocaleString('en-IN'));

// ************* Maths **************8
console.log(Math);//Object [Math] {}
console.log(Math.abs(-4));//absulate valu like -4 changed int 4 but 4 can not changed into -4
console.log(Math.round(4.2)); //give round of value output 4
console.log(Math.ceil(4.2));
console.log(Math.floor(4.2));
console.log(Math.min(4,5,6,7));
console.log(Math.max(4,5,6,7));
console.log(Math.random());
console.log((Math.random()*10) +1);

const min = 10
const max = 20

console.log(Math.floor(Math.random() * (max - min + 1)) + min);//get round value that is alawys >min value,(max - min + 1) we
//take the floor value ,is the value is 1.0 then floor value we get 0 so for avoiding this 0 we add +1 with (man-mix) =>(max - min +1)