//syntex of declearing function

function sayMyName(){
    console.log("s");
    console.log("u");
    console.log("u");
    console.log("m");
    console.log("a");
    console.log("n");
}

//sayMyName()

// function addTwoNumber(number1,number2){//parameters
//   console.log( number1 + number2);
// }

// function addTwoNumber(number1,number2){//parameters
//     let result = number1 + number2
//     return result
// }
// const result = addTwoNumber(3,4)
// console.log(result);//argument

function loginUserMassage(username = "sam"){//default value
    if(!username){
    console.log("Please enter a username");
    return
}
return `${username} just logged in`
}
console.log(loginUserMassage("Suman"));