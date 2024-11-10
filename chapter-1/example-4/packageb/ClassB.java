/*
 * This code snippet shows how to declare packages, import classes from other packages, compile and run files.
 * 
 * To compile both ClassA and ClassB files, first, we open the terminal and cd (change directory) into the example-4 folder.
 * Then, we run the following command:
 * javac packageb/ClassA.java packageB/ClassB.java
 * 
 * This will create two .class files in their respective folders. Then we can execute ClassB.class by running:
 * java packageb/ClassB
 * 
 * "Got it" should be printed out successfully !
 */

package packageb;
import packagea.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}
