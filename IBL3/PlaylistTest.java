public class PlaylistTest{
    public static void main(String[] args){
        Song song1 = new Song("St.Tropez","Post Malone","Hollywood's Burning", 250);
        Song song2 = new Song("Love Yourz","J cole","2014 Forest Hills Drive", 400);
        Playlist daJamz = new Playlist("BP's List");
        daJamz.addSong(song1);
        daJamz.addSong(song2);
        System.out.println(song1.getTime());
        System.out.println(song2.getName()) ; 
        System.out.println(daJamz.getName()) ;
        System.out.println(daJamz.getSongs());
    }
}