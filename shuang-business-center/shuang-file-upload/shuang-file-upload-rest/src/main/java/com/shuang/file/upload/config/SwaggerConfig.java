package com.shuang.file.upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.shuang.file.upload.controller";

    @Bean
    public Docket api() {
        final Docket docket =
                new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                        .paths(PathSelectors.ant("/**"))
                        .build()
                        //.globalOperationParameters(pars)
                        .apiInfo(apiInfo());
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("上传下载公共服务")
                .description("上传下载服务-内部接口调用")
                .termsOfServiceUrl("http://www.shuang.com/")
                .contact(new Contact("shuang", "http://www.shuang.com/", ""))
                .version("1.0")
                .build();

    }
}
