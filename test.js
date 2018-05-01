function rFibonacci(num){
    var x=1;
    if(num<=1){
        return x;
    }

    return x + rFibonacci(num-1);
}


console.log(rFibonacci(5));