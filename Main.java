import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horarioTokyo = agora.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioTokyo);
    }
}

