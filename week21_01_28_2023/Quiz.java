package week21_01_28_2023;

public class Quiz {
    public String topic;
    public int questions;
    public double points;

    public Quiz(String topic,int questions, double points){
        this.topic=topic;
        this.questions=questions;
        this.points=points;
    }

    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }

    public String toString(){
        return "Quiz | "+topic+" quiz with "+questions+" questions for a total of "+points+" total points";
    }
}
