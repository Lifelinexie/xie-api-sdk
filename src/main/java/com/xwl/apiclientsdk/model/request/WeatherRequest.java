package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.enums.RequestMethodEnum;
import com.xwl.apiclientsdk.model.params.WeatherParams;
import com.xwl.apiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: WeatherRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/17 15:53
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

	@Override
	public String getPath() {
		return "/weather";
	}

	/**
	 * 获取响应类
	 *
	 */
	@Override
	public Class<ResultResponse> getResponseClass() {
		return ResultResponse.class;
	}


	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}
}

