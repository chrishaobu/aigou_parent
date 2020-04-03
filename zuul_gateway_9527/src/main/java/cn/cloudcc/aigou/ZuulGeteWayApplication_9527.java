package cn.cloudcc.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulGeteWayApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGeteWayApplication_9527.class);
    }
}
