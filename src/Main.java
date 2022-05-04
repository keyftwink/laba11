import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String IPV4_PATTERN =
            "^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])(\\.(?!$)|$)){4}$";
    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите айпи: ");

        String ip = in.nextLine();
        if(ipCheck(ip)){
            System.out.println("Верный айпи");
        }else {
            System.out.println("Неверный айпи");
        }
    }
    public static boolean ipCheck(final String ip) {

        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}