<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>com.shuang.commons</groupId>
        <artifactId>${projectName}</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>${projectName}-core</artifactId>
    <version>${r'${projects.version}'}</version>

    <dependencies>
        <dependency>
            <groupId>com.shuang.commons</groupId>
            <artifactId>${projectName}-bean</artifactId>
        </dependency>
        <dependency>
            <groupId>com.shuang.commons</groupId>
            <artifactId>shuang-commons-support-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.shuang.commons</groupId>
            <artifactId>shuang-spring-boot-starter-redis</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
        </dependency>
    </dependencies>

</project>

