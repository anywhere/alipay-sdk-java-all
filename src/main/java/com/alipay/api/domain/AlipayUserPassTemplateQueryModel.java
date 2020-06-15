package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡包卡券模板查询接口
 *
 * @author auto create
 * @since 1.0, 2020-05-08 19:45:41
 */
public class AlipayUserPassTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1648725613949217938L;

	/**
	 * 支付宝模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
