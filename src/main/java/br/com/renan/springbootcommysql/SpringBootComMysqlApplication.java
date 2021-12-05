package br.com.renan.springbootcommysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.renan.springbootcommysql")
@EntityScan(basePackages = "br.com.renan.springbootcommysql.model")
public class SpringBootComMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootComMysqlApplication.class, args);
    }

}
