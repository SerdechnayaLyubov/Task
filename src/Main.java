import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        while (!"6".equals(s)){
            System.out.println("1. Для ввода нового пользователя введите ----------------------1");
            System.out.println("2. Для редактирования данных введите --------------------------2");
            System.out.println("3. Для просмотра данных обо всех пользователях введите --------3");
            System.out.println("4. Поиск совпадений по имени и фамилии ------------------------4");
            System.out.println("5. Для удаления данных об одном пользователе введите ----------5");
            System.out.println("6. Для выхода из приложения введите ---------------------------6");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Проверьте введенное число (от 1 до 6) !");
            }
            switch (x){
                case 1:
                    Input.dataInput();
                    break;
                case 2:
                    Update.dataUpdate();
                    break;
                case 3:
                    OutputAll.dataOutputAll();
                    break;
                case 4:
                    OutputOne.dataOutputOne();
                    break;
                case 5:
                    Delete.dataDelete();
                    break;

            }
        }
        System.out.println("До свидания!");
    }
}
