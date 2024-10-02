//type number
function sum (a,b){
    //let result = a + b => return result;
    return a+b;
}
console.log(sum(5,8));

//avec une autre variable
function addition(a , b) {
    if ((typeof(a) != "number") || (typeof(b) != "number"))
    {
        console.log("error");
        return 0;
    }
        return a + b;
}
console.log(addition(5,10));
console.log(addition(5,"d"));