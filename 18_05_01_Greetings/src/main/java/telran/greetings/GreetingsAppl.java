package telran.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingsAppl {
	int count=0;
@RequestMapping(value="greetings")
String greetings(){
	count++;
	return "hello "+count;
}
	public static void main(String[] args) {
		SpringApplication.run(GreetingsAppl.class, args);

	}

}
