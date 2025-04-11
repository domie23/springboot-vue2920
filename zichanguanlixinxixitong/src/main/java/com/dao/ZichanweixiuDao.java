package com.dao;

import com.entity.ZichanweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanweixiuView;

/**
 * 资产维修 Dao 接口
 *
 * @author 
 */
public interface ZichanweixiuDao extends BaseMapper<ZichanweixiuEntity> {

   List<ZichanweixiuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
