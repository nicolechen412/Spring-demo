package soundsystem;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*
 * author: nicole
 * date: 2019/4/1
 * desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest extends TestCase {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    //public final SystemOutRule logg = new SystemOutRule();

    @Autowired
    private MediaPlayer player;

    @Autowired
    //@Resource
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles\n",log.getLog());
        //assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles\n", logg.getLog());
    }
}