package com.asuk.gmall.oms.service.impl;

import com.asuk.gmall.oms.entity.CartItem;
import com.asuk.gmall.oms.mapper.CartItemMapper;
import com.asuk.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
