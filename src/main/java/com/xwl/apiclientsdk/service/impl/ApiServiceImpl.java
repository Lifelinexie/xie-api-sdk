package com.xwl.apiclientsdk.service.impl;

import com.xwl.apiclientsdk.client.XieApiClient;
import com.xwl.apiclientsdk.exception.ApiException;
import com.xwl.apiclientsdk.model.request.*;
import com.xwl.apiclientsdk.model.response.LoveResponse;
import com.xwl.apiclientsdk.model.response.RandomWallpaperResponse;
import com.xwl.apiclientsdk.model.response.ResultResponse;
import com.xwl.apiclientsdk.service.ApiService;
import com.xwl.apiclientsdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.service.impl
 * @ClassName: ApiServiceImpl
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 15:21
 * @Version: 1.0
 * @Modified By:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

	@Override
	public LoveResponse randomLoveTalk() throws ApiException {
		LoveRequest request = new LoveRequest();
		return request(request);
	}

	@Override
	public LoveResponse randomLoveTalk(XieApiClient xieApiClient) throws ApiException {
		LoveRequest request = new LoveRequest();
		return request(xieApiClient, request);
	}

	@Override
	public ResultResponse getIpInfo(XieApiClient xieApiClient, IpInfoRequest request) throws ApiException {

		return request(xieApiClient,request);
	}

	@Override
	public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
		return request(request);
	}

	@Override
	public ResultResponse getWeatherInfo(XieApiClient xieApiClient, WeatherRequest request) throws ApiException {
		return request(xieApiClient, request);
	}

	@Override
	public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
		return request(request);
	}

	@Override
	public ResultResponse getPhoneInfo(XieApiClient xieApiClient, PhoneInfoRequest request) throws ApiException {
		return request(xieApiClient, request);
	}

	@Override
	public ResultResponse getPhoneInfo(PhoneInfoRequest request) throws ApiException {
		return request(request);
	}

	@Override
	public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
		return request(request);
	}

	@Override
	public RandomWallpaperResponse getRandomWallpaper(XieApiClient xieApiClient, RandomWallpaperRequest request) throws ApiException {
		return request(xieApiClient, request);
	}

}
