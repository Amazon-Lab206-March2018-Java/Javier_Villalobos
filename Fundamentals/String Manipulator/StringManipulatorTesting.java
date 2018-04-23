public class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);


        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null


        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer z = manipulator.getIndexOrNull(word, subString);
        Integer x = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(z); // 2
        System.out.println(x); // null


        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld
    }
}