package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
*   逻辑删除
 *      配置全局 逻辑删除规则
 *      添加逻辑删除注解@TableLogic
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
