/**
 * FileName: MagicConfig
 * Author: nicole
 * Date: 2019/6/18 19:00
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/18
 * desc:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
