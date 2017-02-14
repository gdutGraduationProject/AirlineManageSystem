package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by ChenGeng on 2017/2/14.
 */

@SpringBootApplication
@EntityScan("cn.bean")
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }

}
