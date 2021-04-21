package com.zemoso.solid;

import com.zemoso.solid.dto.Podcast;

public class ApplePodcast implements PodcastPlayer {
    @Override
    public void playPodcast(Podcast podcast) {
        System.out.println("Apple podcast is playing " + podcast.getPodcastName());
    }

    /*
    * Suppose ApplePodcast has a play() method to play the mp3 file. Now it wants to add
    * audioBooks to it's application. It would have to do something like this
    //    public void play(Object object) {
    //        if(object.getClass() == Podcast.class) {
    //            System.out.println("Apple podcast is playing the podcast!!!");
    //        } else (object.getClass() == AudioBook.class) {
    //            System.out.println("Apple podcast is playing the audiobook!!!");
    //        }
    //    }
    * This is a VIOLATION OF THE OPEN CLOSE PRINCIPLE because everytime a new mp3 is added the function play()
    * has to be modified.
    * Creating an interface for each mp3 type and having separate play methods for each of them solves this problem.
    * Hence, each interface is not OPEN FOR EXTENSION BUT CLOSED FOR MODIFICATION.
    * */

}
