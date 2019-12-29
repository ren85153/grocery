 ### 功能
- 完善登录：账号密码模式、短信验证码模式、社交账号模式均整合Spring security oAuth
- 单点登录：基于Srping security oAuth 提供单点登录接口，方便其他系统对接
- 动态路由：基于zuul实现动态路由，后端可配置化
- 终端管理：动态配置oauth终端，后端可配置化
- 字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否等。
- 服务限流：多种维度的流量控制（服务、IP、用户等）
- 消息总线：配置动态实时刷新
- 分库分表：shardingdbc分库分表策略
- 数据权限: 使用mybatis对原查询做增强，业务代码不用控制，即可实现。
- 聚合文档：基于zuul实现 swagger各个模块的实现
- 缓存管理：基于Cache Cloud 保证Redis 的高可用
 ### 模块
``` lua
grocery
├── grocery-auth -- 授权服务提供[3000]
├── grocery-common -- 系统公共模块 
├── grocery-config -- 配置中心[4001]
├── grocery-eureka -- 服务注册与发现[1025]
├── grocery-zuul -- ZUUL网关[9999]
├── grocery-modules -- 微服务模块
├    ├── grocery-upms-service -- 权限管理提供[4000]
```

eureka
config
auth
zuul
upms

