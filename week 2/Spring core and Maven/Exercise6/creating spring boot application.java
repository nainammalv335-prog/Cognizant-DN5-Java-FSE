import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplication.class, args);

        System.out.println("Spring Boot Application Started Successfully!");
    }
}
