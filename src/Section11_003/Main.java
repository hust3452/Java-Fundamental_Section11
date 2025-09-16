package Section11_003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageManage chatApp = new MessageManage();


        do {

            System.out.println("****** QUAN LI TIN NHAN NGUOI DUNG ******\n" +
                    "1.Chuc nang nhan tin\n" +
                    "2.Hien thi lich su nhan tin\n" +
                    "3.Loc tin nhan theo ngay\n" +
                    "4.Chuc nang loc tin nhan theo nguoi gui\n" +
                    "5.Thoat\n" +
                    "Nhap vao su lua chon cua ban ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    chatApp.inputData(scanner);
                    System.out.println("Xin chao");
                    break;
                case 2:
                    chatApp.displayMessages();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long nhap gia tri tu 1-3");
            }
        } while (true);
    }


}

