package com.zemoso.solid;

import com.zemoso.solid.dto.Playlist;
import com.zemoso.solid.dto.Song;

public class iPod implements MusicPlayer {
    @Override
    public void playSong(Song song) {
        System.out.println("iPod is playing the song!!!");
    }

    @Override
    public void searchSong(String songName) {
        throw new AssertionError("I cannot search a song!!!");
    }
    // VIOLATION OF LISKOV SUBSTITUTION PRINCIPLE:
    // The iPod does not have a keyboard interface and hence it cannot search songs.
    // But since it implements the MusicPlayer it has to implement that method and throw an error
    // If somewhere there is the usage of MusicPlayer and iPod is replaced in it's position to perform a searchSong()
    // Then it will fail and that's bad code.

}
