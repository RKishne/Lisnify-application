package songapp;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String artistName;
    private List<Song> songList;
    private String albumname;

    public Album(String artistName,String albumname){
        this.albumname=albumname;
        this.artistName=artistName;
        songList=new ArrayList<>();
    }
    public Album(String artistName, List<Song> songList, String albumname) {
        this.artistName = artistName;
        this.songList = songList;
        this.albumname = albumname;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }
    //find song method
    public boolean findSong(String title){
        for(Song song :songList){
            if(song.getSongName().equals(title)){
                return true;
            }
        }
        return false;
    }
    //add new song to the album
    public String addNewSongToTheAlbum(String title,double duration){
        if(findSong(title)){
            return "Song is already present in the Album";
        }
        Song newSong=new Song(title,duration);
        songList.add(newSong);
        return "New Song has been added with the title"+title+"in the Album";
    }
    // add song to the playlist by the help of song number
    public String addSongToThePlaylist(int songNo,List<Song> playlist){
        int index=songNo-1;//songNo -1 -> because song number start with 1 but in list index start with 0

        if(index<songList.size() && index>=0){
            Song song=songList.get(index);
            playlist.add(song);
            return "Song has been added successfully in the playlist";
        }
        return "Song number is out of range";
    }
    // add song to the playlist by the help of title
    public String addSongToThePlaylist(String title,List<Song> playlist){
        for(Song song:songList){
            if(song.getSongName().equals(title)){
                playlist.add(song);
                return "Song has been added successfully in the playlist!!!";
            }
        }
        return "Song counldn't find in the album";
    }
}
