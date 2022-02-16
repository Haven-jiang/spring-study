package com.Haven.config;

import com.Haven.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //这个也会Spring容器托管, 注册到容器中,因为他本来就是一个@Component. @Configuration代表这是一个配置类就和我们之前看的beans.xml
@ComponentScan("com.Haven.pojo")
@Import(AppConfig1.class)
public class AppConfig {

    //注册一个bean, 这就相当与我们之前写的一个bean标签
    //这个方法的名字, 就相当于bean标签中的id属性
    //这个方法的返回值, 就相当于bean标签中的class属性
    @Bean
    public User user() {
        return new User();//就是返回要注入到bean的对象!
    }
}
