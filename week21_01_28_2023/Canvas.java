package week21_01_28_2023;

import java.util.ArrayList;

public class Canvas {
    public String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        quizzes = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return topic+" course\n"+"Quizzes:\n"+quizzes+"Modules:\n"+modules;
    }
}
