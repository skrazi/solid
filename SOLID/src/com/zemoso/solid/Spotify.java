package com.zemoso.solid;

import com.zemoso.solid.dto.Podcast;
import com.zemoso.solid.dto.Song;


public class Spotify extends PlaylistManager implements MusicPlayer, PodcastPlayer {

    @Override
    public void playSong(Song song) {
        System.out.println("Spotify is playing the podcast " + song.getTitle() + " by " + song.getArtistName());
    }

    @Override
    public void searchSong(String songName) {
        System.out.println("Spotify is searching for " + songName + " in songs!");
    }

    @Override
    public void playPodcast(Podcast podcast) {
        System.out.println("Spotify is playing " + podcast.getPodcastName());
    }

    /*
    * Suppose there was a play() method in Song class and Spotify used that to play the song.
    * class Spotify {
    *           private Song song;
    *           public playSong() { song.play(); }
    * }
    * The high level class Spotify is dependent on the low level Song class to play the song
    * This has high coupling between the two classes. Creating an interface called MusicPlayer removes this.
    * The direction of dependency changes and both Spotify and Song are not dependent on MusicPlayer. Low coupling.
    * */

    /*
    * public Playlist createPlaylist(String name)
    * public Playlist addToPlaylist(Playlist playlist, Song song)
    * public Playlist removeFromPlaylist(Playlist playlist, Song song)
    * SRP implemented by moving these functions to PlaylistManager class
    * */

}
