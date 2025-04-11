package com.entity.vo;

import com.entity.ZichanjiechuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资产借出
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zichanjiechu")
public class ZichanjiechuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资产
     */

    @TableField(value = "gudingzichan_id")
    private Integer gudingzichanId;


    /**
     * 借用人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 借用原因
     */

    @TableField(value = "news_text")
    private String newsText;


    /**
     * 数据添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：资产
	 */
    public Integer getGudingzichanId() {
        return gudingzichanId;
    }


    /**
	 * 获取：资产
	 */

    public void setGudingzichanId(Integer gudingzichanId) {
        this.gudingzichanId = gudingzichanId;
    }
    /**
	 * 设置：借用人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：借用人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：借用原因
	 */
    public String getNewsText() {
        return newsText;
    }


    /**
	 * 获取：借用原因
	 */

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
    /**
	 * 设置：数据添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：数据添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
