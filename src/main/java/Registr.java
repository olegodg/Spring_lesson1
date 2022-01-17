import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("registration")
public class Registr {
    private List<Process> actions = new ArrayList<>();

    public void setActions(List<Process> actions) {
        this.actions = actions;
    }

    public void doVisit(){
        System.out.println("В регистратуру обратился пациент.");
        actions.stream().forEach(a -> a.processing());
    }
}
