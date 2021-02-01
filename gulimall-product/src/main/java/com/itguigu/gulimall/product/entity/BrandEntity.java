package com.itguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.itguigu.common.valid.InsertGroup;
import com.itguigu.common.valid.ListValue;
import com.itguigu.common.valid.UpdateGroup;
import com.itguigu.common.valid.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 * 
 * @author 
 * @email 
 * @date 2020-11-19 00:44:40
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	@NotNull(message = "修改时id不能为空", groups = {UpdateGroup.class})
	@Null(message = "新增时id必须为空", groups = {InsertGroup.class})
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名称不能为空", groups = {InsertGroup.class, UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "必须是一个合法的url地址", groups = InsertGroup.class)
	@NotEmpty(message = "新增时URL不能为空", groups = InsertGroup.class)
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(groups = {InsertGroup.class, UpdateStatusGroup.class})
	@ListValue(values = {0,1}, message = "状态信息非预定范围", groups = {InsertGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母", groups = InsertGroup.class)
	@NotNull(message = "新增时检索首字母不能为空", groups = InsertGroup.class)
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0, message = "排序字段必须大于0")
	@NotEmpty
	private Integer sort;

}

