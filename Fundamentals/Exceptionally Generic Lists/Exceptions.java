import java.util.*;
public class Exceptions{
    public void run(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList);
        for(int index = 0;index<myList.size();index++){
            try{
                Integer castedValue = (Integer) myList.get(index);
            }catch(ClassCastException e){
                System.out.println("Error on index "+index);
            }
        }
    }
}