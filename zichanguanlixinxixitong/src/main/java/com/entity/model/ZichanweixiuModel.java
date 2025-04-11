package com.entity.model;

import com.entity.ZichanweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资产维修
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZichanweixiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资产
     */
    private Integer gudingzichanId;


    /**
     * 借用原因
     */
    private String newsText;


    /**
     * 维修状态
     */
    private Integer zichanweixiuStatusTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：资产
	 */
    public Integer getGudingzichanId() {
        return gudingzichanId;
    }


    /**
	 * 设置：资产
	 */
    public void setGudingzichanId(Integer gudingzichanId) {
        this.gudingzichanId = gudingzichanId;
    }
    /**
	 * 获取：借用原因
	 */
    public String getNewsText() {
        return newsText;
    }


    /**
	 * 设置：借用原因
	 */
    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
    /**
	 * 获取：维修状态
	 */
    public Integer getZichanweixiuStatusTypes() {
        return zichanweixiuStatusTypes;
    }


    /**
	 * 设置：维修状态
	 */
    public void setZichanweixiuStatusTypes(Integer zichanweixiuStatusTypes) {
        this.zichanweixiuStatusTypes = zichanweixiuStatusTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
