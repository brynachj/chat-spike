import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by brynach on 03/03/2019.
 */
@SpringBootApplication
public class ChatSpike {

    public static void main(String[] args) {
        System.out.println("In chat spike");
        SpringApplication.run(ChatSpike.class, args);
    }
}
