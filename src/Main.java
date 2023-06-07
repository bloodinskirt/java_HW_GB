// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Pls input number of triangle: ");
        int n = scan.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++)
            res += i;
        System.out.println(res);
        **/

        // Вывести все простые числа от 1 до 1000
        /*
        int n = 1000;
        System.out.println("2");
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = i > 2;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){ isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        **/

        // Реализовать простой калькулятор
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        double num1 = scan.nextInt();

        System.out.print("Input 2nd number: ");
        double num2 = scan.nextInt();

        System.out.print("Input action");
        String action = scan.nextLine();
        action = scan.nextLine();

        double res;

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("result: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("result: " + res);
                }
                break;
            default:
                System.out.println("Wrong input");
        }
        **/
    }
}