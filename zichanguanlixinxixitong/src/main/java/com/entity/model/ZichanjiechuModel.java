package com.entity.model;

import com.entity.ZichanjiechuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资产借出
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZichanjiechuModel implements Serializable {
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
     * 借用人
     */
    private Integer yonghuId;


    /**
     * 借用原因
     */
    private String newsText;


    /**
     * 数据添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：借用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：借用人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
	 * 获取：数据添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：数据添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
