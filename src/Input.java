import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input implements Serializable {

    public static ArrayList<User> users= new ArrayList<>();
    public static boolean isEmail=true;

    public static void dataInput(){
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name=null;
            String lastName=null;
            String eMail=null;
            ArrayList<String> roles = new ArrayList<>();
            String role=null;
            ArrayList<String> phones = new ArrayList<>();
            String phone=null;
            try {
                System.out.println("Введите имя (name): ");
                name = reader.readLine();
                System.out.println("Введите фамилию (lastName): ");
                lastName=reader.readLine();
                System.out.println("Введите адрес электронной почты (eMail): ");
                eMail=reader.readLine();
                System.out.println("Введите не больше трёх номеров телефонов в формате 375** ******* (phones): ");
                while (phones.size() <3) {
                    phone=reader.readLine();
                    phones.add(phone);
                }
               // System.out.println("Список номеров телефонов заполнен");

                System.out.println("Введите не больше трёх ролей пользователя (roles): ");
                while (roles.size() <3) {
                    role=reader.readLine();
                    roles.add(role);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }




            Pattern p = Pattern.compile("^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}" +
                    "[a-z0-9])?\\.)*(aero|arpa|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel|[a-z][a-z])$");
            Matcher m = p.matcher(eMail);
            boolean isEmail = m.matches();

            //System.out.println("Добро пожаловать, "+name+" "+lastName+"! Ваш eMail = "+eMail);
            User user = new User(name, lastName, eMail, roles, phones);
            users.add(user);
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("f:/result.txt");
                ObjectOutputStream oos = null;
                oos = new ObjectOutputStream(fos);
                oos.writeObject(users);
                oos.flush();
                oos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
        while (isEmail==false);






    }





}
