package com.zemoso.solid.dto;

public class Song {
    private String title;
    private String artistName;
    private String albumName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /*
    * The Single Responsibility Principle is depicted in this project in a few ways:
    * 1. Not using a general class like MP3 files and separating them into Song, Podcast and Audiobook
    * shows how each class has a single responsibility.
    * 2. Not including the methods like playSong() and searchSong() in the Song class and using a separate
    * interface MusicPlayer to handle those functions shows SRP.
    * 3. Not managing playlists inside the Song class and using a Playlist class to add and remove songs
    * from playLists shows SRP.
    * */

}
