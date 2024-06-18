package org.example.sesiketiga;

public class MethodAndFunction {
    public static void main(String[] args) {
        printHelloWorld();

        System.out.println("==================");

        System.out.println(printNamaSaya());

        System.out.println("==================");

        int terimaPrintDenganParameter = printDenganParameter(2);

        System.out.println(terimaPrintDenganParameter);

        System.out.println(useDefaultValue(""));

        System.out.println(testNull("uhuy"));

    }

    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }


    public static String printNamaSaya(){
        String name = "Ilham";
        return name;
    }

    public static int printDenganParameter(int number){
        if (number > 0){
            return 1;
        } else {
            return 0;
        }
    }

    // default value

    public static String useDefaultValue(String name){
        if (name.equals("")){
            return "default Value";
        } else {
            return "";
        }
    }

    // null pointer exception

    public static String testNull(String name){
        if (name.isEmpty()){
            return "ini null";
        } else {
            return name;
        }
    }

    // Overloading

    // buat method, tapi parameternya beda

    public static String methodOverloading(String name){
        return "";
    }

    public static String methodOverloading(String name, int age){
        return "";
    }
}
