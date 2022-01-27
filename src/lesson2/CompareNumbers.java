package lesson2;

public class CompareNumbers {
    public static void main(String[] args) {
        int [] num = {1,90,-4,1987,-378,43,78,-9834,36};
        BiggestNumber nc = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if(tab.length == 0)
                    throw new IllegalArgumentException("array has to have at least 1 value");

                int biggestNumber = tab[0];
                for(int i=1; i<tab.length; i++) {
                    if(biggestNumber < tab[i]) {
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };

        System.out.println("Największa liczba to: " + nc.takeBiggest(num));

    }
}
