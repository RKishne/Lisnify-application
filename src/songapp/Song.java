package songapp;

public class Song {
    private String songName;
    private double durationOfSong;

    public Song(String songName, double durationOfSong) {
        this.songName = songName;
        this.durationOfSong = durationOfSong;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public double getDurationOfSong() {
        return durationOfSong;
    }

    public void setDurationOfSong(double durationOfSong) {
        this.durationOfSong = durationOfSong;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", durationOfSong=" + durationOfSong +
                '}';
    }
}
