package ua.ppankk;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello this is a module A. It calls module B..." );

        ModuleOne moduleOne = new ModuleOne();
        moduleOne.MyMethod();

    }

}
