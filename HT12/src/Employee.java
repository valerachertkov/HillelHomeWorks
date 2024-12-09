public class Employee {
    String name;
    double salary;
    String dolthnost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDolthnost() {
        return dolthnost;
    }

    public void setDolthnost(String dolthnost) {
        this.dolthnost = dolthnost;
    }

    Employee(String n, double s, String d){
        name=n;
        salary=s;
        dolthnost=d;
    }
    public void print(){
        System.out.println("Name :"+ name + "Salary :"+ salary +"Dolthnost :"+ dolthnost);
    }
}
