/**
 * FileName: BlankDisc
 * Author: nicole
 * Date: 2019/6/19 20:22
 * Description:
 */

package groupId;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    //与XML的属性占位符结合使用
    /*public BlankDisc(@Value("${disc.title}")  String title,
                     @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }*/

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }


}
