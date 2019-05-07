/**
 * FileName: KnightMain
 * Author: nicole
 * Date: 2019/5/5 13:48
 * Description:
 */

package com.knights;/*
 * author: nicole
 * date: 2019/5/5
 * desc:
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF.spring/knight.xml");
        //FileSystemXmlApplicationContext context =
                //new FileSystemXmlApplicationContext("src/main/resources/knight.xml");

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
