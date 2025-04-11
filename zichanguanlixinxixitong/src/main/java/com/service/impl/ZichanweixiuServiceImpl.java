package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.ZichanweixiuDao;
import com.entity.ZichanweixiuEntity;
import com.service.ZichanweixiuService;
import com.entity.view.ZichanweixiuView;

/**
 * 资产维修 服务实现类
 */
@Service("zichanweixiuService")
@Transactional
public class ZichanweixiuServiceImpl extends ServiceImpl<ZichanweixiuDao, ZichanweixiuEntity> implements ZichanweixiuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZichanweixiuView> page =new Query<ZichanweixiuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
