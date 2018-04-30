function rSigma(num){
    if(num==0){
        return 0;
    }
    return num + rSigma(num-1);
}


console.log(rSigma(5));