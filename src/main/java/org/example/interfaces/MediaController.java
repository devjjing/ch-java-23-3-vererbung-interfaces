package org.example.interfaces;

public class MediaController  {

    /*@Override
    public void play() {

    }*/

    public void playMedia(Playable playable) {
        playable.play();
    }
}
