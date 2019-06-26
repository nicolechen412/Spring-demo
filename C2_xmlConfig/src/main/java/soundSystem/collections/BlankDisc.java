/**
 * FileName: BlankDisc
 * Author: nicole
 * Date: 2019/5/19 17:15
 * Description:
 */

package soundSystem.collections;/*
 * author: nicole
 * date: 2019/5/19
 * desc:
 */

import soundSystem.CompactDisc;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;


    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int number) {

    }

}
