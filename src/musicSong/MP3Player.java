package musicSong;

import java.util.ArrayList;

public class MP3Player {
   private ArrayList<MusicSong> mp3PlayerSongs;
    
   public MP3Player() {
      mp3PlayerSongs = new ArrayList<MusicSong>();
   }
    
   public void addSong(MusicSong newSong) {
      mp3PlayerSongs.add(newSong);
   }
         
   public int totalSongTime() {
      int total = 0;
      MusicSong temp;
      for(int i = 0; i < mp3PlayerSongs.size(); i++){
         temp = mp3PlayerSongs.get(i);
         total += temp.getSongLength();
         }
      return total;
   }
}