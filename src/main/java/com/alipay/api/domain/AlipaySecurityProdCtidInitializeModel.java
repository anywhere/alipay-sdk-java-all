package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网证初始化接口
 *
 * @author auto create
 * @since 1.0, 2018-11-07 09:21:37
 */
public class AlipaySecurityProdCtidInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2741773128954212758L;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
