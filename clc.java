import java.util.Scanner;

public class clc { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double summa, result, r;
        double vyp;

        System.out.println("Выберите тип клиента: ");
        String s = scanner.nextLine();

        switch (s) {
            case "human", "HUMAN", "Human":
                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                if (summa > 0) {
                    System.out.println("Процент кредитования: ");

                } else {
                    System.out.println("Сумма некорректна");

                }
                r = scanner.nextDouble();

                System.out.println("Сумма выплаты: ");
                vyp = scanner.nextDouble();
                System.out.println("Платежи: ");


                for (result = summa + summa / 100 * r; result >= vyp; result = result - vyp)
                    System.out.println("Сумма кредита: " + result + " Внесено: " + vyp + " Осталось: " + (result - vyp));
                System.out.println(" ");
                System.out.println("Input: " + summa + " " + vyp + " " + r + "%" + " " + s);
                System.out.println(" ");
                System.out.println("Выгода банка: " + (summa / 100 * r));

                if (0 > result - vyp)
                    break;//немного не разобралась как округлить число, иногда после "," много символов

                break;

            case "business", "BUSINESS", "Business":

                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                if (summa > 0) {
                    System.out.println("Процент кредитования: ");

                } else {
                    System.out.println("Сумма некорректна");
                }
                r = scanner.nextDouble();

                System.out.println("Сумма выплаты: ");
                vyp = scanner.nextDouble();

                result = summa + (summa / 100) * r;

                System.out.println("Итого к оплате: " + summa);

                System.out.println("Платежи: ");
                System.out.println(" ");

                for (result = summa ; result >= vyp; result = result - vyp)

                  // я тут затупила на цикле

                    System.out.println("Сумма кредита: " + result + " Внесено: " + vyp + " Осталось: " + (result - vyp));

                System.out.println(" ");
                System.out.println("Input: " + summa + " " + vyp + " " + r + "%" + " " + s);
                System.out.println(" ");
                System.out.println("Выгода банка:" + (summa / 100 * r));
                if (0 > result - vyp) break;
                if (0 > vyp) break;

                break;

            default:
                System.out.println("Мы вам перезвоним. ");
        }
    }

}
