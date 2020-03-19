package com.asuk.gmall.oms.service.impl;

import com.asuk.gmall.oms.entity.OrderItem;
import com.asuk.gmall.oms.mapper.OrderItemMapper;
import com.asuk.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
