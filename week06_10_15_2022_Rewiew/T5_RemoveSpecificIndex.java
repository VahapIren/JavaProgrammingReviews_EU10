package week06_10_15_2022_Rewiew;

public class T5_RemoveSpecificIndex {
    public static void main(String[] args) {

        String word="Adamm";
        int index=0;
        String temp="";
        if (index>=word.length()||index<0){
            System.out.println("thi is not valid index");
        }else{
            for (int i = 0; i < word.length(); i++) {
                if (i==index){
                    continue;

                }
                temp+=word.charAt(i);
            }
            System.out.println(temp);
        }

    }
}
