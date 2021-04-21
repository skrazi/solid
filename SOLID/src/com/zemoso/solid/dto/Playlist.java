package com.zemoso.solid.dto;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songsList = new ArrayList<Song>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongsList() {
        return songsList;
    }

    public void addSong(Song song) {
        songsList.add(song);
    }

    public void removeSong(Song song) {
        songsList.remove(song);
    }
}
