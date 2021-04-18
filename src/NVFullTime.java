public class NVFullTime extends NhanVien{
    private double bonus;
    private double fine;
    private double salary;

    public NVFullTime(String id, String name, String age, String phone, String gmail, double bonus, double fine, double salary) {
        super(id, name, age, phone, gmail);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getAmount() {
        return salary + bonus - fine;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                " bonus= " + bonus +"\n"+
                " fine= " + fine +"\n"+
                " salary= " + salary;
    }
}
