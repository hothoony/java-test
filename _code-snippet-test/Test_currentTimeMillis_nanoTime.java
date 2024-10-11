

public class Test_currentTimeMillis_nanoTime {
    
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

        int loop = 10;
        
        System.out.println("currentTimeMillis");
        for (int i = 0; i < loop; i++) {
            System.out.println(System.currentTimeMillis());
        }

        System.err.println();

        System.out.println("nanoTime");
        for (int i = 0; i < loop; i++) {
            System.out.println(System.nanoTime());
        }
    }
}

// currentTimeMillis    => 13 자리, 중복 있음
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475
// 1728657265475

// nanoTime             => 14 자리, 중복 없음
// 13878538899166
// 13878538915916
// 13878538921041
// 13878538926250
// 13878538931750
// 13878538936916
// 13878538942083
// 13878538947041
// 13878538952041
// 13878538957000
