package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author mervin
 * @email 1025505737@qq.com
 * @date 2020-07-20 20:41:58
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

