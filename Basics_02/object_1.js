//singleton -> If create with the help of constractor then its singleton.

//object Literals
//Object.create -> constractor(singleton)

const mySymb = Symbol("Key1")


const JsUser = {
    name : "Suman",
    "Full name" : "SUMAN DHAR",
    [mySymb] : "myKey1",//syntex for access symbol or declearing symbol
    age  : 18,
    location : "Kolkata",
    email : "sumandhar.vivo@gmail.com",
    isLoggedIn : false,
    lastLogging :["Monday" ," Sunday"]
}

//technique for declearing object
console.log(JsUser["email"]);//syntex
console.log((JsUser[mySymb]));//syntex 

JsUser.email = "jj@gmail.com" // syntex for changing the value of object.
//Object.freeze(JsUser)//after using freeze method the value of object cant be changed.

JsUser.greeting = function(){
    console.log("Hello Js user");
}

JsUser.greetingTwo = function(){
    console.log(`Hello Js user${this.name}`);
}

console.log(JsUser.greeting());
console.log(JsUser.greetingTwo());


