package com.xiaos.cloud.api.config;

import com.google.common.base.Predicates;
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
    @Bean
    public Docket webApiConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("云计算平台Api")
                .apiInfo(webApiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.edu.calf.app"))
                .apis(RequestHandlerSelectors.basePackage("com.xiaos.cloud.api"))
                //过滤掉所有error或error.*页面
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();
    }



    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()

                .title("云计算平台Api")
                .description("Admin+Pc")
                .version("1.0")
                .contact(new Contact("宋超阳", "https://user.qzone.qq.com/393340139/main", "xiaosonggentle@gmail.com"))
                .build();
    }

}
