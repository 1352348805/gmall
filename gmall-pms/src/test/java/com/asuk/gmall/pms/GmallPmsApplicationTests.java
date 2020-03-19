package com.asuk.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.asuk.gmall.pms.entity.Brand;
import com.asuk.gmall.pms.entity.Product;
import com.asuk.gmall.pms.service.BrandService;
import com.asuk.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GmallPmsApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		Brand brand = new Brand();
//		brand.setName("哇哈哈");
//		brandService.save(brand);
		Brand brand = brandService.getById(53);
		System.out.println("ok--=-=-=-=-=-=-=-"+brand.getName());

	}

}
