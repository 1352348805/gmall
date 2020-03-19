package com.asuk.gmall.ums.service.impl;

import com.asuk.gmall.ums.entity.Admin;
import com.asuk.gmall.ums.mapper.AdminMapper;
import com.asuk.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
