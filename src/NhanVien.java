public abstract class NhanVien {
    private String id;
    private String name;
    private String age;
    private String phone;
    private String gmail;

    public NhanVien(String id, String name, String age, String phone, String gmail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gmail = gmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public abstract double  getAmount();

    @Override
    public String toString() {
        return
               " id=" + id +"\n"+
               " name= " + name +"\n"+
               " age= " + age +"\n"+
               " phone= " + phone +"\n"+
               " gmail= " + gmail;
    }
}
