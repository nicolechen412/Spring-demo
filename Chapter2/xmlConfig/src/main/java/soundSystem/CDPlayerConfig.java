/**
 * FileName: CDPlayerConfig
 * Author: nicole
 * Date: 2019/4/1 10:17
 * Description:
 */

package soundSystem;/*
 * author: nicole
 * date: 2019/4/1
 * desc:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//使用java装配bean
@Configuration

//为了使用显示配置，将scan注释
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
