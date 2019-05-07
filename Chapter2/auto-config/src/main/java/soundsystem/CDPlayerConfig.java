/**
 * FileName: CDPlayerConfig
 * Author: nicole
 * Date: 2019/4/1 10:17
 * Description:
 */

package soundsystem;/*
 * author: nicole
 * date: 2019/4/1
 * desc:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
