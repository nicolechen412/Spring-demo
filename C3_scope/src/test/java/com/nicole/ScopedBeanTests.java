package com.nicole;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class ScopedBeanTests {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=ComponentScannedConfig.class)
  public static class ComponentScannedScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      assertNotSame(notepad1, notepad2);
    }
    
    @Test
    public void testSingletonScope() {
      Unique thing1 = context.getBean(Unique.class);
      Unique thing2 = context.getBean(Unique.class);
      assertSame(thing1, thing2);
    }
    
  }
  
  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=ExplicitConfig.class)
  public static class ExplicitConfigScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      assertNotSame(notepad1, notepad2);
    }
    
    @Test
    public void testSingletonScope() {
      Unique thing1 = context.getBean(Unique.class);
      Unique thing2 = context.getBean(Unique.class);
      assertSame(thing1, thing2);
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:scoped-beans.xml")
  public static class XMLConfigScopedBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void testProxyScope() {
      Notepad notepad1 = context.getBean(Notepad.class);
      Notepad notepad2 = context.getBean(Notepad.class);
      assertNotSame(notepad1, notepad2);
    }
    
    @Test
    public void testSingletonScope() {
      Unique thing1 = context.getBean(Unique.class);
      Unique thing2 = context.getBean(Unique.class);
      assertSame(thing1, thing2);
    }
    
  }


}
