  package com.adanac.commonclient.constant;

/**
 * 
 * @author adanac
 *
 */
public enum AnchoredTypeEnum {

	//(0全部 ，1有关联，2无关联，3有引进关系)；
	ALL(0),
	HAS_REL(1),
	NO_REL(2),
	HAS_INTR(3);
	private int value;
	private AnchoredTypeEnum(int value)
	{
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	
}
