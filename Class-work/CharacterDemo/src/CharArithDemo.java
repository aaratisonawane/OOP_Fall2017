public class CharArithDemo {

    public static void main(String args[]) {
        char ch = 'x';
        System.out.println("Character is " + ch);
        ch++;
        System.out.println("Character is " + ch);
        ch = 90;
        System.out.println("Character is " + ch);

        for (ch = 0; ch < 128; ch++) {
            System.out.print("\t" + ch);
            if(ch%25 ==0)
                System.out.println();

        }

    }
}


