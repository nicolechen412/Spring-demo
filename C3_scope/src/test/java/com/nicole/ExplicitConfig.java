/**
 * FileName: ExplicitConfig
 * Author: nicole
 * Date: 2019/6/19 19:37
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExplicitConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Notepad notepad(){
        return new Notepad();
    }

    @Bean
    public Unique unique(){
        return new Unique();
    }
}
