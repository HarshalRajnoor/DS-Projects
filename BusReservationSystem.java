import java.util.Scanner;
public class BusReservationSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] seat = new int[20];
        // bookSeat(seat);
        // display(seat);
        System.out.println("Press 9 to start the operation");
        int userInput = in.nextInt();
        mainMeth(seat,userInput);
    }
    public static void mainMeth(int[]seat, int userInput){
        Scanner in = new Scanner(System.in);
        while (userInput != 5) {
            System.out.println("Enter a number to select a operation");
            System.out.println("1. To display the seats");
            System.out.println("2. To book a seat");
            System.out.println("3. To cancel the booked seat");
            System.out.println("5. To exit ");
            userInput = in.nextInt();
            if (userInput == 1) {
                display(seat);

            } else if (userInput == 2) {
                bookSeat(seat);

            } else if (userInput == 3) {
                cancelSeat(seat);

            }
        }
    }
    public static void display(int[] arr) {
        int n = 0;
        while (n < arr.length) {
            if (arr[n] == 0) {
                System.out.println(n + 1 + " Empty");
            } else {
                System.out.println(n + 1 + " Booked");
            }
            n++;
        }
    }

    public static void bookSeat(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seat number");
        int seatNo = input.nextInt();
        arr[seatNo - 1] = 1;
        System.out.println("Successfully booked the seat!!");
    }

    public static void cancelSeat(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seat number");
        int seatNo = input.nextInt();
        arr[seatNo - 1] = 0;
        System.out.println("Successfully canceled the seat!!");
    }
}
