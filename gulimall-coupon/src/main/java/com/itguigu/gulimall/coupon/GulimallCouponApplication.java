package com.itguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 *@Description
 *@Author   zzw <dizhiwei@sinosoft.com.cn>
 *@Version  V1.0.0
 *@Since    1.0
 *@Date     2020/11/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class,args);
    }
}
