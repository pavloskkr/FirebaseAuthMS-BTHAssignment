package bth.assignment.FirebaseAuthMS.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++Done+++++++++++++++++++++++++++++++++++++++++++++");
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8100")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
