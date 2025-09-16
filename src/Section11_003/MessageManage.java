package Section11_003;

import java.util.ArrayList;
import java.util.Scanner;

public class MessageManage {
   private ArrayList<Message>messages=new ArrayList<>();

    public void displayMessages() {
        for (Message m : messages) {

            System.out.println(messages);

        }
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhap ten nguoi gui");
        String sender = scanner.nextLine();
        System.out.println("Noi dung tin nhan");
        String content = scanner.nextLine();
        Message message = new Message(sender,content);
        messages.add(message);
    }

}



//    public void displayMessage(Scanner scanner,int currentIndex) {
//        System.out.println("Lich su chat");
//        System.out.printf(messages(currentIndex).);

