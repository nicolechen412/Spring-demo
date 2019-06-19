/**
 * FileName: EnvironmentInjectionTest
 * Author: nicole
 * Date: 2019/6/19 20:32
 * Description:
 */

package groupId;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class EnvironmentInjectionTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = EnvironmentConfig.class)
    public static class InjectFromProperties{

        @Autowired
        private BlankDisc blankDisc;

        @Test
        public void assertBlankDiscProperties(){
            assertEquals("Sgt. Peppers Lonely Hearts Club Band",blankDisc.getTitle());
            assertEquals("The Beatles",blankDisc.getArtist());
        }
    }

}
