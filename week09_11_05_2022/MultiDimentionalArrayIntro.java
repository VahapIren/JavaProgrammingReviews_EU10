package week09_11_05_2022;

public class MultiDimentionalArrayIntro {
    public static void main(String[] args) {

        int[] firstArray={1,2,3,4};
        int[] secondArray={1,2,3,4};
        int[] thirdArray={1,2,3,4};

        int[][] twoDimenArray={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}

        };

        int[][] array2D={firstArray,secondArray,thirdArray};

        System.out.println(twoDimenArray[0][1]);
        for (int i = 0; i < twoDimenArray.length; i++) {
            for (int j = 0; j < twoDimenArray[i].length; j++) {

            }
        }


    }
}
