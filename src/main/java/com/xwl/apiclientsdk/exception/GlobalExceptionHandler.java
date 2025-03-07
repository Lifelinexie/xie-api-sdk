package com.xwl.apiclientsdk.exception;

import com.xwl.apiclientsdk.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Stream;

import static com.xwl.apiclientsdk.exception.ErrorCode.PARAMS_ERROR;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.exception
 * @ClassName: GlobalExceptionHandler
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/22 15:05
 * @Version: 1.0
 * @Modified By:
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


	@ExceptionHandler(MethodArgumentNotValidException.class)
	public BaseResponse<?> handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		log.warn(e.getMessage());
		FieldError fieldError = e.getBindingResult().getFieldErrors().get(0);

		return ResultUtils.error(PARAMS_ERROR, "入参中的" + fieldError.getField() + fieldError.getDefaultMessage());
	}

	@ExceptionHandler(BusinessException.class)
	public BaseResponse<?> businessExceptionHandler(BusinessException e) {
		log.error("BusinessException", e);
		return ResultUtils.error(e.getCode(), e.getMessage());
	}

	@ExceptionHandler(RuntimeException.class)
	public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
		log.error("RuntimeException", e);
		return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
	}
}

