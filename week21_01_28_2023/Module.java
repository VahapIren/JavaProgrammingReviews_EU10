package week21_01_28_2023;

import java.util.ArrayList;

public class Module {
    public String name;
    public ArrayList<Filee> files;

    public Module(String name) {
        this.name = name;
        files = new ArrayList<Filee>();
    }

    public Module(String name, ArrayList<Filee> files) {
        this.name = name;
        this.files = files;
    }
    public void addFile(Filee file) {
        files.add(file);
    }
    public void removeFile(Filee file) {
        files.removeIf(p->p.name==file.name&&p.size==file.size);
    }

    @Override
    public String toString() {
        return name+"\nFiles:"+"\n"+files;
    }
}
