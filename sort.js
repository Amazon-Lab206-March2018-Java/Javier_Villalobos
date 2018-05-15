// function bubbleSort(arr){
//     for(var i=arr.length;i>=2;i--){
//         for(var count=0;count<i;count++){
//             if(arr[count]>arr[count+1]){
//                 var temp=arr[count];
//                 arr[count]=arr[count+1];
//                 arr[count+1]=temp;
//             }
//         }
//     }
//     return arr;
// }


// console.log(bubbleSort([4,6,8,1,9,10,3,7,2,0,5]));

// function selectionSort(arr){
//     var min=0;
//     for(var count=0;count<arr.length;count++){
//         for(var i=count;i<arr.length;i++){
//             if(arr[i]<arr[min]){
//                 min=i;
//             }
//         }
//         var temp=arr[count];
//         arr[count]=arr[min];
//         arr[min]=temp;
//     }
//     return arr;
// }

// console.log(selectionSort([4,6,8,10,1,3,7,2,5,0,9]));



function insertionSort(arr){
    for(var i=1;i<arr.length;i++){
        var pointer=i;
        var temp=arr[i];
        for(var count=i;count>0;count--){
            if(temp<arr[count-1]){
                arr[count]=arr[count-1];
                pointer--;
            }
        }
        arr[pointer]=temp;
    }
    return arr;
}


console.log(insertionSort([3,6,5,8,7,1,4,2]));