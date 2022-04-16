# 工作多年总结的项目基础框架，如果您觉得本项目对你有用，请随手star，谢谢   

技术文章地址：https://www.jianshu.com/u/234a2cac6337   

# shuang-open-enterprise-platform   

开放的企业级平台，使用springcloud来实现   

还没有实现的：   
1，邮件发送 和 短信发送      
2，支付系统     
3，广告系统    
4，交易所    

工程说明：

```
-- shuang-business-center              业务系统    
    -- shuang-adsystem                 广告系统   
    -- shuang-file-upload              上传下载   
    -- shuang-oauth-center             oatuh认证中心   
        -- shuang-auth-jwt             jwt实现单点登陆（配合网关使用）   
        -- shuang-oauth2               oauth2实现单点登陆（配合网关使用）   
-- shuang-demo                         demo操作   
    -- shuang-commons-elasticsearch    es操作demo   
    -- shuang-commons-mongodb          mongodb操作demo  
    -- shuang-commons-rabbitmq         rabbitmq操作demo   
    -- shuang-commons-multi            多数据源配置demo   
        -- shuang-commons-multi-jdbctemplate         jdbcTemplate 的多数据源配置   
        -- shuang-commons-multi-jpa-annotation       jpa 注解方式的多数据源配置   
        -- shuang-commons-multi-jpa-scanpackage      jpa 扫描包方式的多数据源配置  
        -- shuang-commons-multi-kafka                kafka 多数据源配置  
        -- shuang-commons-multi-mongodb              mongodb 多数据源配置   
        -- shuang-commons-multi-mybatis-annotation   mybatis 注解方式的多数据源配置   
        -- shuang-commons-multi-mybatis-scanpackage  mybatis 扫描包方式的多数据源配置   
        -- shuang-commons-multi-shardingjdbc         shardingjdbc 方式多数据源配置   
-- shuang-eureka-server                 注册中心   
-- shuang-gateway-center                网关中心   
    -- shuang-api-gateway               springcloud+jwt    
    -- shuang-api-gateway-zuul          zuul+jwt   
    -- shuang-api-gateway-zuul-oauth2   zuul+oauth   
-- shuang-monitor-center                监控中心   
    -- shuang-monitor-admin-server      springboot项目 服务监控   
    -- shuang-hystrix-turbine-server    对服务集群的熔断数据汇总。然后交给 dashboard-server 显示   
    -- shuang-hystrix-dashboard-server  用于显示 turbine-server 汇总的数据   
    -- shuang-hystrix-dashboard-turbine 服务是将 turbine-server 和 dashboard-server 服务汇总起来作为一个工程   
-- shuang-generator-center              代码和项目自动生成 中心（脚手架）   
    -- shuang-mybatis-generator         生成 controller，service serviceImple，mapper，DO 等实体   
    -- shuang-project-generator         生成demo工程   
-- shuang-spring-boot-starter           支持工具   
    -- shuang-spring-boot-starter-datadog                  datadog组建
    -- shuang-spring-boot-starter-lock                     基于redisson实现的分布式锁  
    -- shuang-spring-boot-starter-log                      log日志组建
    -- shuang-spring-boot-starter-mail                     邮件发送模版组建
    -- shuang-spring-boot-starter-redis                    redis工具类组建   
    -- shuang-spring-boot-starter-dynamic-datasource       动态数据源，通过配置加载
    -- shuang-spring-boot-starter-dynamic-datasource-redis redis动态数据源，通过配置加载
-- shuang-support                       支持工具
    -- shuang-commons-support           基本工具工程 util，exception，errorcode，baseBean 全局枚举，多语言支持等等   
    -- shuang-commons-support-web       提供web功能的支持 跨域，请求和返回数据格式化，全局异常处理，   
-- shuang-spring-boot-starter-parent    系统依赖的parent    
-- shuang-spring-boot-dependencies      公司 依赖 jar 的版本管理（最顶层项目）   

```
