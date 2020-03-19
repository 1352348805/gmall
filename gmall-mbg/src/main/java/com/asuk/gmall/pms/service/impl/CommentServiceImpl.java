package com.asuk.gmall.pms.service.impl;

import com.asuk.gmall.pms.entity.Comment;
import com.asuk.gmall.pms.mapper.CommentMapper;
import com.asuk.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
