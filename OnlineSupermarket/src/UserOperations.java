
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserOperations {

    public static int index = 0;

    public static ArrayList<User> userList = new ArrayList<User>();

    public static File file = new File("users.txt");

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void addFromFileToList() throws FileNotFoundException {
        userList.clear();
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String name = input.next();
            String cardID = input.next();
            String number = input.next();
            String password = input.next();
            String userAddress = input.nextLine();

            User user1 = new User(name, cardID, number, password);
            userList.add(user1);
        }

    }

    public static boolean writeToFile(User user) throws FileNotFoundException, IOException {
        addFromFileToList();
        if (isExist(user.getUserName())) {
            return false;
        } else {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bwriter = new BufferedWriter(fileWriter);
            bwriter.write(user.toString());
            bwriter.close();
            return true;
        }

    }

    public static boolean searchUser(String userName, String password) {

        for (int i = 0; i < userList.size(); i++) {
            if (userName.equals(userList.get(i).getUserName()) && password.equals(userList.get(i).getPassword())) {
                index = i;
                return true;
            }
        }
        return false;
    }

    public static boolean isExist(String userName) {

        for (int i = 0; i < userList.size(); i++) {
            if (userName.equals(userList.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

}
