/*
 * This code shows how to compile class .java files into .class files inside a remote directory.
 * This improves code/architecture readability and separation of concerns.
 * 
 * To compile ClassA.java and ClassB.java into ClassA.class and ClassB.class in a remote repo, execute:
 * 
 * javac -d classes packagea/ClassA.java packageb/ClassB.java
 * 
 * Then, to execute the java project from ClassB.class, we run either of the three: 
 * 
 * java -cp classes packageb/ClassB
 * java -classpath classes packageb/ClassB
 * java --class-path classes packageb/ClassB
 * 
 * Note: we can use -cp, -classpath or --class-path instead of -d to compile the code too.
 */

package packageb;

import packagea.ClassA;

public class ClassB {
    public static void main(String args[]) {
        ClassA classA;
        System.out.println("Got it");
    }
}
