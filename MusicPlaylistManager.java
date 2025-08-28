import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        String[] playlist = {"Song 1", "Song 2", "Song 3", "Song 4", "Song 5"};
        System.out.println("Available Songs:");
        for(int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " + playlist[i]);
        }
        System.out.println("Select a action: 1. Play all songs 2. Play a song by index 3. Search a song by name 4. Exit");
        Scanner sc = new Scanner(System.in);
        Boolean exit = false;
        while(!exit) {
            int action = sc.nextInt();
            sc.nextLine();
            switch(action) {
                case 1:
                    System.out.println("Playing all songs:");
                    for(String song : playlist) {
                        System.out.println("Playing: " + song);
                    }
                    break;
                case 2:
                    System.out.println("Enter the index of the song to play (1 to " + playlist.length + "):");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if(index >= 1 && index <= playlist.length) {
                        System.out.println("Playing: " + playlist[index - 1]);
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the song to search:");
                    String name = sc.nextLine();
                    boolean found = false;
                    for(String song : playlist) {
                        if(song.equalsIgnoreCase(name)) {
                            System.out.println("Found and playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the music playlist manager.");
                    break;
                default:
                    System.out.println("Invalid action. Please select a valid option.");
            }
            if(!exit) {
                System.out.println("Select a action: 1. Play all songs 2. Play a song by index 3. Search a song by name 4. Exit");
            }
        }
    }
}
