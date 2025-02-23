package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.enums.RequestMethodEnum;
import com.xwl.apiclientsdk.model.response.LoveResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: LoveRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 15:13
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

	@Override
	public String getPath() {
		return "/loveTalk";
	}

	/**
	 * 获取响应类
	 *
	 */
	@Override
	public Class<LoveResponse> getResponseClass() {
		return LoveResponse.class;
	}


	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}
}

