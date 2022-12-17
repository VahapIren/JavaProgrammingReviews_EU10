package week15_12_17_2022.is_a_has_a;

public class ScrumTeam {
    //Scrum Team HAS A tester
    Tester tester;
    //Scrum Team HAS A developer
    Developer developer;

    public ScrumTeam(Tester tester, Developer developer) {
        this.tester = tester;
        this.developer = developer;
    }
}
