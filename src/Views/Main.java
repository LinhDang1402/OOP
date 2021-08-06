package Views;
import Controller.JDBC;
import Model.PhongBan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	        int choice = 0;
	        String b;
	        int a;
	        var controller = new JDBC();
	        var PB = new ArrayList<PhongBan>();
	        Scanner scanner = new Scanner(System.in);

	        do {
	            System.out.println("_______________MENU_______________");
	            System.out.println("1. Hien thi phong ban.");
	            System.out.println("2. Them 1 phong ban");
	            System.out.println("3. Sua 1 phong ban theo maPB");
	            System.out.println("4. Xoa 1 phong ban theo maPB");
	            System.out.println("0. Thoát khỏi ứng dụng.");
	            System.out.println("Bạn chọn ? ");

	            choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 0:
	                    System.out.println("_____________________________________________");
	                    System.out.println("Thanks");
	                    break;
	                case 1:
	                    try {
	                        PB = controller.getAllPb();
	                    } catch (SQLException throwables) {
	                        throwables.printStackTrace();
	                    }
	                    finally {
	                        if (PB != null) {
	                            showPbInfo(PB);
	                        }
	                    }
	                    break;
	            }

	        }while (choice != 0);
	    }

	    private static void showPbInfo(ArrayList<PhongBan> pb) {
	        System.out.println("_________________Thông tin phòng ban trong mysql_________________");
	        for (var b : pb) {
	            System.out.println(b);
	        }
	    }
}
