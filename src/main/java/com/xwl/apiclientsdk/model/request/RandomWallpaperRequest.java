package com.xwl.apiclientsdk.model.request;

import com.xwl.apiclientsdk.model.enums.RequestMethodEnum;
import com.xwl.apiclientsdk.model.params.RandomWallpaperParams;
import com.xwl.apiclientsdk.model.response.RandomWallpaperResponse;
import lombok.experimental.Accessors;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.request
 * @ClassName: RandomWallpaperRequest
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/17 15:54
 * @Version: 1.0
 * @Modified By:
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
	@Override
	public String getPath() {
		return "/randomWallpaper";
	}

	/**
	 * 获取响应类
	 *
	 */
	@Override
	public Class<RandomWallpaperResponse> getResponseClass() {
		return RandomWallpaperResponse.class;
	}


	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}
}

