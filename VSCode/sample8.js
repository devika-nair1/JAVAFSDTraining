function sum(... args){
    let sum = 0;
    for(let arg of args) sum += arg;
    return sum;
}
let x = sum(4,5,2,6,3,1);
console.log(x);