package week21_01_28_2023;

public class Filee {
    public String name;
    public double size;

    public Filee(String name, double size){
        this.name=name;
        this.size=size;
    }

    public void openFile(){
        System.out.println("Opening "+name);
    }
    public String toString(){
        return "File{"+name+" | "+size+" mb}";
    }
}
