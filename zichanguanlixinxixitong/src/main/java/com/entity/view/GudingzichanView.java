package com.entity.view;

import com.entity.GudingzichanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 固定资产
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gudingzichan")
public class GudingzichanView extends GudingzichanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 资产类型的值
		*/
		private String gudingzichanValue;
		/**
		* 使用部门的值
		*/
		private String bumenValue;
		/**
		* 存放地点的值
		*/
		private String addressValue;
		/**
		* 增加方式的值
		*/
		private String addValue;
		/**
		* 资产状态的值
		*/
		private String gudingzichanStatusValue;



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

	public GudingzichanView() {

	}

	public GudingzichanView(GudingzichanEntity gudingzichanEntity) {
		try {
			BeanUtils.copyProperties(this, gudingzichanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
