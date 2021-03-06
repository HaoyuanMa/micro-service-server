package com.bhjx.accdoctor.fellow.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 陪诊员
 * 
 * @author mhy
 * @email mhy@bit.edu.cn
 * @date 2021-12-16 11:48:56
 */
@Data
@TableName("fms_fellow")
public class FellowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 头像
	 */
	private String header;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 区
	 */
	private String region;
	/**
	 * 详细地址
	 */
	private String detailAddress;
	/**
	 * 职业
	 */
	private String description;
	/**
	 * 个性签名
	 */
	private String sign;
	/**
	 * 状态 0:禁用 1:空闲 2:忙碌
	 */
	private Integer status;
	/**
	 * 粉丝数
	 */
	private Integer fansCount;
	/**
	 * 注册时间
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Double price;
	/**
	 * 年龄
	 */
	private Integer age;

}
