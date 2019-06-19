/**
 * FileName: EnvironmentConfig
 * Author: nicole
 * Date: 2019/6/19 20:23
 * Description:
 */

package groupId;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class EnvironmentConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc(){
        return  new BlankDisc(env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }


}
