package com.voucher;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoucherApp implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(VoucherApp.class,args)    ;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("i am present in voucher class");
    }
}
