# 如果您觉得本项目对你有用，请随手star，谢谢
技术文章地址：https://www.jianshu.com/u/234a2cac6337

# elasticsearch使用
### 第一步 引入jar
```
<dependency>
    <groupId>com.shuang.commons</groupId>
    <artifactId>shuang-commons-elasticsearch</artifactId>
</dependency>
```
### 第二步 配置文件

```
spring:
  data:
    elasticsearch:
      cluster-name: es-mongodb
      cluster-nodes: 192.168.0.53:9300`
```
### 第三步 使用
```
@Autowired
private ElasticsearchService elasticsearchService;
```