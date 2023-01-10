import java.util.Scanner;

public class Code extends NumberMethod {

        public static void main(String[] args) {
            NumberMethod numberCars = new NumberMethod();

            numberCars.region();




        }
    }

    class NumberMethod {


        static String setNumberCars() {
            String[] numbers1 = new String[10001];
            for (int i = 0; i < numbers1.length; i++ ) {
                String str = "000" + i;
                String substring = str.substring(str.length() - 4);
                numbers1[i] = substring;
            }


            int n = (int)Math.floor(Math.random() * numbers1.length);
            return numbers1[n];
        }


        static String combination() {
            String[] symbol = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                    "U", "V", "W","X", "Y", "Z" };
            int a = (int)Math.floor(Math.random() *symbol.length);
            int b = (int)Math.floor(Math.random() *symbol.length);
            String element1 = symbol[a];
            String element2 = symbol[b];
            return element1 + element2;

        }

         void region () {

            String cher = "Черниговская".substring(0,4);
            String kiev = "г. Киев".substring(0,4);
            String kievDistrict = "Киевская".substring(0,6);

            System.out.println("Введіть область:");

            Scanner scanner = new Scanner(System.in);
            String reg0 = scanner.nextLine();
            String reg = reg0.substring(0,4);
            String regKievDistrict = reg0.substring(0,6);


            if (cher.equalsIgnoreCase(reg)) {
                System.out.println( "IB " +setNumberCars()+ " "+combination());
            } else if (kiev.equalsIgnoreCase(reg)) {
                System.out.println( "KA " +setNumberCars()+ " "+combination());
            } else if (kievDistrict.equalsIgnoreCase(regKievDistrict))
                System.out.println("KI " + setNumberCars() + " " + combination());
            else {
                System.out.println("Спробуй ще раз");
            }





        }
}
