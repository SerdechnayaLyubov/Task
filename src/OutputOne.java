import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputOne {
    public static void dataOutputOne(){
        String name=null;
        String lastName=null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Данные пользователя для поиска:\nимя (name): ");
            name = reader.readLine();
            System.out.println("фамилия (lastName): ");
            lastName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }





        for(User u : Input.users){
            if((u.getName() != null) && (u.getName().equals(name)) && (u.getLastName()!=null)&& (u.getLastName().equals(lastName))){
                System.out.println(u);
            }
//            else{
//                System.out.println("Проверьте данные для поиска!");
//            }

        }

    }
}
