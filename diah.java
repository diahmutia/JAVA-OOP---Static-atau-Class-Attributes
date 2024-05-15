class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        Display.type = typeInput;
    }
    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main{
    public static void main (String[] args){

        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        display1.setType("Speaker");

        //tampilkan static variabel atau class variabel
        System.out.println("\nMenampilkan static variabel atau class variabel");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}