function calCartPrice(...num1){//Rest operator
      return num1
}
console.log(calCartPrice(200,300,400)); 

const user = {
    usernmae : "suman",
    price : 999
}
function handelObject(anyobject){
    console.log(`username is ${anyobject.username} and price is ${anyobject.price}`);
}
//handelObject(user)
handelObject({ //direct declearetation
    username :"sam",
    price : 199
})