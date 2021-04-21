package com.zemoso.solid;

import com.zemoso.solid.dto.AudioBook;

public class Audible implements AudioBookPlayer {

    @Override
    public void playAudioBook(AudioBook audioBook) {
        if(audioBook.getBought()) {
            System.out.println("Audible is playing the audiobook " + audioBook.getTitle()
                    + " by " + audioBook.getAuthor());
        } else {
            System.out.println("You need to buy the book first!!");
        }

    }

    @Override
    public void buyAudioBook(AudioBook audioBook) {
        audioBook.setBought(true);
        System.out.println("You just bought " + audioBook.getTitle() + " by " + audioBook.getAuthor());
        System.out.println("Enjoy reading!");
    }
}
