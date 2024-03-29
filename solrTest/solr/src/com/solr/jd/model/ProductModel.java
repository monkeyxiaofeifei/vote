package com.solr.jd.model;

/**
 * 商品对象模型
 * <p>
 * Title: ProductModel
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.入云龙
 * @date 2015-6-23下午5:09:33
 * @version 1.0
 */
public class ProductModel {
	// 商品编号
	private String pid;
	// 商品名称
	private String name;
	// 商品分类名称
	private String catalog_name;
	// 价格
	private float price;
	// 商品描述
	private String description;
	// 图片名称
	private String picture;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatalog_name() {
		return catalog_name;
	}

	public void setCatalog_name(String catalog_name) {
		this.catalog_name = catalog_name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
