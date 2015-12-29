package musicSong;

public class MusicSongRunner {
	   public static void main(String args[]) {
	      MP3Player testPlayer = new MP3Player();
	      MusicSong testSong;
	        
	      testSong = new MusicSong("Hips Don't Lie", "Shakira", 218);
	      if (testSong.getSongLength() == 218) {
	         System.out.println("Part A is correct.");
	      }
	      else {
	         System.out.println("Part A is incorrect.");
	      }
	        
	      testPlayer.addSong(testSong);
	      testPlayer.addSong(testSong);
	      testPlayer.addSong(testSong);
	      if (testPlayer.totalSongTime() == 654) {
	         System.out.println("Part B is correct.");
	      }
	      else {
	         System.out.println("Part B is incorrect.");
	      }

	      return;  
	   }
	}