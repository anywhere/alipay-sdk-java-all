package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * k-v 键值对
 *
 * @author auto create
 * @since 1.0, 2019-07-10 17:08:04
 */
public class OrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5215482775268118468L;

	/**
	 * 键值
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 值
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}