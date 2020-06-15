package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.templatemessage.usertemplate.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniTemplatemessageUsertemplateApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1157891347318315548L;

	/** 
	 * 开发者申请的模板id号，使用该模板id号，开发者可以调用alipay.open.app.mini.templatemessage.send接口进行模板消息发送
	 */
	@ApiField("user_template_id")
	private String userTemplateId;

	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}
	public String getUserTemplateId( ) {
		return this.userTemplateId;
	}

}
