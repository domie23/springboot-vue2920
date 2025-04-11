package com.entity.vo;

import com.entity.ZichanzhejiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资产折旧
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zichanzhejiu")
public class ZichanzhejiuVO implements Serializable {
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
     * 折旧价格
     */

    @TableField(value = "zichanzhejiu")
    private Double zichanzhejiu;


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

}
