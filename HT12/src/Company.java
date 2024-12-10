import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees =new ArrayList<Employee>();
    public void addemployee(Employee e){
        employees.add(e);
    }
    public void remove(Employee e){
        employees.remove(e);
    }
    public double totalsalary() {
        double s=0;
        for (Employee e:employees){
            s+=e.getSalary();
        }
        return s;
    }
    public double averageSalary(){
        return totalsalary()/employees.size();
    }
}
