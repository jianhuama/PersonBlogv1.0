package com.jhm;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
        import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.jhm.web.admin"})
public class PersonBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonBlogApplication.class,args);
    }

}
