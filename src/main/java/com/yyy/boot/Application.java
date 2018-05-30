package com.yyy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yinyiyun
 * @date 2018/5/28 13:12
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        // ApplicationInitListener addListeners或 ApplicationInitListener使用@Component注解
        //application.addListeners(new ApplicationInitListener());
        application.run(args);
    }

}
