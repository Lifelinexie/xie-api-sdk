package com.xwl.apiclientsdk.exception;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.exception
 * @ClassName: ApiException
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:07
 * @Version: 1.0
 * @Modified By:
 */
public class ApiException extends Exception {

	private static final long serialVersionUID = 2942420535500634982L;
	private int code;

	public ApiException(int code, String message) {
		super(message);
		this.code = code;
	}

	public ApiException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.code = errorCode.getCode();
	}

	public ApiException(ErrorCode errorCode, String message) {
		super(message);
		this.code = errorCode.getCode();
	}

	public int getCode() {
		return code;
	}
}
