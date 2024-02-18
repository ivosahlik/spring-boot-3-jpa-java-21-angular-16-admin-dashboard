package cz.ivosahlik.config;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorHttpExchangesConfiguration {
    @Bean
    public HttpExchangeRepository httpTraceRepository() {
        return new InMemoryHttpExchangeRepository();
    }

    // https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide#httptrace-endpoint-renamed-to-httpexchanges
//    @Bean
//    public InMemoryHttpExchangeRepository createTraceRepository() {
//        return new InMemoryHttpExchangeRepository();
//    }
}