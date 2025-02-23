package com.xwl.apiclientsdk.client;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * @ProjectName: API-backend
 * @Package: com.xwl.apiclientsdk.client
 * @ClassName: ApiClient
 * @Author: 23136
 * @Description:
 * @Date: 2025/1/14 21:17
 * @Version: 1.0
 * @Modified By:
 */
@Data
@NoArgsConstructor
@Component
public class XieApiClient {
	private String accessKey;

	private String secretKey;

	public XieApiClient(String accessKey, String secretKey) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

}
