import java.security.Security;
import java.util.ArrayList;

public class Employee {

    String name;
    int Salary;
    int Seniority;

    public Employee(String name,int Salray,int seniority){

        this.name=name;
        this.Salary=Salary;
        this.Seniority= Seniority;

    }
    public double yahss(){

        int sum;

     sum = Salary / Seniority;
     return sum;
    }

    public Double efficency(){
        return(double)(Salary / Seniority);
    }
        public ArrayList<Employee> filter(Employee[] allEmployee){

            ArrayList<Employee>  res = new ArrayList<Employee>();

    for(Employee e : allEmployee){

        if (e.Salary < 15000 && e.Seniority > 120){
            res.add(e);
        }
    }
    return res;
    }


}
