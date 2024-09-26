import java.util.Scanner;

public class PemilihanHari11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Hari (1-7)");
        int hari = sc.nextInt();

        if (hari >=1 && hari <=5){
            System.out.println("Hari tersebut merupakan weekday");
        }else if (hari == 6 || hari == 7){
            System.out.println("Hari tersebut merupakan weekend");
        }else {
            System.out.println("Invalid number");
        }

       // String dayName, dayType;

        //System.out.println("Input day name: ");
        //dayName = sc.nextLine();
        
        //switch (dayName.toLowerCase()) {
          //  case "monday":
            //case "tuesday":
            //case "thursday":
            //case "friday":
              //  dayType = "weekday";
                //break;
            //case "saturday":
            //case "sunday":
              //  dayType = "weekend";
                //break;
            //default:
              //  dayType = "invalid day name";
            
        //}
        
        //System.out.println(dayName + " is a" + dayType);


    }

    
}
