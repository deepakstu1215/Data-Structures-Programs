import java.util.Date;

public class ExceptionHandler {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 2 / 0;
        } catch (NullPointerException ne) {
            System.out.println("Null pointer exception");
        } catch (ArithmeticException ae) {
            System.out.println("Arithematic Exception caught");
        } catch (Exception e) {
            System.out.println("Super Exception caught");
        } finally {
            System.out.println("Rocket ka main logic");
        }

    }

}