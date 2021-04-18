import java.util.LinkedList;
import java.util.Scanner;

public class ManagerNV {
    private LinkedList<NhanVien> nhanViens;

    public LinkedList<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(LinkedList<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public ManagerNV(LinkedList<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    //Thêm nhân viên fulltime
    public void addNVFullTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id nhân viên: ");
        String id = scanner.nextLine();
        System.out.print("Mời bạn nhập name nhân viên: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.print("Mời bạn nhập age nhân viên: ");
        Scanner scanner2 = new Scanner(System.in);
        String age = scanner2.nextLine();
        System.out.print("Mời bạn nhập phone nhân viên: ");
        Scanner scanner3 = new Scanner(System.in);
        String phone = scanner3.nextLine();
        System.out.print("Mời bạn nhập gmail nhân viên: ");
        Scanner scanner4 = new Scanner(System.in);
        String gmail = scanner4.nextLine();
        System.out.print("Mời bạn nhập bonus nhân viên: ");
        Scanner scanner5 = new Scanner(System.in);
        double bonus = scanner5.nextDouble();
        System.out.print("Mời bạn nhập fine nhân viên: ");
        Scanner scanner6 = new Scanner(System.in);
        double fine = scanner6.nextDouble();
        System.out.print("Mời bạn nhập salary nhân viên: ");
        Scanner scanner7 = new Scanner(System.in);
        double salary = scanner7.nextDouble();
        NhanVien o = new NVFullTime(id, name, age, phone, gmail, bonus, fine, salary);
        nhanViens.add(o);
    }

    //Thêm nhân viên parttime
    public void addNVPartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập id nhân viên: ");
        String id = scanner.nextLine();
        System.out.print("Mời bạn nhập name nhân viên: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.print("Mời bạn nhập age nhân viên: ");
        Scanner scanner2 = new Scanner(System.in);
        String age = scanner2.nextLine();
        System.out.print("Mời bạn nhập phone nhân viên: ");
        Scanner scanner3 = new Scanner(System.in);
        String phone = scanner3.nextLine();
        System.out.print("Mời bạn nhập gmail nhân viên: ");
        Scanner scanner4 = new Scanner(System.in);
        String gmail = scanner4.nextLine();
        System.out.print("Mời bạn nhập time nhân viên: ");
        Scanner scanner5 = new Scanner(System.in);
        double time = scanner5.nextDouble();
        NhanVien o = new NVPartTime(id, name, age, phone, gmail, time);
        nhanViens.add(o);
    }

    //Tổng lương nhân viên fulltime
    public double amountNVFullTime() {
        double total = 0;
        for (NhanVien o : nhanViens) {
            total += o.getAmount();
        }
        return total;
    }

    //Tổng lương nhân viên parttime
    public double amountNVPartTime() {
        double total = 0;
        for (NhanVien o : nhanViens) {
            total += o.getAmount();
        }
        return total;
    }

    //    Tổng luowng toàn bộ nhân viên
    public double tatolAmount() {
        return amountNVPartTime() + amountNVFullTime();
    }

    //Mức Lương trung bình của nhân viên công ty
    public double mediumSalary() {
        return tatolAmount() / nhanViens.size();
    }
//nhân viên có mức lương thấp hơn mức lương trung bình của công ty
    public void ShowInforNVFT(){
        for (NhanVien o: nhanViens) {
            if (o instanceof NVFullTime){
                NVFullTime nhanvien = (NVFullTime) o;
                if (nhanvien.getAmount() < mediumSalary()){
                    System.out.println(nhanvien.getName());
                }
            }
        }
    }
    //hiển thị thông tin nhân viên
    public void showInfor() {
        for (NhanVien o : nhanViens) {
            System.out.println(o.toString());
        }
    }
}
