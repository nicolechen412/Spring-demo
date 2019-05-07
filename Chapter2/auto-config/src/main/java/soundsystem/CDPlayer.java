/**
 * FileName: CDPlayer
 * Author: nicole
 * Date: 2019/4/1 11:07
 * Description:
 */

package soundsystem;/*
 * author: nicole
 * date: 2019/4/1
 * desc:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {



    private CompactDisc cd;



    /*public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }*/

    //@Autowired(required = false)
    // 如果没有匹配的bean，则处于未装配状态，不抛出异常
    //但如果代码中没有null检查，会抛出空指针异常
    /*@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }*/

    public void play() {
        cd.play();
    }

   /* @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }*/


}
