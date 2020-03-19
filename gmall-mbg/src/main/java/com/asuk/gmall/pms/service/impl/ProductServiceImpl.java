package com.asuk.gmall.pms.service.impl;

import com.asuk.gmall.pms.entity.Product;
import com.asuk.gmall.pms.mapper.ProductMapper;
import com.asuk.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
