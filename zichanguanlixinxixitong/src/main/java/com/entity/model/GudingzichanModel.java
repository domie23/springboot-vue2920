package com.entity.model;

import com.entity.GudingzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 固定资产
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GudingzichanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资产编号
     */
    private String gudingzichanUuidNumber;


    /**
     * 资产名称
     */
    private String gudingzichanName;


    /**
     * 资产类型
     */
    private Integer gudingzichanTypes;


    /**
     * 使用部门
     */
    private Integer bumenTypes;


    /**
     * 存放地点
     */
    private Integer addressTypes;


    /**
     * 增加方式
     */
    private Integer addTypes;


    /**
     * 保管人员
     */
    private Integer yonghuId;


    /**
     * 资产状态
     */
    private Integer gudingzichanStatusTypes;


    /**
     * 资产图片
     */
    private String gudingzichanPhoto;


    /**
     * 单位
     */
    private String gudingzichanDanwei;


    /**
     * 制造厂家
     */
    private String gudingzichanZhizaochangjia;


    /**
     * 原价
     */
    private Double gudingzichanYuanjia;


    /**
     * 现价
     */
    private Double gudingzichanXianjia;


    /**
     * 出厂日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date gudingzichanTime;


    /**
     * 资产描述
     */
    private String gudingzichanContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：资产编号
	 */
    public String getGudingzichanUuidNumber() {
        return gudingzichanUuidNumber;
    }


    /**
	 * 设置：资产编号
	 */
    public void setGudingzichanUuidNumber(String gudingzichanUuidNumber) {
        this.gudingzichanUuidNumber = gudingzichanUuidNumber;
    }
    /**
	 * 获取：资产名称
	 */
    public String getGudingzichanName() {
        return gudingzichanName;
    }


    /**
	 * 设置：资产名称
	 */
    public void setGudingzichanName(String gudingzichanName) {
        this.gudingzichanName = gudingzichanName;
    }
    /**
	 * 获取：资产类型
	 */
    public Integer getGudingzichanTypes() {
        return gudingzichanTypes;
    }


    /**
	 * 设置：资产类型
	 */
    public void setGudingzichanTypes(Integer gudingzichanTypes) {
        this.gudingzichanTypes = gudingzichanTypes;
    }
    /**
	 * 获取：使用部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 设置：使用部门
	 */
    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 获取：存放地点
	 */
    public Integer getAddressTypes() {
        return addressTypes;
    }


    /**
	 * 设置：存放地点
	 */
    public void setAddressTypes(Integer addressTypes) {
        this.addressTypes = addressTypes;
    }
    /**
	 * 获取：增加方式
	 */
    public Integer getAddTypes() {
        return addTypes;
    }


    /**
	 * 设置：增加方式
	 */
    public void setAddTypes(Integer addTypes) {
        this.addTypes = addTypes;
    }
    /**
	 * 获取：保管人员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：保管人员
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：资产状态
	 */
    public Integer getGudingzichanStatusTypes() {
        return gudingzichanStatusTypes;
    }


    /**
	 * 设置：资产状态
	 */
    public void setGudingzichanStatusTypes(Integer gudingzichanStatusTypes) {
        this.gudingzichanStatusTypes = gudingzichanStatusTypes;
    }
    /**
	 * 获取：资产图片
	 */
    public String getGudingzichanPhoto() {
        return gudingzichanPhoto;
    }


    /**
	 * 设置：资产图片
	 */
    public void setGudingzichanPhoto(String gudingzichanPhoto) {
        this.gudingzichanPhoto = gudingzichanPhoto;
    }
    /**
	 * 获取：单位
	 */
    public String getGudingzichanDanwei() {
        return gudingzichanDanwei;
    }


    /**
	 * 设置：单位
	 */
    public void setGudingzichanDanwei(String gudingzichanDanwei) {
        this.gudingzichanDanwei = gudingzichanDanwei;
    }
    /**
	 * 获取：制造厂家
	 */
    public String getGudingzichanZhizaochangjia() {
        return gudingzichanZhizaochangjia;
    }


    /**
	 * 设置：制造厂家
	 */
    public void setGudingzichanZhizaochangjia(String gudingzichanZhizaochangjia) {
        this.gudingzichanZhizaochangjia = gudingzichanZhizaochangjia;
    }
    /**
	 * 获取：原价
	 */
    public Double getGudingzichanYuanjia() {
        return gudingzichanYuanjia;
    }


    /**
	 * 设置：原价
	 */
    public void setGudingzichanYuanjia(Double gudingzichanYuanjia) {
        this.gudingzichanYuanjia = gudingzichanYuanjia;
    }
    /**
	 * 获取：现价
	 */
    public Double getGudingzichanXianjia() {
        return gudingzichanXianjia;
    }


    /**
	 * 设置：现价
	 */
    public void setGudingzichanXianjia(Double gudingzichanXianjia) {
        this.gudingzichanXianjia = gudingzichanXianjia;
    }
    /**
	 * 获取：出厂日期
	 */
    public Date getGudingzichanTime() {
        return gudingzichanTime;
    }


    /**
	 * 设置：出厂日期
	 */
    public void setGudingzichanTime(Date gudingzichanTime) {
        this.gudingzichanTime = gudingzichanTime;
    }
    /**
	 * 获取：资产描述
	 */
    public String getGudingzichanContent() {
        return gudingzichanContent;
    }


    /**
	 * 设置：资产描述
	 */
    public void setGudingzichanContent(String gudingzichanContent) {
        this.gudingzichanContent = gudingzichanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
