import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите пример");
        String primer = scanner.nextLine();
        String[] chast = primer.split(" ");
        int a = Integer.parseInt(chast[0]);
        char operation = chast[1].charAt(0);
        int b = Integer.parseInt(chast[2]);

        if ((a<1) || (a>10)) {
            throw new Exception();
        } else if ((b<1) || (b>10)) {
            throw new Exception();
        }
        else switch (operation) {
            case ('+'):
                System.out.println(a+b);
                break;
            case ('-'):
                System.out.println(a-b);
                break;
            case ('*'):
                System.out.println(a*b);
                break;
            case ('/'):
                System.out.println(a/b);
                break;
            default:
                throw new Exception();


        }
    }

}

