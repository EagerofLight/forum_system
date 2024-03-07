package space.kordegi.forumcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
public class ForumCoreApplication {

  public static void main(String[] args) {
    SpringApplication.run(ForumCoreApplication.class, args);
  }

}
