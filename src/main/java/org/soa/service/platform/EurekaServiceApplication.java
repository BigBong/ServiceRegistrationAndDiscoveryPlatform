package org.soa.service.platform;

/**
 * Created by frodo on 2017/8/3.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
