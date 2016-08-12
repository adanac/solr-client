package com.adanac.commonclient.solr.dto;

import java.util.List;

/**
 * solr返回的商品对象
 * 
 * @author adanac
 *
 */
public class SolrGoodsDto
{

	private String skuId; // skuId
	private String spuId; // spuId
	private String title; // 商品标题
	private String picUrl; // 图片
	private Integer price; // 价格
	private String kw; // 关键字

	private List<String> fclassId; //分类Id，多个使用 ,分隔
	private List<String> fclassName; //分类名称，多个使用 ,分隔
	
	private String localCode;//商品编码
	private Double skuNumber; // 库存
	private Integer status; // 商品状态 0删除 ，1 已发布 2 未发布，3违规下架
	
	
	private Long classOne;//	一级类目	long
	private String classOneName;//	一级类目名称	textTitle
	private Long classTwo;//	二级类目	long
	private String classTwoName;//	二级类目名称	textTitle
	private Long classThree;//	三级类目	long
	private String classThreeName;//	三级类目名称	textTitle
	private Integer categoryId;//	品类id	int
	private String categoryName;//	品类名称	textTitle
	
	
	private String classPath; //汇总分类的名称以》分隔
	private List<String> skuAttr;//关键属性存储的格式为key_value
	private List<String> skuAttrDesc;//关键属性存储的格式为key_value
	
	private String barCode; // 商品条形码
	private String unit; // 单位
	private String promotdesc; // 促销语(描述)
	private String subTitle; // 副标题(规格)
	private Integer costPrice; // 成本价(进价)

	private String brandName;
	private String introductionId;//	引进商品Id  平台商品里才有值，保存的是商家商品Id
	private String anchoredId;//	挂靠商品Id  商家商品才有值，保存的是平台商品Id

	private Integer cooPeratorType;//企业类型[0,供应商|1,商户|2,平台]
	
	
	public Integer getCooPeratorType() {
		return cooPeratorType;
	}

	public void setCooPeratorType(Integer cooPeratorType) {
		this.cooPeratorType = cooPeratorType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getIntroductionId() {
		return introductionId;
	}

	public void setIntroductionId(String introductionId) {
		this.introductionId = introductionId;
	}

	public String getAnchoredId() {
		return anchoredId;
	}

	public void setAnchoredId(String anchoredId) {
		this.anchoredId = anchoredId;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPromotdesc() {
		return promotdesc;
	}

	public void setPromotdesc(String promotdesc) {
		this.promotdesc = promotdesc;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Integer costPrice) {
		this.costPrice = costPrice;
	}

	public List<String> getSkuAttrDesc() {
		return skuAttrDesc;
	}

	public void setSkuAttrDesc(List<String> skuAttrDesc) {
		this.skuAttrDesc = skuAttrDesc;
	}

	public List<String> getSkuAttr() {
		return skuAttr;
	}

	public void setSkuAttr(List<String> skuAttr) {
		this.skuAttr = skuAttr;
	}

	public String getClassPath() {
		return classPath;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	public Long getClassOne() {
		return classOne;
	}

	public void setClassOne(Long classOne) {
		this.classOne = classOne;
	}

	public String getClassOneName() {
		return classOneName;
	}

	public void setClassOneName(String classOneName) {
		this.classOneName = classOneName;
	}

	public Long getClassTwo() {
		return classTwo;
	}

	public void setClassTwo(Long classTwo) {
		this.classTwo = classTwo;
	}

	public String getClassTwoName() {
		return classTwoName;
	}

	public void setClassTwoName(String classTwoName) {
		this.classTwoName = classTwoName;
	}

	public Long getClassThree() {
		return classThree;
	}

	public void setClassThree(Long classThree) {
		this.classThree = classThree;
	}

	public String getClassThreeName() {
		return classThreeName;
	}

	public void setClassThreeName(String classThreeName) {
		this.classThreeName = classThreeName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<String>getFclassId() {
		return fclassId;
	}

	public void setFclassId(List<String> fclassId) {
		this.fclassId = fclassId;
	}

	public List<String> getFclassName() {
		return fclassName;
	}

	public void setFclassName(List<String> fclassName) {
		this.fclassName = fclassName;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public Double getSkuNumber() {
		return skuNumber;
	}

	public void setSkuNumber(Double skuNumber) {
		this.skuNumber = skuNumber;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSkuId()
	{
		return skuId;
	}

	public void setSkuId(String skuId)
	{
		this.skuId = skuId;
	}

	public String getSpuId()
	{
		return spuId;
	}

	public void setSpuId(String spuId)
	{
		this.spuId = spuId;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getPicUrl()
	{
		return picUrl;
	}

	public void setPicUrl(String picUrl)
	{
		this.picUrl = picUrl;
	}

	public Integer getPrice()
	{
		return price;
	}

	public void setPrice(Integer price)
	{
		this.price = price;
	}

	public String getKw()
	{
		return kw;
	}

	public void setKw(String kw)
	{
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "SearchGoodsDto [skuId=" + skuId + ", spuId=" + spuId + ", title=" + title + ", picUrl=" + picUrl
				+ ", price=" + price + ", kw=" + kw + ", fclassId=" + fclassId + ", fclassName=" + fclassName
				+ ", localCode=" + localCode + ", skuNumber=" + skuNumber + ", status=" + status + "]";
	}

	


}
