//singleton or constructor

const tinderUser = new Object()
tinderUser.id = "123abc"
tinderUser.name = "suman"
tinderUser.isLoggedIn = false


//console.log(tinderUser);

const regularUser = {
    email : "suman@gmail.com",  // object of objects
    fullname : {
        userFullname :{
            firstname : "suman",
            lastnmae : "Dhar"
        }
    }
}

//console.log(regularUser.fullname.userFullname.firstname);//syntex for accessing the object

const obj1 = {1:"a",2:"b"}
const obj2 = {3:"c",4:"d"}

//const obj3 = Object.assign({},obj1,obj2) // assign used for merging two array
//console.log(obj3);

//spread operator ...
const obj3 = {...obj1, ...obj2}
console.log(obj3);


//when values comes from database

// const users = {
//     {-

//     },
//     {

//     }
//
console.log(tinderUser);

console.log(Object.keys(tinderUser));
console.log(Object.values(tinderUser));
console.log(Object.entries(tinderUser));

console.log(tinderUser.hasOwnProperty('isLoggedIn'));



const course = {
    coursename : "Js",
    price : "999",
    courseInstructor : "suman"
}

const {courseInstructor : Instructor} = course // syntex of deStructuring of objects
console.log(Instructor);

//API -> its like distribute my own work with others
