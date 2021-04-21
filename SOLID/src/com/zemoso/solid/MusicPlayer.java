package com.zemoso.solid;

import com.zemoso.solid.dto.Song;

public interface MusicPlayer {
    void playSong(Song song);
    void searchSong(String songName);

    /*
    * Suppose I had a play method to play the MP3 file
    * void play(Object object) - VIOLATION OF OPC PRINCIPLE
    * This method would have to be modified for each playable object like a Speech. To make it adhere to OPC let's use
    * void playSong(Song song)
    * void playPodcast(Podcast podcast)
    * Now these two methods are good and work well but suppose ApplePodcast only plays podcasts
    * It cannot play music. But because ApplePodcast had implemented the MusicPlayer method it had to implement the
    * playSong() method. This is a VIOLATION OF INTERFACE SEGREGATION PRINCIPLE.
    * So we split the MP3Player interface into MusicPlayer, PodcastPlayer and AudioBookPlayer.
    * That way we don't force any class to implement methods they don't want to.
    * */
}
