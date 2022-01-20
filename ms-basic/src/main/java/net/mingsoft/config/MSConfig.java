package net.mingsoft.config;

import net.mingsoft.basic.strategy.ILoginStrategy;
import net.mingsoft.basic.strategy.IModelStrategy;
import net.mingsoft.basic.strategy.ManagerLoginStrategy;
import net.mingsoft.basic.strategy.ManagerModelStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MSConfig {
   @Bean
   public IModelStrategy modelStrategy() {
      return new ManagerModelStrategy();
   }

   @Bean
   public ILoginStrategy loginStrategy() {
      return new ManagerLoginStrategy();
   }
}
