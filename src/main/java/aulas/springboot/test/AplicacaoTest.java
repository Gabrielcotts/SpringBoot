package aulas.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "aulas.springboot")
public class AplicacaoTest {
    public static void main(String[] args) {
        SpringApplication.run(AplicacaoTest.class, args);


    }
}
