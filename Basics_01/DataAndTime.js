//Date->JavaScript date objects represent a single moment in time in a platform independent format.(jan 1 1970) Date is object inJs
let myDate = new Date()
console.log(myDate.toString());
console.log(myDate.toLocaleDateString());
console.log(myDate.toDateString());
console.log(myDate.toISOString());
console.log(myDate.toJSON());
console.log(myDate.toLocaleString());

//let NewwDate = new Date(2023,0,23)
//console.log(NewwDate.toLocaleString());
let NewwDate = new Date("01-14-2024")
console.log(NewwDate.toLocaleString());

let myTimeStamp = Date.now()
console.log(myTimeStamp); //get time in milisec 
console.log(Math.floor(Date.now() / 1000));//for gettin the time into sec

let NeewwDate = new Date()
console.log(NeewwDate.getMonth() +1);



NeewwDate.toLocaleString('default',{
    weekday: "long",
    
})