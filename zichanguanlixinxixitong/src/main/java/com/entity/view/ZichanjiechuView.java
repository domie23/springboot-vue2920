package com.entity.view;

import com.entity.ZichanjiechuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 资产借出
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zichanjiechu")
public class ZichanjiechuView extends ZichanjiechuEntity implements Serializable {
    private static final long serialVersionUID = 1L;


	/**
	 * 资产编号
	 */
	private String zicanValue;


	public String getZicanValue() {
		return zicanValue;
	}

	public void setZicanValue(String zicanValue) {
		this.zicanValue = zicanValue;
	}

	//级联表 gudingzichan
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
				* 资产类型的值
				*/
				private String gudingzichanValue;
			/**
			* 使用部门
			*/
			private Integer bumenTypes;
				/**
				* 使用部门的值
				*/
				private String bumenValue;
			/**
			* 存放地点
			*/
			private Integer addressTypes;
				/**
				* 存放地点的值
				*/
				private String addressValue;
			/**
			* 增加方式
			*/
			private Integer addTypes;
				/**
				* 增加方式的值
				*/
				private String addValue;
			/**
			* 固定资产 的 保管人员
			*/
			private Integer gudingzichanYonghuId;
			/**
			* 资产状态
			*/
			private Integer gudingzichanStatusTypes;
				/**
				* 资产状态的值
				*/
				private String gudingzichanStatusValue;
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

		//级联表 yonghu
			/**
			* 保管人员姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 保管人员手机号
			*/
			private String yonghuPhone;
			/**
			* 保管人员身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ZichanjiechuView() {

	}

	public ZichanjiechuView(ZichanjiechuEntity zichanjiechuEntity) {
		try {
			BeanUtils.copyProperties(this, zichanjiechuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set gudingzichan
					/**
					* 获取： 资产编号
					*/
					public String getGudingzichanUuidNumber() {
						return gudingzichanUuidNumber;
					}
					/**
					* 设置： 资产编号
					*/
					public void setGudingzichanUuidNumber(String gudingzichanUuidNumber) {
						this.gudingzichanUuidNumber = gudingzichanUuidNumber;
					}
					/**
					* 获取： 资产名称
					*/
					public String getGudingzichanName() {
						return gudingzichanName;
					}
					/**
					* 设置： 资产名称
					*/
					public void setGudingzichanName(String gudingzichanName) {
						this.gudingzichanName = gudingzichanName;
					}
					/**
					* 获取： 资产类型
					*/
					public Integer getGudingzichanTypes() {
						return gudingzichanTypes;
					}
					/**
					* 设置： 资产类型
					*/
					public void setGudingzichanTypes(Integer gudingzichanTypes) {
						this.gudingzichanTypes = gudingzichanTypes;
					}


						/**
						* 获取： 资产类型的值
						*/
						public String getGudingzichanValue() {
							return gudingzichanValue;
						}
						/**
						* 设置： 资产类型的值
						*/
						public void setGudingzichanValue(String gudingzichanValue) {
							this.gudingzichanValue = gudingzichanValue;
						}
					/**
					* 获取： 使用部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 使用部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 使用部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 使用部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 存放地点
					*/
					public Integer getAddressTypes() {
						return addressTypes;
					}
					/**
					* 设置： 存放地点
					*/
					public void setAddressTypes(Integer addressTypes) {
						this.addressTypes = addressTypes;
					}


						/**
						* 获取： 存放地点的值
						*/
						public String getAddressValue() {
							return addressValue;
						}
						/**
						* 设置： 存放地点的值
						*/
						public void setAddressValue(String addressValue) {
							this.addressValue = addressValue;
						}
					/**
					* 获取： 增加方式
					*/
					public Integer getAddTypes() {
						return addTypes;
					}
					/**
					* 设置： 增加方式
					*/
					public void setAddTypes(Integer addTypes) {
						this.addTypes = addTypes;
					}


