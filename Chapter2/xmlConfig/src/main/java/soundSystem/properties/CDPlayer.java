/**
 * FileName: CDPlayer
 * Author: nicole
 * Date: 2019/5/19 18:57
 * Description:
 */

package soundSystem.properties;/*
 * author: nicole
 * date: 2019/5/19
 * desc:
 */

import org.springframework.beans.factory.annotation.Autowired;
import soundSystem.CompactDisc;
import soundSystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }



    @Override
    public void play() {
        cd.play();
    }
}
