package Section11_003;

import Section11_002.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

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
        Message message = new Message(sender,content,LocalDateTime.now());
        messages.add(message);
    }

    public void searchMessageByTime(Scanner scanner) {
        String regex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";

        int check =0;
        String checkTime;
        do{
        System.out.println("Nhap vao ngay ban muon kiem tra theo dinh dang ");
        checkTime = scanner.nextLine();
        if (checkTime.matches(regex)) {

            LocalDate finalCheck = LocalDate.parse(checkTime);
            List<Message> messagesCheckTime = messages.stream()
                    .filter(s -> s.getTimestamp().toLocalDate().equals(finalCheck))
                    .collect(Collectors.toList());

            for (Message msg : messagesCheckTime) {
                System.out.println(messagesCheckTime);
                System.out.println("xin chao");
            }
            check =-1;
        }
        else {
            System.out.println("Sai dinh dang!!! Vui long nhap lai");
        }
        }while(check==0);
    }

    public void searchMessageByName(Scanner scanner){
        int check=0;
        String checkName;
        do {
            System.out.println("Nhap vao ten ban muon kiem tra");
            checkName = scanner.nextLine();

            String finalCheckName = checkName;
            List<Message> messagesCheckName = messages.stream()
                    .filter(s -> s.getSender().equals(finalCheckName))
                    .collect(Collectors.toList());
            for (Message msg1 : messagesCheckName){
                System.out.println(messagesCheckName);
            }

        }while (check==0);

    }


    public void messagesCheckTime(String checkTime){

    }

}



//    public void displayMessage(Scanner scanner,int currentIndex) {
//        System.out.println("Lich su chat");
//        System.out.printf(messages(currentIndex).);

