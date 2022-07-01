package entities;

public class Student {
    
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double FinalGrade(){
        return note1+note2+note3;
    }

    public void Result(double total){
        if(total<60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n",(60-total));
        }else{
            System.out.println("PASS");
        }
    }
}
