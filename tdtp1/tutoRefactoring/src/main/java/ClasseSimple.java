import java.time.LocalDate;

public class ClasseSimple {

    public ClasseSimple() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int a, int b) {
        return a + b ;
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate)
    {

        return !DateUtils.isDateBetween(date,startingDate,endingDate, );
    }

    public static void main(String[] args) {
        new ClasseSimple().add(1,2);

        System.out.println("Hello world");
    }
}


