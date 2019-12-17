package cn.sicnu.group2.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class BlogApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run( BlogApplication.class, args );
    }
}
