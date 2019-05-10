package season1.KiemTraNamNhuan;

import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        System.out.print("Nhập năm: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean check = true;
        if (year % 4 ==0 ){
            if (year % 100 == 0){
                if (year % 400 ==0){
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = true;
            }
        } else {
            check = false;
        }
        if (check){
            System.out.print("Đây là năm nhuận");
        } else {
            System.out.print("Đây không phải là năm nhuận");
        }

    }
}
