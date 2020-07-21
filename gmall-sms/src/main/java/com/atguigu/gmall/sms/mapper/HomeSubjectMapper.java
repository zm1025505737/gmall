package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author mervin
 * @email 1025505737@qq.com
 * @date 2020-07-20 22:39:28
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubjectEntity> {
	
}
