import com.baudisch.MimoRozsahLet;
import com.baudisch.VyjimkaNeplatnehoVeku;
import static com.baudisch.AgeValidator.checkAge;
import static com.baudisch.LeapYearChecker.isLeapYear;

public class MainProgram {

    public static void main(String[] args) {

        System.out.println("Kontrola Věku");
        try {
            checkAge(16);
        } catch (VyjimkaNeplatnehoVeku e) {
            System.out.println("Zachycena výjimka: " + e.getMessage());
        }

        System.out.print("\n");

        System.out.println("Validator prestupného roku");
        try {
            System.out.println("Rok 2000 je přestupný?: " + isLeapYear(1980));
            System.out.println("Rok 2023 je přestupný?: " + isLeapYear(2023));
            System.out.println("Rok 1800 je přestupný?: " + isLeapYear(1800));
        } catch (MimoRozsahLet e) {
            System.out.println("Zachycena výjimka: " + e.getMessage());
        }

    }
}
