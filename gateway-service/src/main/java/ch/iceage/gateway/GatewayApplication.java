package ch.iceage.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
	@Autowired
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route("products-service", r -> 
					r.path("/ms1/**")
					 .filters(f -> f.stripPrefix(1))
					 .uri("http://localhost:8081")
				)
				.route("orders-service", r -> 
					r.path("/ms2/**")
					 .filters(f -> f.stripPrefix(1))
					 .uri("http://localhost:8082")
				)
				.route("delivery-service", r -> 
					r.path("/ms3/**")
					 .filters(f -> f.stripPrefix(1))
					 .uri("http://localhost:8083")
				)
				.build();
	}

}
