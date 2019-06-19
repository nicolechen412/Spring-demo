package com.nicole;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.*;

/*
 * author: nicole
 * date: 2019/6/18
 * desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagicExistsTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void shouldNotNull(){
        assertTrue(context.containsBean("magic"));
    }


}