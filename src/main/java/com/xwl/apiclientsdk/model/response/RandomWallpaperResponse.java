package com.xwl.apiclientsdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.response
 * @ClassName: RandomWallpaperResponse
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/17 15:54
 * @Version: 1.0
 * @Modified By:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {
	private static final long serialVersionUID = -6467312483425078539L;
	private String imgurl;
}

