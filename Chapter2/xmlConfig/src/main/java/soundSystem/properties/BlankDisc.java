/**
 * FileName: BlankDisc
 * Author: nicole
 * Date: 2019/5/19 17:32
 * Description:
 */

package soundSystem.properties;/*
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



    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}

