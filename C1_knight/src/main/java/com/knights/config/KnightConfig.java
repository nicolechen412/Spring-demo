/**
 * FileName: KnightConfig
 * Author: nicole
 * Date: 2019/5/5 13:46
 * Description:
 */

package com.knights.config;/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */

import com.knights.BraveKnight;
import com.knights.Knight;
import com.knights.Quest;
import com.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
