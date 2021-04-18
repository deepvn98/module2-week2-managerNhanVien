public class NVPartTime extends NhanVien {
    private double time;

    public NVPartTime(String id, String name, String age, String phone, String gmail, double time) {
        super(id, name, age, phone, gmail);
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public double getAmount() {
        return time * 10000;
    }

    @Override
    public String toString() {
        return "NVPartTime{ " + "\n" +
                super.toString() + "\n" +
                "time= " + time + "\n" +
                '}';
    }
}
