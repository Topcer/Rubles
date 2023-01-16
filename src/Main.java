public class Main {
    public static void main(String[] args) {
        int balance = 100;  // Начальный счет
        int pay = 1100;     // Сумма пополнения

        int bonus;

        if (pay > 1000) {
            bonus = pay / 100;
        } else bonus = 0;

        int total = balance + pay + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + total + " рублей.");

    }
}