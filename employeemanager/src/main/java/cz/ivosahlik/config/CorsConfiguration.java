package cz.ivosahlik.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@Component
public class CorsConfiguration implements WebMvcConfigurer {

//    @Override
//    public void addCorsMappings(CorsRegistry corsRegistry) {
//        corsRegistry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200", "http://localhost:4500") //ideally a specific set of origins
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .maxAge(3600L)
//                .allowedHeaders("Origin", "Access-Control-Allow-Origin", "Content-Type",
//                        "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
//                        "Access-Control-Request-Method", "Access-Control-Request-Headers")
//                .exposedHeaders("Origin", "Access-Control-Allow-Origin", "Content-Type",
//                        "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
//                        "Access-Control-Request-Method", "Access-Control-Request-Headers")
//                .allowCredentials(true);
//    }
}
