package com.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.home.*.dao")
@SpringBootApplication
public class HomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    home启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }

}
