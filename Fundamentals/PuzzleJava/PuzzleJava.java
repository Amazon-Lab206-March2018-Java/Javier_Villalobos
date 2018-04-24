import java.util.*;
import java.lang.Object;
public class PuzzleJava{

    public ArrayList<Integer> task1(int[] arr){
        ArrayList<Integer> greater= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]>10){
                greater.add(arr[i]);
            }
        }
        return greater;
    }
    public ArrayList<String> task2(String[] arr){
        Random random = new Random();
        ArrayList<String> greater=new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            int change = i + random.nextInt(arr.length - i);
            String temp = arr[i];
            arr[i] = arr[change];
            arr[change] = temp;
        }
        for (String i : arr){
            if(i.length()>5){
                greater.add(i);
            }
        }
        System.out.println(Arrays.toString(arr));
        return greater;
    }
    public void task3(){
        ArrayList<Character> arr= new ArrayList<Character>();
        for(char i='a';i!='{';i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr);
        if(arr.get(0)=='a' || arr.get(0)=='e' || arr.get(0)=='i' || arr.get(0)=='o' || arr.get(0)=='u'){
            System.out.println("This is the message");
        }
        System.out.println("First: " +arr.get(0));
        System.out.println("Last: "+arr.get(arr.size()-1));
    }
    public void task4(){
        Random random = new Random();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            arr.add(55 + random.nextInt((100 - 55) + 1));
        }
        System.out.println(arr);
    }
    public void task5(){
        Random random = new Random();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            arr.add(55 + random.nextInt((100 - 55) + 1));
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("Min: " +arr.get(0));
        System.out.println("Max: "+arr.get(arr.size()-1));
    }
    public void task6(){
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            s+= alphabet.charAt(random.nextInt(26));
        }
         
        System.out.println(s);
    }
    public void task7(){
        ArrayList<String> arr= new ArrayList<String>();
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        for (int count = 0; count < 10; count++) {
            String s = "";
            for (int i = 0; i < 5; i++) {
                s+= alphabet.charAt(random.nextInt(26));
            }
            arr.add(s);
        }
        System.out.println(arr);
    }
}