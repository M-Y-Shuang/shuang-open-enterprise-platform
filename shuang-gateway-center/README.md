

API网关 接管所有的入口流量，
类似Nginx的作用，将所有用户的请求转发给后端的服务器，
但网关做的不仅仅只是简单的转发，也会针对流量做一些扩展，
比如鉴权、限流、权限、熔断、协议转换、错误码统一、
缓存、日志、监控、告警等，这样将通用的逻辑抽出来，由网关统一去做，
业务方也能够更专注于业务逻辑，提升迭代的效率。 通过引入API网关，
客户端只需要与API网关交互，而不用与各个业务方的接口分别通讯，
但多引入一个组件就多引入了一个潜在的故障点，
因此要实现一个高性能、稳定的网关，也会涉及到很多点。


shuang-api-gateway              基于springcloud gateway来实现  
shuang-api-gateway-zuul         给予zuul来实现  
shuang-api-gateway-zuul-oauth2  给予oauth2.0来实现  