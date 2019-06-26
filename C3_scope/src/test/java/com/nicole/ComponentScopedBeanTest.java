/**
 * FileName: ScopedBeanTest
 * Author: nicole
 * Date: 2019/6/19 19:41
 * Description:
 */

package com.nicole;/*
 * author: nicole
 * date: 2019/6/19
 * desc:
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentScannedConfig.class)
public  class ComponentScopedBeanTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void  testProxyScope(){
        Notepad notepad = context.getBean(Notepad.class);
        Notepad notepad1 = context.getBean(Notepad.class);
        assertNotSame(notepad,notepad1);
    }

    @Test
    public void testSingletonScope(){
        Unique unique = context.getBean(Unique.class);
        Unique unique1 = context.getBean(Unique.class);
        assertSame(unique,unique1);
    }

//    @RunWith(SpringJUnit4ClassRunner.class)
//    @ContextConfiguration(classes=ComponentScannedConfig.class)
//    public static class ComponentScannedScopedBeanTest {
//
//        @Autowired
//        private ApplicationContext context;
//
//        @Test
//        public void testProxyScope() {
//            Notepad notepad1 = context.getBean(Notepad.class);
//            Notepad notepad2 = context.getBean(Notepad.class);
//            assertNotSame(notepad1, notepad2);
//        }
//
//        @Test
//        public void testSingletonScope() {
//            Unique thing1 = context.getBean(Unique.class);
//            Unique thing2 = context.getBean(Unique.class);
//            assertSame(thing1, thing2);
//        }
//
//    }

}
