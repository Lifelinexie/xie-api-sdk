package com.xwl.apiclientsdk.model.request;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xwl.apiclientsdk.model.response.ResultResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: BaseRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:13
 * @Version: 1.0
 * @Modified By:
 */
public abstract class BaseRequest<O, T extends ResultResponse> {
	private Map<String, Object> requestParams = new HashMap<>();

	/**
	 * get方法
	 *
	 */
	public abstract String getMethod();

	/**
	 * 获取路径
	 *
	 * @return {@link String}
	 */
	public abstract String getPath();

	/**
	 * 获取响应类
	 *
	 * @return {@link Class}<{@link T}>
	 */
	public abstract Class<T> getResponseClass();

	@JsonAnyGetter
	public Map<String, Object> getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(O params) {
		this.requestParams = new Gson().fromJson(JSONUtil.toJsonStr(params), new TypeToken<Map<String, Object>>() {
		}.getType());
	}
}
