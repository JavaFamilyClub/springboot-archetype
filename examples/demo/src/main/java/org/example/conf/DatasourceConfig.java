package org.example.conf;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Jack Li
 * @date 2021/9/15 11:21 上午
 * @description
 */
@Configuration
public class DatasourceConfig {

   /**
    * 创建数据源
    * @return DataSource
    */
   @Bean(name = "primaryDataSource")
   @Primary
   @ConfigurationProperties(prefix = "spring.datasource.primary")
   public DataSource dataSourceFirst() {
      return DataSourceBuilder.create().build();
   }

//   @Bean(name = "secondDataSource")
//   @ConfigurationProperties(prefix = "spring.datasource.second")
//   public DataSource dataSourceSecond() {
//      return DataSourceBuilder.create().build();
//   }
}
