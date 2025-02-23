package com.xwl.apiclientsdk.exception;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.exception
 * @ClassName: BusinessException
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/13 17:08
 * @Version: 1.0
 * @Modified By:
 */
public class BusinessException extends RuntimeException {

	/**
	 * 错误码
	 */
	private final int code;

	public BusinessException(int code, String message) {
		super(message);
		this.code = code;
	}

	public BusinessException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.code = errorCode.getCode();
	}

	public BusinessException(ErrorCode errorCode, String message) {
		super(message);
		this.code = errorCode.getCode();
	}

	public int getCode() {
		return code;
	}
}

