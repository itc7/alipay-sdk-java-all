package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataassets.metadata response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayZdataassetsMetadataResponse extends AlipayResponse {

	private static final long serialVersionUID = 3576512261878129981L;

	/** 
	 * 用户标签集合
	 */
	@ApiListField("result")
	@ApiField("customer_entity")
	private List<CustomerEntity> result;

	public void setResult(List<CustomerEntity> result) {
		this.result = result;
	}
	public List<CustomerEntity> getResult( ) {
		return this.result;
	}

}