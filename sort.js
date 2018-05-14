function bubbleSort(arr){
    for(var i=arr.length;i>=2;i--){
        for(var count=0;count<i;count++){
            if(arr[count]>arr[count+1]){
                var temp=arr[count];
                arr[count]=arr[count+1];
                arr[count+1]=temp;
            }
        }
    }
    return arr;
}


console.log(bubbleSort([4,6,8,1,9,10,3,7,2,0,5]));

function selectionSort(arr){
    var min=0;
    for(var count=0;count<arr.length;count++){
        for(var i=count;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        var temp=arr[count];
        arr[count]=arr[min];
        arr[min]=temp;
    }
    return arr;
}

console.log(selectionSort([4,6,8,10,1,3,7,2,5,0,9]));