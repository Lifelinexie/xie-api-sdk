package com.xwl.apiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.response
 * @ClassName: LoveResponse
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 15:15
 * @Version: 1.0
 * @Modified By:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LoveResponse extends ResultResponse {
	private static final long serialVersionUID = -1038984103811824271L;

	private String content;
}
