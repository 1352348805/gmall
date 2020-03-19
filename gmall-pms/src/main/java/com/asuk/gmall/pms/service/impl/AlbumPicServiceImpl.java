package com.asuk.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.asuk.gmall.pms.entity.AlbumPic;
import com.asuk.gmall.pms.mapper.AlbumPicMapper;
import com.asuk.gmall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
