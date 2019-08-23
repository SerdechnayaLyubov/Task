import java.io.*;
import java.util.Iterator;

public class Delete implements  Serializable {
    public  static void dataDelete(){
        String name1=null;
        String lastName1=null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите данные для удаления:\nимя (name): ");
            name1 = reader.readLine();
            System.out.println("фамилия (lastName): ");
            lastName1 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Iterator<User> iter = Input.users.iterator();
        while (iter.hasNext())
        {
            User user = iter.next();
            if((user.getName()!=null)&&(user.getName().equals(name1))&&(user.getLastName()!=null)&&(user.getLastName().equals(lastName1)))
            {
                iter.remove();
                System.out.println("Данные удалены!");
            }
//            else{
//                System.out.println("Данные для удаления не верны!");
//            }

        }

    }

}
