package dio.project.endereco.endereco_viacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EnderecoViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnderecoViacepApplication.class, args);
	}

}
