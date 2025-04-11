package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 资产借出
 *
 * @author 
 * @email
 */
@TableName("zichanjiechu")
public class ZichanjiechuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZichanjiechuEntity() {

	}

	public ZichanjiechuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 借用原因
     */
    @TableField(value = "zican_types")

    private Integer zicanTypes;

    public Integer getZicanTypes() {
        return zicanTypes;
    }

    public void setZicanTypes(Integer zicanTypes) {
        this.zicanTypes = zicanTypes;
    }

    /**
     * 数据添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Zichanjiechu{" +
            "id=" + id +
            ", gudingzichanId=" + gudingzichanId +
            ", yonghuId=" + yonghuId +
            ", newsText=" + newsText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
