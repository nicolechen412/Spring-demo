package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import soundsystem.CompactDisc;

/**
 * FileName: soundsystem.SgtPeppers
 * Author: nicole
 * Date: 2019/4/1 10:14
 * Description:
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";



    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
