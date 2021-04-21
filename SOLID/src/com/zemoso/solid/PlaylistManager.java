package com.zemoso.solid;

import com.zemoso.solid.dto.Playlist;
import com.zemoso.solid.dto.Song;
import java.util.List;


public class PlaylistManager {

    public Playlist createPlaylist(String name) {
        Playlist playlist = new Playlist();
        playlist.setName(name);
        return playlist;
    }

    public void viewPlaylist(Playlist playlist) {
        List<Song> songList = playlist.getSongsList();
        for (int i = 0; i < songList.size(); i++ ) {
            Song song = songList.get(i);
            System.out.println(i+1 + "\t" + song.getTitle() + "\t\t" + song.getArtistName() + "\t" + song.getAlbumName());
        }
    }

    public Playlist addToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
        System.out.println("The song : " + song.getTitle() + " has been added to the playlist : " + playlist.getName());
        return playlist;
    }

    public Playlist removeFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
        System.out.println("The song : " + song.getTitle() + " has been removed from the playlist : " + playlist.getName());
        return playlist;
    }
}
