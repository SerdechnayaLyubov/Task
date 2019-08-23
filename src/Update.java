import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Update {
    public static void dataUpdate(){
        System.out.println("Редактирование");

        String name2=null;
        String lastName2=null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите данные для редактирования:\nимя (name): ");
            name2 = reader.readLine();
            System.out.println("фамилия (lastName): ");
            lastName2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }



        for(int i=0; i<Input.users.size(); i++){
            if((Input.users.get(i).getName() != null) && (Input.users.get(i).getName().equals(name2)) &&
                    (Input.users.get(i).getLastName()!=null)&& (Input.users.get(i).getLastName().equals(lastName2))){
                System.out.println(Input.users.get(i));
                Input.users.remove(i);
            }
            else{
                System.out.println("Проверьте данные для редактирования!");
            }
        }

        System.out.println("Введите заново новые данные для этого пользователя");
        Input.dataInput();


    }
}
