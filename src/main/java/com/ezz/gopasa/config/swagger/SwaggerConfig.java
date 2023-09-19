package com.ezz.gopasa.config.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){

        Info info = new Info()
                .version("v0.0.1")
                .title("고파사 API 명세")
                . description("고파사 프로젝트 백엔드 서버 API 명세서");

        return new OpenAPI()
                .info(info);

    }
   

}
