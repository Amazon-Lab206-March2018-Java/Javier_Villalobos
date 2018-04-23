public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number%5 == 0 && number%3 == 0 ){
            return "FizBuzz";
        }
        else if (number%5 == 0){
            return "Buzz";
        }
        else if (number%3 == 0){
            return "Buzz";
        }
        else{
            String x=Integer.toString(number);
            return x;
        }
    }
}