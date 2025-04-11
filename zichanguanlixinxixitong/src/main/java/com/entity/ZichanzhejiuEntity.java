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
 * 资产折旧
 *
 * @author 
 * @email
 */
@TableName("zichanzhejiu")
public class ZichanzhejiuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZichanzhejiuEntity() {

	}

	public ZichanzhejiuEntity(T t) {
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
     * 折旧价格
     */
    @TableField(value = "zichanzhejiu")

    private Double zichanzhejiu;


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
	 * 设置：折旧价格
	 */
    public Double getZichanzhejiu() {
        return zichanzhejiu;
    }


    /**
	 * 获取：折旧价格
	 */

    public void setZichanzhejiu(Double zichanzhejiu) {
        this.zichanzhejiu = zichanzhejiu;
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
        return "Zichanzhejiu{" +
            "id=" + id +
            ", gudingzichanId=" + gudingzichanId +
            ", zichanzhejiu=" + zichanzhejiu +
            ", createTime=" + createTime +
        "}";
    }
}
