import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Выберите операцию: Добавить - 1. Показать - 2. Удалить - 3.");
            String inputString = scanner.nextLine();
            if ("end".equals(inputString)) {
                break;
            }

            switch (inputString) {
                case ("1"):
                    System.out.println("Какую покупку хотите добавить?");
                    String lists = scanner.nextLine();
                    list.add(lists);
                    System.out.println(lists + " Итого в списке покупок: " + list.size());
                    print(list);
                    break;

                case ("2"):
                    print(list);
                    break;
                case ("3"):
                    System.out.println("Какую хотите удалить? Введите номер или название: ");
                    String delete = scanner.nextLine();
                    list.remove(delete);
                    System.out.println("Покупка " + delete + " удалена, список покупок: " + list.size());
                    print(list);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }

    private static void print(ArrayList<String> list) {
        System.out.println("Список покупок");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }
}