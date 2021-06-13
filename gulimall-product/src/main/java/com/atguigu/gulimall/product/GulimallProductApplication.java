package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * 整合mybatis
 *      导入依赖
 *          mybatis stater
 *      配置
 *          配置数据源
 *              导入驱动
 *              yml 配置数据源
 *          配置mybatis
 *              使用@mapperscan
 *              设置sql 映射文件位置
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
