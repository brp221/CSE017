/*
IBL2
@Bratislav Petkovic 
Playlist Class
*/
import java.util.ArrayList;

public class Playlist{
    private String name ;
    private ArrayList <Song> songs = new ArrayList<>();
    
    /**
     * Constructor 
     * @param the name
     */
    public Playlist(String name){
        this.name = name ;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSongs(Song song){
        songs.remove(song);
    }
    public ArrayList<Song> getSongs(){
        return this.songs;
    }

}