package com.xwl.apiclientsdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ProjectName: api-client-sdk
 * @Package: com.xwl.apiclientsdk.model.params
 * @ClassName: NameParams
 * @Author: 23136
 * @Description:
 * @Date: 2025/2/9 11:12
 * @Version: 1.0
 * @Modified By:
 */
@Data
@Accessors(chain = true)
public class NameParams implements Serializable {
	private static final long serialVersionUID = 3815188540434269370L;
	private String name;
}
