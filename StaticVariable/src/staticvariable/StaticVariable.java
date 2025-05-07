/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticvariable;

/**
 *
 * @author Victus
 */
public class StaticVariable {

    int rollno;   //instance variable.
    String name;  //instance variable.
    static String college = "Saraswati Multiple Campus";   //static variable declaration.
        
        StaticVariable(String n, int r)   //Parameterized Constructor.
        {
            name = n;
            rollno = r;
        }
        
        void view()  //view method to display the output.
        {
            System.out.println("\tThe name of the student is :"+name+"\t\tThe roll no. of student is :"+rollno+"\t\tThe college name is :"+college);
        }   
    public static void main(String[] args) {
        // TODO code application logic here
        StaticVariable sv = new StaticVariable("Anish",4);
        StaticVariable a = new StaticVariable("Archana",5);
        StaticVariable b = new StaticVariable("Junel",26);           //Here we no need to provide College name as it is static.
        StaticVariable c = new StaticVariable("Sabin",29);           //"Saraswati Multiple Campus" will be printed each time +college is called...  
        StaticVariable d = new StaticVariable("Shirish",31);
        StaticVariable e = new StaticVariable("Sushil",33);
        sv.view();
        a.view();
        b.view();
        c.view();
        d.view();
        e.view();    
    }
    
}
