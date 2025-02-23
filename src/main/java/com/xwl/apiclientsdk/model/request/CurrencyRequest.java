package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: CurrencyRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:14
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class CurrencyRequest extends BaseRequest<Object, ResultResponse> {
	private String method;
	private String path;

	/**
	 * get方法
	 *
	 * @return {@link String}
	 */
	@Override
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * 获取路径
	 *
	 * @return {@link String}
	 */
	@Override
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取响应类
	 *
	 * @return {@link Class}<{@link ResultResponse}>
	 */
	@Override
	public Class<ResultResponse> getResponseClass() {
		return ResultResponse.class;
	}
}

