
import java.time.LocalDate;

public class Test_LocalDate {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println(">> main begin");
        System.out.println();

        testCode();

        System.out.println();
        System.out.println(">> main end");
        System.out.println();
    }

    private static void testCode() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(LocalDate.now());
        }
    }
}
