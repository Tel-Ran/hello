package telran.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GreetingsAppl {
	int count=0;
@RequestMapping(value="greetings")
String greetings(){
	count+=4;
	return "hello "+count;
}
@PostMapping(value="start")
int start(@RequestBody int num){
	count=num;
	return num;
}
	public static void main(String[] args) {
		SpringApplication.run(GreetingsAppl.class, args);

	}

}
