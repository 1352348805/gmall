package com.asuk.gmall.cms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo	//启动dubbo自动配置
@MapperScan(basePackages = "com.asuk.gmall.cms.mapper")
@SpringBootApplication
public class GmallCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallCmsApplication.class, args);
	}

}
