# xie-api-sdk
<p align="center">
    <img src=https://xie-api.oss-cn-shenzhen.aliyuncs.com/api-logo.png width=188/>
</p>

<h1 align="center">Xie-API-SDK</h1>
<p align="center"><strong>Xie-API 接口开放平台开发者工具包</strong></p>

<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.7+-green.svg"/>
</div>
### 目录结构 📝

```text
xieapisdk
    ├─client
    ├─config
    ├─exception
    ├─model
    │  ├─enums
    │  ├─params
    │  ├─request
    │  └─response
    ├─service
    │  └─impi
    └─utils
```

###  快速开始 🚀

**要开始使用 Xie-API-SDK，您需要按照以下简单进行操作:**

#### 1. 引入依赖坐标

```xml
<dependency>
    <groupId>com.xwl</groupId>
    <artifactId>xieapi-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>   
```

#### 2. 前往[xie-API 接口开放平台](http://14.103.243.24/) 获取开发者密钥对

#### 3. 初始化客户端QiApiClient对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "你的 accessKey";
  String secretKey = "你的 secretKey";
  XieApiClient client = new XieApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # Xie-API 配置
    xie:
      api:
        client:
          access-key: 你的 accessKey
          secret-key: 你的 secretKey
          # 本地网关地址，可修改为自己的网关，用于本地测试，线上网关地址等，不配置默认平台的网关
         # host: http://localhost:8090/api
    ```
    
  - properties
  
    ```properties
    xie.api.client.access-key=你的 accessKey
    xie.api.client.secret-key=你的 secretKey
    ```

#### 4. 使用API服务

   ```java
    @Resource
    private ApiService apiService;
   ```

#### 5. 发起请求示例

示例：随机壁纸（带参数）

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
	RandomWallpaperRequest randomWallpaperRequest = new RandomWallpaperRequest();
	RandomWallpaperResponse randomWallpaperResponse = apiService.getRandomWallpaper(randomWallpaperRequest);
	System.out.println(randomWallpaperResponse.getImgurl());
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    	XieApiClient client = new XieApiClient("你的 accessKey", "你的 secretKey");
	RandomWallpaperRequest randomWallpaperRequest = new RandomWallpaperRequest();
	RandomWallpaperResponse randomWallpaperResponse = apiService.getRandomWallpaper(client, randomWallpaperRequest);
	System.out.println(randomWallpaperResponse.getImgurl());
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "code": 0,
  "data": {
    "imgurl": "https://img.btstu.cn/api/images/5a70182014f16.jpg"
  },
  "message": "ok"
}
```

示例：随机情话（不带参数）

- 示例一 ：**通过配置文件 推荐👍**

```java
try {
	LoveResponse loveResponse = apiService.randomLoveTalk();
	System.out.println(loveResponse.getContent());
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入
```java
try {
    	XieApiClient client = new XieApiClient("你的 accessKey", "你的 secretKey");
	LoveResponse loveResponse = apiService.randomLoveTalk(client);
	System.out.println(loveResponse.getContent());
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "code": 0,
  "data": {
    "content": "我不需要什么奇迹奇迹，我现在就需要你。"
  },
  "message": "ok"
}
```
