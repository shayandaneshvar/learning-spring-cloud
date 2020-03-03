package ir.shayandaneshvar.roomservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class RoomServicesApplication {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Room")
                .select()
                .apis(RequestHandlerSelectors.basePackage("ir.shayandaneshvar.roomservices"))
                .paths(any())
                .build()
                .apiInfo(new ApiInfo("Room Services",
                        "A set of Services to provide data access to rooms",
                        "1.0.0", null, "S.Shayan Daneshvar"
                        , null, null));
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomServicesApplication.class, args);
    }

}
