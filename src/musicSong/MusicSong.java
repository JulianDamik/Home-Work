package musicSong;

public class MusicSong {
	   private String songName;
	   private String songArtist;
	   private int songLength;

	   public MusicSong(String name, String artist, int length) {
	      songName = name;
	      songArtist = artist;
	      songLength = length;
	   }
	    
	   public int getSongLength() {
	      return songLength;
	   }
	}