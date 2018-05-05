package ua.ppankk;

public class ModuleOne {

    public void MyMethod(){
        ModuleTwo moduleTwo = new ModuleTwo();
        ModuleThree moduleThree = new ModuleThree();

        System.out.println("Hello this is a module B. It calls module C & module D");

        moduleTwo.MyMethod();
        moduleThree.MyMethod();
    }
}