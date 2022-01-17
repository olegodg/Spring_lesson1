import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Specialists {
    @Bean(name = "actions")
    public List<Process> actions(){
        return Arrays.asList( new Cabinet());
    }

    @Bean(name = "registration")
    public Registr registration(List<Process> actions){
        Registr registration = new Registr();
        registration.setActions(actions);
        return registration;
    }
}
