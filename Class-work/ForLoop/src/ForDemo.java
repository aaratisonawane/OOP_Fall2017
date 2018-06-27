public class ForDemo {

    public static void main(String args[]){
        int gal;
        double lit;
        for(gal=1;gal<=20;gal++){

            lit = gal * 3.7854;
            if (gal%10 == 0) {
                System.out.println(gal + " gallons is " + lit + " litters");
                System.out.println();
            }
             else
            System.out.println(gal +" gallons is " + lit + " litters");

        }
    }

}
