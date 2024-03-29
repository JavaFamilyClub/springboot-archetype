package club.javafamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Jack Li
 * @date 2022/1/3 1:21 下午
 * @description
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {

   /**
    * 主启动类
    * @param args args
    */
   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}
