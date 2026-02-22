abstract class Sun {
    abstract void printInfo();
}

class Employee extends Sun {

    void printInfo() {
        String name = "JAGADHEESH";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Base {
    public static void main(String args[]) {

        Sun s = new Employee();   
        s.printInfo();
    }
}
