package com.at.stripepayment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Stripe API", version = "1.0"))
@SpringBootApplication
public class StripePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentApplication.class, args);
	}

}
