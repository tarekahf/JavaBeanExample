import java.io.Serializable;

public class EmployeeClass implements Serializable {
    // public static void  main(String[] args) {
    //     System.out.print("Hello World");
    // }
    private String emplName;
    public EmployeeClass(){

    }
    public EmployeeClass(String prmName) {
        emplName = prmName;
    } 

    public String getEmplName() {
        return emplName;
    }

}
