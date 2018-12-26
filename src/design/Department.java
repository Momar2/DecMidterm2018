package design;

public abstract class Department implements Employee{


    final String empName = "George Clooney";
    static String resignationDate = "02/05/2019";

    public void farewell () {
        System.out.println(empName+"'s last day was"+resignationDate);
    }
    public abstract void farewell (int date);{

    }

}



