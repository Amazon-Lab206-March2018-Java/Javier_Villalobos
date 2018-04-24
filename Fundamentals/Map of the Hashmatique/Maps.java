import  java.util.*;
public class Maps{
    public void mapFunction(){
        HashMap<String,String> tracklist= new HashMap<>();
        tracklist.put("First Track", "Lyrics1");
        tracklist.put("Second Track", "Lyrics2");
        tracklist.put("Third Track", "Lyrics3");
        tracklist.put("Fourth Track", "Lyrics4");
        System.out.println(tracklist.get("First Track"));
        System.out.println(tracklist);
    }
}