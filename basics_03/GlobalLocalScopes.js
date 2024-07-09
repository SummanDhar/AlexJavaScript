// //{} -> scopes of function 
// let a =400//global scope

// if(true){// block scope
//     let a = 2
//     console.log("INNER" ,a); //dont use var because once you declear var in block scope then you cant use var outside block scope.
// }
// console.log(a);


function one(){ //function in between function child function can access all objects of parent function
    const usename = "Suman"

    function two(){
        const website = "Youtube"
        console.log(usename);
    }
    two()
}
one()


//for if else(samme as function)

//***************************Interesting*************************************** */

//if function stored in a veriable the we can not call function before the function it is a concept of hosting,but if i write a function like fumction a() then i 
//call this function before declear the function.


