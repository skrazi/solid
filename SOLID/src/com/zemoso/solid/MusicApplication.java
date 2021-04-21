package com.zemoso.solid;

import com.zemoso.solid.dto.AudioBook;
import com.zemoso.solid.dto.Playlist;
import com.zemoso.solid.dto.Podcast;
import com.zemoso.solid.dto.Song;

public class MusicApplication {
    public static void main(String[] args) {

        Song song1 = new Song();
        song1.setTitle("Chicago Freestyle");
        song1.setArtistName("Drake");
        song1.setAlbumName("Scary Hours");

        Song song2 = new Song();
        song2.setTitle("Best I ever had");
        song2.setArtistName("Drake");
        song2.setAlbumName("Good life");

        Podcast podcast1 = new Podcast();
        podcast1.setPodcastName("JRE by Joe");

        AudioBook audioBook1 = new AudioBook();
        audioBook1.setTitle("The monk who sold his ferrari!");
        audioBook1.setAuthor("Robin Sharma");

        AudioBook audioBook2 = new AudioBook();
        audioBook2.setTitle("The Fault in our stars!");
        audioBook2.setAuthor("John Green");

        Spotify spotify = new Spotify();
        spotify.playSong(song1);
        spotify.playPodcast(podcast1);

        ApplePodcast applePodcast = new ApplePodcast();
        applePodcast.playPodcast(podcast1);

        Audible audible = new Audible();
        audible.buyAudioBook(audioBook1);
        audible.playAudioBook(audioBook1);

        audible.playAudioBook(audioBook2);

        Playlist playlist = spotify.createPlaylist("Workout");
        playlist = spotify.addToPlaylist(playlist, song1);
        playlist = spotify.addToPlaylist(playlist, song2);
        spotify.viewPlaylist(playlist);
        playlist = spotify.removeFromPlaylist(playlist, song1);
        spotify.viewPlaylist(playlist);


        MusicPlayer musicPlayer;
        musicPlayer = new Spotify();
        musicPlayer.searchSong("Baby Pluto");
        musicPlayer = new iPod();
        // musicPlayer.searchSong("Baby Pluto");
        // Throws exeception AssertionError
    }
}
