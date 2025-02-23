package com.xwl.apiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * @ProjectName: API-backend
 * @Package: com.xwl.apiclientsdk.utils
 * @ClassName: SignUtil
 * @Author: 23136
 * @Description:
 * @Date: 2025/1/14 21:19
 * @Version: 1.0
 * @Modified By:
 */
public class SignUtils {

	private static final Digester md5 = new Digester(DigestAlgorithm.MD5);
	public static String getSign(String body, String secretKey) {

		String content = body + "." + secretKey;
		return md5.digestHex(content);
	}
}