						/**
						* 获取： 增加方式的值
						*/
						public String getAddValue() {
							return addValue;
						}
						/**
						* 设置： 增加方式的值
						*/
						public void setAddValue(String addValue) {
							this.addValue = addValue;
						}
					/**
					* 获取：固定资产 的 保管人员
					*/
					public Integer getGudingzichanYonghuId() {
						return gudingzichanYonghuId;
					}
					/**
					* 设置：固定资产 的 保管人员
					*/
					public void setGudingzichanYonghuId(Integer gudingzichanYonghuId) {
						this.gudingzichanYonghuId = gudingzichanYonghuId;
					}

					/**
					* 获取： 资产状态
					*/
					public Integer getGudingzichanStatusTypes() {
						return gudingzichanStatusTypes;
					}
					/**
					* 设置： 资产状态
					*/
					public void setGudingzichanStatusTypes(Integer gudingzichanStatusTypes) {
						this.gudingzichanStatusTypes = gudingzichanStatusTypes;
					}


						/**
						* 获取： 资产状态的值
						*/
						public String getGudingzichanStatusValue() {
							return gudingzichanStatusValue;
						}
						/**
						* 设置： 资产状态的值
						*/
						public void setGudingzichanStatusValue(String gudingzichanStatusValue) {
							this.gudingzichanStatusValue = gudingzichanStatusValue;
						}
					/**
					* 获取： 资产图片
					*/
					public String getGudingzichanPhoto() {
						return gudingzichanPhoto;
					}
					/**
					* 设置： 资产图片
					*/
					public void setGudingzichanPhoto(String gudingzichanPhoto) {
						this.gudingzichanPhoto = gudingzichanPhoto;
					}
					/**
					* 获取： 单位
					*/
					public String getGudingzichanDanwei() {
						return gudingzichanDanwei;
					}
					/**
					* 设置： 单位
					*/
					public void setGudingzichanDanwei(String gudingzichanDanwei) {
						this.gudingzichanDanwei = gudingzichanDanwei;
					}
					/**
					* 获取： 制造厂家
					*/
					public String getGudingzichanZhizaochangjia() {
						return gudingzichanZhizaochangjia;
					}
					/**
					* 设置： 制造厂家
					*/
					public void setGudingzichanZhizaochangjia(String gudingzichanZhizaochangjia) {
						this.gudingzichanZhizaochangjia = gudingzichanZhizaochangjia;
					}
					/**
					* 获取： 原价
					*/
					public Double getGudingzichanYuanjia() {
						return gudingzichanYuanjia;
					}
					/**
					* 设置： 原价
					*/
					public void setGudingzichanYuanjia(Double gudingzichanYuanjia) {
						this.gudingzichanYuanjia = gudingzichanYuanjia;
					}
					/**
					* 获取： 现价
					*/
					public Double getGudingzichanXianjia() {
						return gudingzichanXianjia;
					}
					/**
					* 设置： 现价
					*/
					public void setGudingzichanXianjia(Double gudingzichanXianjia) {
						this.gudingzichanXianjia = gudingzichanXianjia;
					}
					/**
					* 获取： 出厂日期
					*/
					public Date getGudingzichanTime() {
						return gudingzichanTime;
					}
					/**
					* 设置： 出厂日期
					*/
					public void setGudingzichanTime(Date gudingzichanTime) {
						this.gudingzichanTime = gudingzichanTime;
					}
					/**
					* 获取： 资产描述
					*/
					public String getGudingzichanContent() {
						return gudingzichanContent;
					}
					/**
					* 设置： 资产描述
					*/
					public void setGudingzichanContent(String gudingzichanContent) {
						this.gudingzichanContent = gudingzichanContent;
					}




				//级联表的get和set yonghu
					/**
					* 获取： 保管人员姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 保管人员姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 保管人员手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 保管人员手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 保管人员身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 保管人员身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}









}
