package br.com.zup.aplication;


import br.com.zup.biblioteca.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "br.com.zup")
@RestController
public class AplicationApplication {

	private final MyService myService;

	public AplicationApplication(MyService myService){
		this.myService = myService;
	}

	@GetMapping("/")
	public String home(){
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(AplicationApplication.class, args);
	}

}
