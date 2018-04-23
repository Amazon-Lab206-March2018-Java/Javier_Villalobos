import java.util.ArrayList;
import java.util.Arrays;
public class Basics{

    public void print1_255(){
        for(int count=0;count < 256 ; count ++){
            System.out.println(count);
        }
    }
    public void printOdds(){
        for(int i=1;i<256;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public void printSum(){
        int sum=0;
        for(int i=0;i<256;i++){
            System.out.println("New number :" +i);
            sum+=i;
            System.out.println("Sumr: "+sum);
        }
    }
    public void iterate_and_print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void find_max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    public void average(int[] arr){
        int avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        avg=avg/arr.length;
        System.out.println(avg);
    }
    public void array_with_ods(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1;i<256;i++){
            if(i%2==1){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
    public void greater_than_y(int[] arr, int y){
    int greater=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>y){
            greater++;
        }
    }
    System.out.println("There are "+greater+" values greater than "+y);
}

    public void square_the_values(int[] arr){
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            arr[i]*=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void zero_out_negatives(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void max_min_average(int[] arr){
        int avg=0,max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            avg+=arr[i];
        }
        avg=avg/arr.length;
        System.out.println("Max: "+ max+" Average: "+avg+" Min: "+min);
    }
    public void shift_array_values(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));
    }
}