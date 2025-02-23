package com.xwl.apiclientsdk.utils;

import com.xwl.apiclientsdk.exception.BaseResponse;
import com.xwl.apiclientsdk.exception.ErrorCode;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.utils
 * @ClassName: ResultUtils
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/22 15:08
 * @Version: 1.0
 * @Modified By:
 */
public class ResultUtils {

	/**
	 * 成功
	 *
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> success(T data) {
		return new BaseResponse<>(0, data, "ok");
	}

	/**
	 * 失败
	 *
	 * @param errorCode
	 * @return
	 */
	public static BaseResponse error(ErrorCode errorCode) {
		return new BaseResponse<>(errorCode);
	}

	/**
	 * 失败
	 *
	 * @param code
	 * @param message
	 * @return
	 */
	public static BaseResponse error(int code, String message) {
		return new BaseResponse(code, null, message);
	}

	/**
	 * 失败
	 *
	 * @param errorCode
	 * @return
	 */
	public static BaseResponse error(ErrorCode errorCode, String message) {
		return new BaseResponse(errorCode.getCode(), null, message);
	}
}

