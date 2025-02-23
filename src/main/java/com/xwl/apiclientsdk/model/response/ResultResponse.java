package com.xwl.apiclientsdk.model.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.response
 * @ClassName: ResultResponse
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 15:15
 * @Version: 1.0
 * @Modified By:
 */
@Data
@NoArgsConstructor
public class ResultResponse implements Serializable {

	private static final long serialVersionUID = -6486005224268968744L;

	private Map<String, Object> data = new HashMap<>();

	@JsonAnyGetter
	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
