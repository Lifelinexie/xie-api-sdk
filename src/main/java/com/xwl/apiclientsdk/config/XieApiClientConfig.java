package com.xwl.apiclientsdk.config;

import com.xwl.apiclientsdk.client.XieApiClient;
import com.xwl.apiclientsdk.service.ApiService;
import com.xwl.apiclientsdk.service.impl.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk
 * @ClassName: XieApiClientConfig
 * @Author: 23136
 * @Description:
 * @Date: 2025/1/14 21:26
 * @Version: 1.0
 * @Modified By:
 */
@Configuration
@Data
@ComponentScan
@ConfigurationProperties("xie.api.client")
public class XieApiClientConfig {
	private String accessKey;

	private String secretKey;

	/**
	 * 网关
	 */
	private String host;

	@Bean
	public XieApiClient xieApiClient() {
		return new XieApiClient(accessKey, secretKey);
	}
	@Bean
	public ApiService apiService() {
		ApiServiceImpl apiService = new ApiServiceImpl();
		apiService.setXieApiClient(new XieApiClient(accessKey, secretKey));
		if (StringUtils.isNotBlank(host)) {
			apiService.setGatewayHost(host);
		}
		return apiService;
	}

}
