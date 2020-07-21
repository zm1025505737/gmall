package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mervin
 * @email 1025505737@qq.com
 * @date 2020-07-20 22:24:04
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
