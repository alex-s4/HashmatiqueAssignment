import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){

        // Create a tracklist of type HashMap
        HashMap <String, String> trackList = new HashMap<String, String>();

        // Add in at least 4 songs that are stored by title
        trackList.put("Hey Judas!","Take a happy song and make it worse");
        trackList.put("Letter B","Letter B Letter C Letter D Letter E");
        trackList.put("Bohemian Rhapbeh","Is this the real fantasy? Or this just real life?");
        trackList.put("Purple Submarine","We all live in the Purple Submarine, Purple Submarine, Purple Submarine");

        // Pull out one of the songs by its track title
        String songLyrics1 = trackList.get("Bohemian Rhapbeh");
        System.out.println(songLyrics1);

        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> trackNames = trackList.keySet();
        for(String trackName : trackNames){
            System.out.println(trackName + ": " + trackList.get(trackName));
        }
    }
}