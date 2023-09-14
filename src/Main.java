import songapp.Album;
import songapp.Song;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the application of lisnify!");



        Album album1=new Album("atif aslam","jal pari");

        album1.addNewSongToTheAlbum("Ehsaas",3.2);
        album1.addNewSongToTheAlbum("Yakeen",5.4);
        album1.addNewSongToTheAlbum("Addat",3.4);
        album1.addNewSongToTheAlbum("Gal sun na",5.2);

        Album album2=new Album("Arjit Singh","Sad Songs");

        album2.addNewSongToTheAlbum("Shayad",4.0);
        album2.addNewSongToTheAlbum("Kesariya",3.2);
        album2.addNewSongToTheAlbum("Heeriya",4.2);
        album2.addNewSongToTheAlbum("Deva Deva",5.3);

//        System.out.println(song2);
//
//        for(Song song : songs){
//            System.out.println(song);
//        }
//        for(Song song:Arjitalbum.getSongList()){
//            System.out.println(song);
//        }
//        for(Song song : atifalbum.getSongList()){
//            System.out.println(song);
//        }
//        System.out.println(atifalbum.findSong("Ehsaas"));

        List<Song> playlist=new ArrayList<>();
        album1.addSongToThePlaylist("Yakeen",playlist);
        album1.addSongToThePlaylist(4,playlist);
        album2.addSongToThePlaylist(1,playlist);
        album2.addSongToThePlaylist("Heeriya",playlist);



        printMenu();

        StartPlayingSongs(playlist);
    }

    private static void StartPlayingSongs(List<Song> playlist) {
        int index=0;
        System.out.println("Now playing " + playlist.get(index).toString());
        Scanner sc=new Scanner(System.in);
        boolean currentplaylist=true;

        while(currentplaylist) {
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    if (index <= playlist.size() - 1) {
                        index++;
                    } else {
                        index = 0;
                    }
                    System.out.println("Now playing " + playlist.get(index).toString());
                    break;
                case 2:
                    if (index == 0) {
                        index = 0;
                    } else {
                        index--;
                    }
                    System.out.println("Now playing " + playlist.get(index).toString());
                    break;
                case 3:
                    System.out.println("Now playing " + playlist.get(index).toString());
                    break;
                case 4:
                    printAllSongsOfPlaylist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    playlist.remove(index);
                    if(index==playlist.size()) {
                        index = 0;
                    }
                    break;
                case 7:
                    Collections.shuffle(playlist);
                    break;
                case 8:
                    currentplaylist=false;
                    break;
            }
        }
    }

    public static void printAllSongsOfPlaylist( List<Song> playlist){
        for(Song song:playlist){
            System.out.println(song.toString());
        }
    }
    private static void printMenu() {
        System.out.println("These are the options you can choose from");
        System.out.println("1. Play next Song");
        System.out.println("2. play previous Song");
        System.out.println("3. Play the same song");
        System.out.println("4. Show all Songs of playlist");
        System.out.println("5. print menu");
        System.out.println("6. Delete the current Song");
        System.out.println("7. Suffle the playist");
        System.out.println("8. Exit the playlist");
    }
}