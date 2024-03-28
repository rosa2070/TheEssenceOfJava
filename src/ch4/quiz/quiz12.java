package ch4.quiz;

public class quiz12 {
    public static void main(String[] args) {
        for (int i=1; i<=9;i++) {
            for (int j=1; j<=3; j++) {
                int x = j+1 + (i-1)/3*3;
                int y = i%3==0? 3: i%3;

                if (x>9)
                    break;
                System.out.print(x + "*" + y + "=" + x*y+"\t");
            }
            System.out.println();
            if (i%3==0) System.out.println();
        }
    }




/*    public static void main(String[] args) {
        for (int i=2; i<=8; i+=3) {
            for (int j=1; j<=3; j++) {
                if(i!=8) {
                    int num = i;
                    System.out.print(num + "*" + j + "=" + num*j + "\t\t");
                    System.out.print(++num + "*" + j + "=" + num*j + "\t\t");
                    System.out.print(++num + "*" + j + "=" + num*j + "\t\t");
                    System.out.println();
                } else {
                    int num = i;
                    System.out.print(num + "*" + j + "=" + num*j + "\t\t");
                    System.out.print(++num + "*" + j + "=" + num*j + "\t\t");
                    System.out.println();
                }
            }

            System.out.println();
        }
    }*/
}
