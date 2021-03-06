# 如果您觉得本项目对你有用，请随手star，谢谢
技术文章地址：https://www.jianshu.com/u/234a2cac6337

# shuang-spring-boot-starter-lock 分布式锁
该项目主要提供了 （以后会提供别的锁）：  
1，分布式锁的使用（Redission）  

#redis使用
### 第一步 引入jar
``` 
<dependency>
    <groupId>com.shuang.commons</groupId>
    <artifactId>shuang-spring-boot-starter-lock</artifactId>
</dependency>
``` 
### 第二步 配置文件
``` 
#### Redis服务器地址
spring.redis.host=0.0.0.0
#### Redis服务器连接端口
spring.redis.port=6379  
#### Redis服务器连接密码（默认为空）
spring.redis.password=
#### 分布式锁的数据库，一般不要和业务放在同一个数据库
spring.redis.database=9 
#### 连接超时时间 单位 ms（毫秒）
spring.redis.timeout=3000
#### 连接池最大连接数（使用负值表示没有限制）
spring.redis.lettuce.pool.max-active=8  
#### 连接池最大阻塞等待时间（使用负值表示没有限制）
spring.redis.lettuce.pool.max-wait=-1  
#### 连接池中的最大空闲连接
spring.redis.lettuce.pool.max-idle=8  
#### 连接池中的最小空闲连接
spring.redis.lettuce.pool.min-idle=0
``` 
### 第三步 使用
``` 
@Autowired
private RedisLock redisLock;
``` 

为了解决 集群redis环境下 锁的不一致问题 需加入 requestId，requestId为UUID，也可以为orderId
expireTime为锁的超时时间 默认为10秒
key为 锁的名称
``` 
//加锁
redisLock.tryLock(KEY,requestId);
或者redisLock.tryLock(KEY,requestId,expireTime);
try {
    //TODO 干事情
} catch (Exception e) {
    //异常处理
}finally{
    //释放锁
    redisLock.unLock(KEY，requestId);
}
``` 
##还有一种使用方式 在方法上加注解
``` 
key 锁的名称 key，
waitTime 尝试加锁，最多等待时间
leaseTime 上锁以后xxx秒自动解锁
@BizLock(key,waitTime,leaseTime) 
``` 
有个文章写的不错，可以看看
https://www.jianshu.com/p/f302aa345ca8

