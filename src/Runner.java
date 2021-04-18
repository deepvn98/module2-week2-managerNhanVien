import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<NhanVien> nhanViens = new LinkedList<NhanVien>();
        ManagerNV o = new ManagerNV(nhanViens);
        Menu menu = new Menu(o);

        NhanVien a = new NVPartTime("1","2","1","5","9",30);
        NhanVien c = new NVPartTime("1","2","1","5","9",50);
        NhanVien b = new NVFullTime("1","3","1","5","9",10000,20000,40000);
        nhanViens.add(a);
        nhanViens.add(c);
        nhanViens.add(b);
//        o.showInfor();
//        menu.menu();
//Hiển thị nhân viên fulltime có mức lương thấp hơn mức lương trung bình!
        o.ShowInforNVFT();
    }

}
