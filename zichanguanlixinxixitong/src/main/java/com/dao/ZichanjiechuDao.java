package com.dao;

import com.entity.ZichanjiechuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanjiechuView;

/**
 * 资产借出 Dao 接口
 *
 * @author 
 */
public interface ZichanjiechuDao extends BaseMapper<ZichanjiechuEntity> {

   List<ZichanjiechuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
