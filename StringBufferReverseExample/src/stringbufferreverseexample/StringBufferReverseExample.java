/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferreverseexample;
        
public class StringBufferReverseExample {

    public static void main(String[] args) {
        // It can reverse the characters within a stringBuffer object using reverse().
        StringBuffer s = new StringBuffer("Hello");
        s.reverse();   // it reverses Hello to olleH.
        System.out.println("\nThe string Hello reverses to : "+s);    // it prints Hello to olleH.
        StringBuffer a = new StringBuffer("Shirish");
        a.reverse();   // it reverses Shirish to hsirihS.
        System.out.println("The string Shirish reverses to : "+a);    // it prints Shirish to hsirihS.
        StringBuffer b = new StringBuffer("Anish");
        b.reverse();   // it reverses Anish to hsinA.
        System.out.println("The string Anish reverses to : "+b);   // it prints Anish to hsinA.
        StringBuffer c = new StringBuffer("Junel");
        c.reverse();   // it reverses junel to lenuJ.
        System.out.println("Jhe string Junel reverses to :"+c);   // it prints junel to lenuJ.
    }
    
}
