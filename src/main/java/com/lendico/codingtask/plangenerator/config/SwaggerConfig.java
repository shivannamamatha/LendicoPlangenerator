package com.lendico.codingtask.plangenerator.config;

import java.util.function.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;*/

/*@Configuration
@EnableSwagger2*/
public class SwaggerConfig {

/*	  @Bean
	    public Docket api() {
	        Predicate<RequestHandler> apiPackages =
	                ((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.lendico.codingtask")::apply);

	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(apiPackages::test)
	                .paths(PathSelectors.any())
	                .build()
	                .apiInfo(apiInfo());
	    }


	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("LENDICO-PLAN-Generator")
	                .description("Loan Plan Generator Services")
	                .version("1.0.0")
	                .build();
	    }*/
}
