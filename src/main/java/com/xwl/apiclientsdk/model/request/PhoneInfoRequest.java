package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.enums.RequestMethodEnum;
import com.xwl.apiclientsdk.model.params.PhoneInfoParams;
import com.xwl.apiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: PhoneRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/22 17:01
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class PhoneInfoRequest extends BaseRequest<PhoneInfoParams, ResultResponse> {

	@Override
	public String getPath() {
		return "/phoneInfo";
	}

	@Override
	public Class<ResultResponse> getResponseClass() {
		return ResultResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}
}
