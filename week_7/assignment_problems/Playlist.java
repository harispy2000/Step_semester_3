package week_7.assignment_problems;

import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }

        songs = new String[capacity];
    }

    public void addSong(String song) {
        if (song == null) {
            throw new IllegalArgumentException("Song cannot be null.");
        }
        if (songCount == songs.length) {
            throw new IllegalStateException("Playlist is full.");
        }

        songs[songCount] = song;
        songCount++;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}