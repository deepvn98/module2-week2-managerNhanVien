import java.util.Scanner;

public class Menu {
    private ManagerNV o;

    public ManagerNV getO() {
        return o;
    }

    public void setO(ManagerNV o) {
        this.o = o;
    }

    public Menu(ManagerNV o) {
        this.o = o;
    }
    public void menu(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Nhấn 1: nếu bạn muốn thêm nhân viên Fulltime: \n Nhấn 2 nếu bạn muốn thêm nhân viên partTime: \n Nhấn 3 nếu bạn muốn xem thông tin tất cả nhân viên: \n Nhấn 4: nếu bạn muốn thoát: ");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    o.addNVFullTime();
                    break;
                case 2:
                    o.addNVPartTime();
                    break;
                case 3:
                    o.showInfor();
                    break;
                default:
                    break;
            }
            if ( input == 4){
                break;
            }
        }

    }
}
