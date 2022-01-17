import org.springframework.stereotype.Component;

@Component("way")
public class Cabinet implements Process{
    @Override
    public void processing() {
        System.out.println("Пациенту сообщили номер кабинета врача и путь к нему.");
    }
}
