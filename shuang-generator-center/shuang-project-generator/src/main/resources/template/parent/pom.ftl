<?xml version="1.0" encoding="UTF-8"?>
<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://maven.apache.org/POM/4.0.0"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.shuang.commons</groupId>
        <artifactId>shuang-spring-boot-starter-parent</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modules>
        <module>${projectName}-bean</module>
        <module>${projectName}-common</module>
        <module>${projectName}-core</module>
        <module>${projectName}-rest</module>
        <module>${projectName}-sdk</module>
    </modules>
    <properties>
        <projects.version>1.0-SNAPSHOT</projects.version>
    </properties>

    <groupId>com.shuang.commons</groupId>
    <artifactId>${projectName}</artifactId>
    <description>${projectDesc}</description>
    <version>${r'${projects.version}'}</version>
    <packaging>pom</packaging>

    <!--管理依赖-->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.shuang.commons</groupId>
                <artifactId>${projectName}-bean</artifactId>
                <version>${r'${projects.version}'}</version>
            </dependency>
            <dependency>
                <groupId>com.shuang.commons</groupId>
                <artifactId>${projectName}-common</artifactId>
                <version>${r'${projects.version}'}</version>
            </dependency>
            <dependency>
                <groupId>com.shuang.commons</groupId>
                <artifactId>${projectName}-core</artifactId>
                <version>${r'${projects.version}'}</version>
            </dependency>
            <dependency>
                <groupId>com.shuang.commons</groupId>
                <artifactId>${projectName}-sdk</artifactId>
                <version>${r'${projects.version}'}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
</project>
