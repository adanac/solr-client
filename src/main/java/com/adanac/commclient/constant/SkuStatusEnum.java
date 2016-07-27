  package com.adanac.commclient.constant;

/**
 * 
 * 活动状态枚举值
 * @author adanac
 *
 */
public enum SkuStatusEnum {

	//商品状态(0未发布 ，1上架，2下架，3违规下架，4 已删除)；
	STATUS_NPUB(0),
	STATUS_UP(1),
	STATUS_DN(2),
	STATUS_WDN(3),
	STATUS_DEL(4)
	;
	private int value;
	private SkuStatusEnum(int value)
	{
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
