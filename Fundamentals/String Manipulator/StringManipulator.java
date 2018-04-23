public class StringManipulator{
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }
    public int getIndexOrNull( String string, char letter){
        return string.indexOf(letter);
    }
    public int getIndexOrNull( String string1, String string2){
        return string1.indexOf(string2);
    }
    public String concatSubstring( String string1, int start ,int end, String string2 ){
        return string1.substring(start,end).concat(string2);
    }
}