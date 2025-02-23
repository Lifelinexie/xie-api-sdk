package com.xwl.apiclientsdk.exception;

import lombok.Data;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.exception
 * @ClassName: ErrorResponse
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:09
 * @Version: 1.0
 * @Modified By:
 */
@Data
public class ErrorResponse {
	private String message;
	private int code;
}

