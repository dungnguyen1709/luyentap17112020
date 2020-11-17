package kethua.bai1;

public class Students extends People {
    protected int id;
    protected int math;
    protected int physical;
    protected int chemistry;

    public Students() {
    }

    public Students(String name, int age, String address, int id, int math, int physical, int chemistry) {
        super(name, age, address);
        this.id = id;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public double GPA() {
        return (math + physical + chemistry) / 3;
    }
}
