    import java.util.Scanner;

    public class PemilihanHariDenganIf18 {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int hari;
            String dayType;

            System.out.print("Masukkan angka (1-7): ");
            hari = sc.nextInt();

            switch (hari) {
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                    dayType = "weekday";
                    
                    break;
                case 6 :
                case 7 :
                    dayType = "weekend" ;
                    break;
                default:
                    dayType = "invalid day name" ;     
            }

            System.out.println(hari + " is a " + dayType);
    
        }
    }
