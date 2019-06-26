/**
 * FileName: TrackCounter
 * Author: nicole
 * Date: 2019/6/25 14:35
 * Description:
 */

package soundSystem;
/*
 * author: nicole
 * date: 2019/6/25
 * desc:
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer,Integer> trackCount = new HashMap<>();

    @Pointcut("execution(* soundSystem.CompactDisc.playTrack(int))" +
                "&& args((trackNumber))")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCount.put(trackNumber,currentCount+1);
        System.out.println("currentCount:" + currentCount);

    }

    public int getPlayCount(int trackNumber) {
        return trackCount.containsKey(trackNumber) ? trackCount.get(trackNumber) : 0;
    }
}
