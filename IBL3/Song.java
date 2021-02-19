/*
IBL2
@Bratislav Petkovic 
Playlist Class
*/

public class Song{
    private String name;
    private String artist;
    private String album ;
    private int time;

    public Song(String name, String artist,String album,int time){
        this.album = album ;
        this.name = name ;
        this.artist = artist ;
        this.time = time ;

    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }
    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }
    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

}