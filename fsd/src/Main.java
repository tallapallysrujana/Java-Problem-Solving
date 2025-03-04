//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
    }
}
//src for source files are where we create our programs
//java we cannot create functions but can create methods functions inside the class
//variables are not allowed to create outside the class but inside class automatically relate to the objects
//can be created outside function but inside the class
//methods --> objects are used
//. public
//Access Modifier: This means that the main method can be accessed from anywhere, allowing the Java Virtual Machine (JVM) to invoke it from outside the class.
//to make it independent of object we use static
//direct access then without object creation then we have to create static method we can access direct like directly calling without the object creation sayhello();
//jvm invokes that from outside the class
//static allows jvm to access method without object
//for everyclass it creates a seperate .class file
// having multiple .class files with their own main methods is perfectly valid in Java, and you can run each class independently.
//but starts execution with the first class that contains the main method
//explicitly choose which class to run
//.class files ae stored in the out folder
//each .class file can be executed seperately and explicitly choosing which class to be executed
//single class containing main methods
//Method Overloading
//Definition: Method overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).
