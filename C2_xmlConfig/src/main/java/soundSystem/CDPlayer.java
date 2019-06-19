/**
 * FileName: CDPlayer
 * Author: nicole
 * Date: 2019/4/1 11:07
 * Description:
 */

package soundSystem;/*
 * author: nicole
 * date: 2019/4/1
 * desc:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {


    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }



}
