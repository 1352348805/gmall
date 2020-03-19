package com.asuk.gmall.ums.service.impl;

import com.asuk.gmall.ums.entity.Member;
import com.asuk.gmall.ums.mapper.MemberMapper;
import com.asuk.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author asuk
 * @since 2020-03-17
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
