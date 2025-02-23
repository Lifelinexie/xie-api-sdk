package com.xwl.apiclientsdk.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.exception
 * @ClassName: BaseResponse
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/22 15:07
 * @Version: 1.0
 * @Modified By:
 */
@Data
public class BaseResponse<T> implements Serializable {

	private int code;

	private T data;

	private String message;

	public BaseResponse(int code, T data, String message) {
		this.code = code;
		this.data = data;
		this.message = message;
	}

	public BaseResponse(int code, T data) {
		this(code, data, "");
	}

	public BaseResponse(ErrorCode errorCode) {
		this(errorCode.getCode(), null, errorCode.getMessage());
	}
}
