package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.enums.RequestMethodEnum;
import com.xwl.apiclientsdk.model.params.NameParams;
import com.xwl.apiclientsdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: NameRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 15:14
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

	@Override
	public String getPath() {
		return "/name";
	}

	/**
	 * 获取响应类
	 *
	 */
	@Override
	public Class<NameResponse> getResponseClass() {
		return NameResponse.class;
	}


	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}
}
