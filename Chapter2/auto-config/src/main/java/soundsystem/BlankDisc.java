/**
 * FileName: BlankDisc
 * Author: nicole
 * Date: 2019/5/7 19:27
 * Description:
 */

package soundsystem;/*
 * author: nicole
 * date: 2019/5/7
 * desc:
 */

import java.sql.SQLOutput;

public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
