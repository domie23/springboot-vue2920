package com.dao;

import com.entity.ZichanzhejiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanzhejiuView;

/**
 * 资产折旧 Dao 接口
 *
 * @author 
 */
public interface ZichanzhejiuDao extends BaseMapper<ZichanzhejiuEntity> {

   List<ZichanzhejiuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
