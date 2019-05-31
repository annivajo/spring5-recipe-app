package guru.springframework.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        Contact contact = new Contact("Ann Iva", "https://www.annivajo.com", "annivajo@mail.com");

        return new ApiInfo(
                "SpringFramework Guru Recipe App",
                "Spring Boot application for training and always be houngry.",
                "1.0",
                "Terms of Service: blah",
                contact,
                "Apache License version 2.0",
                "https://www.apache.org/lecenses/LICENSE-2.0",
                new ArrayList<>());
    }

}
