package com.asuk.gmall.oms.service.impl;

import com.asuk.gmall.oms.entity.Order;
import com.asuk.gmall.oms.mapper.OrderMapper;
import com.asuk.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
