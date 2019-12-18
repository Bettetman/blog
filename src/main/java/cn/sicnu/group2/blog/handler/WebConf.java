package cn.sicnu.group2.blog.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cxf
 * @date 2019/12/18 10:26
 */
@Configuration
@EnableWebMvc
public class WebConf implements WebMvcConfigurer {
    //注册登录拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("启动登录拦截器");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/admin/**")
                .excludePathPatterns("/admin").excludePathPatterns("/admin/login");
    }
}
