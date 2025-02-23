package com.xwl.apiclientsdk.model.enums;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.enums
 * @ClassName: RequestMethodEnum
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:09
 * @Version: 1.0
 * @Modified By:
 */
public enum RequestMethodEnum {
	/**
	 * GET请求
	 */
	GET("GET", "GET"),
	POST("POST", "POST");
	private final String text;
	private final String value;

	RequestMethodEnum(String text, String value) {
		this.text = text;
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public String getValue() {
		return value;
	}
}

