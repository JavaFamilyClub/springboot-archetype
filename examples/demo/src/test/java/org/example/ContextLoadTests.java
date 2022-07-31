package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author Jack Li
 * @date 2022/1/3 1:53 下午
 * @description
 */
@SpringBootTest
public class ContextLoadTests {

   @Autowired
   private ApplicationContext applicationContext;

   @Test
   void testContext() {
      Assertions.assertNotNull(applicationContext, "Context 加载失败!");
   }
}
