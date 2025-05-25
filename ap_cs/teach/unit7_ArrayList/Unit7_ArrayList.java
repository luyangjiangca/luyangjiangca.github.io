// package ap_cs.unit7_ArrayList;
//new requirement: 
//1. When addToAgenda, how to avoid duplicate name
//2. addToAgenda to maintain an order based on the  daysUntilDue in ascending order
import java.util.ArrayList; 
public class Unit7_ArrayList {
    public static void main(String []args){
        Agenda agenda1 = new Agenda();
        Assignment assignment1 = new Assignment("Math Homework1","Algebra 1",2,"do problems 1-5");
        Assignment assignment2 = new Assignment("Math Homework2","Algebra 1",6,"do problems 1-5");
        Assignment assignment3 = new Assignment("Math Homework3","Algebra 1",12,"do problems 1-5");
        Assignment assignment4 = new Assignment("Math Homework4","Algebra 1",2,"do problems 1-5");
        agenda1.addToAgenda(assignment1);
        agenda1.addToAgenda(assignment2);
        agenda1.addToAgenda(assignment3);
        agenda1.addToAgenda(assignment4);
        // agenda1.removeAssignment("Math Homework");
        agenda1.printAssignments();
    }
    
}
class Assignment{
    private String name;
    private String course;
    private int daysUntilDue;
    private String description;
    public Assignment(String name, String course, int daysUntilDue, String description){
        this.name = name;
        this.course = course;
        this.daysUntilDue = daysUntilDue;
        this.description = description;
    }
    // if (assignments.indexOf(this.name)!=-1){
    //     System.out.println("Don't repeat idot");
    // }
    public String getName(){
        return(this.name);
    }
    public String getCourse(){
        return(this.course);
    }
    public int getDaysUntil(){
        return(this.daysUntilDue);
    }
    public String getDescription(){
        return(this.description);
    }

    public void printAssignment() {
        System.out.println(name);
        System.out.println(course);
        System.out.println(description);
        System.out.println(daysUntilDue);
    }
}
class Agenda{
    private ArrayList<Assignment> assignments;
    public Agenda(){
        this.assignments = new ArrayList<Assignment>(); 
    }
    public void addToAgenda(Assignment assignment){
        int i=0;
        // int x=-1;
        boolean repeat = false;
        while((i<=this.assignments.size()-1)){
            String a = this.assignments.get(i).getName();
            if(a==assignment.getName()){
                System.out.println("Repeat name, assignment "+assignment.getName()+" not added");
                repeat = true;
            }
            i+=1;
        }
        if(!repeat){   
        
        i=0;
        int x = 0;
        while((i<=this.assignments.size()-1)){
            int due = this.assignments.get(i).getDaysUntil();
            if(due<assignment.getDaysUntil()){
                x+=1;
            }else{
                break;
            }
            i+=1;
        }
        this.assignments.add(x, assignment);
        }
    }
    public void removeAssignment(String name){
        int i=0;
        int x=-1;
        while((i<=this.assignments.size()-1)){
            String a = this.assignments.get(i).getName();
            if(a==name){
                x=1;
                this.assignments.remove(i);
            }
            i+=1;
        }
        if (x==1){

        }else{
            System.out.println("This assignment does not exist");
        }
    }

    public void printAssignments() {
        for(Assignment assignment: this.assignments) {
            assignment.printAssignment();
        }
    }
}