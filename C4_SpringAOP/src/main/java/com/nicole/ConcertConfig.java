/**
 * FileName: ConcertConfig
 * Author: nicole
 * Date: 2019/6/25 11:09
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/25
 * desc:
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
//启用AspectJ自动代理
@EnableAspectJAutoProxy
@Configuration
public class ConcertConfig {
    public Audience audience(){
        return new Audience();
    }

}
