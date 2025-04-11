package com.entity.vo;

import com.entity.GudingzichanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 固定资产
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gudingzichan")
public class GudingzichanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资产编号
     */

    @TableField(value = "gudingzichan_uuid_number")
    private String gudingzichanUuidNumber;


    /**
     * 资产名称
     */

    @TableField(value = "gudingzichan_name")
    private String gudingzichanName;


    /**
     * 资产类型
     */

    @TableField(value = "gudingzichan_types")
    private Integer gudingzichanTypes;


    /**
     * 使用部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 存放地点
     */

    @TableField(value = "address_types")
    private Integer addressTypes;


    /**
     * 增加方式
     */

    @TableField(value = "add_types")
    private Integer addTypes;


    /**
     * 保管人员
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 资产状态
     */

    @TableField(value = "gudingzichan_status_types")
    private Integer gudingzichanStatusTypes;


    /**
     * 资产图片
     */

    @TableField(value = "gudingzichan_photo")
    private String gudingzichanPhoto;


    /**
     * 单位
     */

    @TableField(value = "gudingzichan_danwei")
    private String gudingzichanDanwei;


    /**
     * 制造厂家
     */

    @TableField(value = "gudingzichan_zhizaochangjia")
    private String gudingzichanZhizaochangjia;


    /**
     * 原价
     */

    @TableField(value = "gudingzichan_yuanjia")
    private Double gudingzichanYuanjia;


    /**
     * 现价
     */

    @TableField(value = "gudingzichan_xianjia")
    private Double gudingzichanXianjia;


    /**
     * 出厂日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "gudingzichan_time")
    private Date gudingzichanTime;


    /**
     * 资产描述
     */

    @TableField(value = "gudingzichan_content")
    private String gudingzichanContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：资产编号
	 */
    public String getGudingzichanUuidNumber() {
        return gudingzichanUuidNumber;
    }


    /**
	 * 获取：资产编号
	 */

    public void setGudingzichanUuidNumber(String gudingzichanUuidNumber) {
        this.gudingzichanUuidNumber = gudingzichanUuidNumber;
    }
    /**
	 * 设置：资产名称
	 */
    public String getGudingzichanName() {
        return gudingzichanName;
    }


    /**
	 * 获取：资产名称
	 */

    public void setGudingzichanName(String gudingzichanName) {
        this.gudingzichanName = gudingzichanName;
    }
    /**
	 * 设置：资产类型
	 */
    public Integer getGudingzichanTypes() {
        return gudingzichanTypes;
    }


    /**
	 * 获取：资产类型
	 */

    public void setGudingzichanTypes(Integer gudingzichanTypes) {
        this.gudingzichanTypes = gudingzichanTypes;
    }
    /**
	 * 设置：使用部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：使用部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：存放地点
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 获取：存放地点
	 */

    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 设置：增加方式
	 */
    public Integer getAddTypes() {
        return addTypes;
    }


    /**
	 * 获取：增加方式
	 */

    public void setAddTypes(Integer addTypes) {
        this.addTypes = addTypes;
    }
    /**
	 * 设置：保管人员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：保管人员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：资产状态
	 */
    public Integer getGudingzichanStatusTypes() {
        return gudingzichanStatusTypes;
    }


    /**
	 * 获取：资产状态
	 */

    public void setGudingzichanStatusTypes(Integer gudingzichanStatusTypes) {
        this.gudingzichanStatusTypes = gudingzichanStatusTypes;
    }
    /**
	 * 设置：资产图片
	 */
    public String getGudingzichanPhoto() {
        return gudingzichanPhoto;
    }


    /**
	 * 获取：资产图片
	 */

    public void setGudingzichanPhoto(String gudingzichanPhoto) {
        this.gudingzichanPhoto = gudingzichanPhoto;
    }
    /**
	 * 设置：单位
	 */
    public String getGudingzichanDanwei() {
        return gudingzichanDanwei;
    }


    /**
	 * 获取：单位
	 */

    public void setGudingzichanDanwei(String gudingzichanDanwei) {
        this.gudingzichanDanwei = gudingzichanDanwei;
    }
    /**
	 * 设置：制造厂家
	 */
    public String getGudingzichanZhizaochangjia() {
        return gudingzichanZhizaochangjia;
    }


    /**
	 * 获取：制造厂家
	 */

    public void setGudingzichanZhizaochangjia(String gudingzichanZhizaochangjia) {
        this.gudingzichanZhizaochangjia = gudingzichanZhizaochangjia;
    }
    /**
	 * 设置：原价
	 */
    public Double getGudingzichanYuanjia() {
        return gudingzichanYuanjia;
    }


    /**
	 * 获取：原价
	 */

    public void setGudingzichanYuanjia(Double gudingzichanYuanjia) {
        this.gudingzichanYuanjia = gudingzichanYuanjia;
    }
    /**
	 * 设置：现价
	 */
    public Double getGudingzichanXianjia() {
        return gudingzichanXianjia;
    }


    /**
	 * 获取：现价
	 */

    public void setGudingzichanXianjia(Double gudingzichanXianjia) {
        this.gudingzichanXianjia = gudingzichanXianjia;
    }
    /**
	 * 设置：出厂日期
	 */
    public Date getGudingzichanTime() {
        return gudingzichanTime;
    }


    /**
	 * 获取：出厂日期
	 */

    public void setGudingzichanTime(Date gudingzichanTime) {
        this.gudingzichanTime = gudingzichanTime;
    }
    /**
	 * 设置：资产描述
	 */
    public String getGudingzichanContent() {
        return gudingzichanContent;
    }


    /**
	 * 获取：资产描述
	 */

    public void setGudingzichanContent(String gudingzichanContent) {
        this.gudingzichanContent = gudingzichanContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
