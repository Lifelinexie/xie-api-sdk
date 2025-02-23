package com.xwl.apiclientsdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.params
 * @ClassName: PhoneParams
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/22 17:07
 * @Version: 1.0
 * @Modified By:
 */
@Data

@Accessors(chain = true)
public class PhoneInfoParams implements Serializable {

	@Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
	private String phone;
}
