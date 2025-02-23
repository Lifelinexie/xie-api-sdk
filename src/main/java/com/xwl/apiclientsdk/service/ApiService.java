package com.xwl.apiclientsdk.service;

import com.xwl.apiclientsdk.client.XieApiClient;
import com.xwl.apiclientsdk.exception.ApiException;
import com.xwl.apiclientsdk.model.request.*;
import com.xwl.apiclientsdk.model.response.LoveResponse;
import com.xwl.apiclientsdk.model.response.RandomWallpaperResponse;
import com.xwl.apiclientsdk.model.response.ResultResponse;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.service
 * @ClassName: ApiService
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:06
 * @Version: 1.0
 * @Modified By:
 */
public interface ApiService {
	/**
	 * 通用请求
	 *
	 */

	<O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

	/**
	 * 通用请求
	 *
	 */
	<O, T extends ResultResponse> T request(XieApiClient xieApiClient, BaseRequest<O, T> request) throws ApiException;

	/**
	 * 获取随机壁纸
	 *
	 * @param request 要求
	 * @return {@link RandomWallpaperResponse}
	 * @throws ApiException 业务异常
	 */
	RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

	/**
	 * 获取随机壁纸
	 *
	 * @param request     要求
	 * @return {@link RandomWallpaperResponse}
	 * @throws ApiException 业务异常
	 */
	RandomWallpaperResponse getRandomWallpaper(XieApiClient xieApiClient, RandomWallpaperRequest request) throws ApiException;

	/**
	 * 随意情话
	 *
	 * @return {@link LoveResponse}
	 * @throws ApiException 业务异常
	 */
	LoveResponse randomLoveTalk() throws ApiException;

	/**
	 * 随意情话
	 *
	 */
	LoveResponse randomLoveTalk(XieApiClient xieApiClient) throws ApiException;


	/**
	 * 获取ip信息
	 *
	 * @param request     要求
	 * @return {@link ResultResponse}
	 * @throws ApiException 业务异常
	 */
	ResultResponse getIpInfo(XieApiClient xieApiClient, IpInfoRequest request) throws ApiException;

	/**
	 * 获取ip信息
	 *
	 * @param request 要求
	 * @return {@link ResultResponse}
	 * @throws ApiException 业务异常
	 */
	ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

	/**
	 * 获取天气信息
	 *
	 * @param request     要求
	 * @return {@link ResultResponse}
	 * @throws ApiException 业务异常
	 */
	ResultResponse getWeatherInfo(XieApiClient xieApiClient, WeatherRequest request) throws ApiException;

	/**
	 * 获取天气信息
	 *
	 * @param request 要求
	 * @return {@link ResultResponse}
	 * @throws ApiException 业务异常
	 */
	ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;


	ResultResponse getPhoneInfo(XieApiClient xieApiClient, PhoneInfoRequest request) throws ApiException;

	ResultResponse getPhoneInfo(PhoneInfoRequest request) throws ApiException;

}
