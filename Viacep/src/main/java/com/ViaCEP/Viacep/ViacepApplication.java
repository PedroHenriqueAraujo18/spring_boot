package com.ViaCEP.Viacep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ViacepApplication {

	public static void main(String[] args) {

		SpringApplication.run(ViacepApplication.class, args);
	}
		@Bean
		public CommandLineRunner commandLineRunner(Json conversor)throws Exception {
			return args -> {
				String json = "{\"cep\": \"010101\"}";;
				ViaCepResponse response = conversor.converter(json);
				System.out.println(response);
			};
		}
}
