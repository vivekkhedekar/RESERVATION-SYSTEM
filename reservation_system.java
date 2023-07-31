import java.util.Scanner;

public class reservation_system {
    public static void main(String[] args) {

        System.out.println("<<<<<welcome>>>>>>");
        System.out.println("<<<login/signup>>>");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to login or 0 to signup");
        int input = sc.nextInt();
        sc.nextLine();
        if (input == 1) {
            System.out.println("give your name");
            String name = sc.nextLine();
            System.out.println("enter your password");
            int pass = sc.nextInt();
            System.out.println("welcome " + name);
            System.out.println("enter city you want to travel");
            System.out.println("enter 1 for pune, 2 for nashik , 3 for thane and 4 for buldhana");
            int city = sc.nextInt();
            switch (city) {
                case 1:
                    System.out.println("enter the date you want to travel");
                    int date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    float time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    int person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 200;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 170;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    }

                    break;
                case 2:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 270;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                            System.out.println("press 1 to proceed or o to cancel");
                             proceed=sc.nextInt();
                            if(proceed==1){
                                System.out.println("now make your payment by entering 1");
                                int book =sc.nextInt();
                                System.out.println("congratulation your ticket is booked");
                                System.out.println("now you are logged out ");
                                System.out.println("thank you");


                            }
                            else {
                                System.out.println("your booking has been cancelled");
                                System.out.println("your logged out");
                            }
                        }

                    } else {
                        int fare = person * 230;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }
                    break;


                case 3:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 70;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 60;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }

                    break;
                case 4:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 870;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 800;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }
                    break;

                default:
                    System.out.println("invalid input");
            }


        } else {
            System.out.println("follow the steps to create your acoount");
            System.out.println("enter your name which will be used as your username");
            String username = sc.nextLine();
            System.out.println("create your password");
            int pass1 = sc.nextInt();
            System.out.println("welcome " + username);
            System.out.println("your logged in");
            System.out.println("enter city you want to travel");
            System.out.println("enter 1 for pune, 2 for nashik , 3 for thane and 4 for buldhana");
            int city = sc.nextInt();
            switch (city) {
                case 1:
                    System.out.println("enter the date you want to travel");
                    int date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    float time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    int person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 200;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 170;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }

                    break;
                case 2:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 270;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 230;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }
                    break;


                case 3:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 70;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 60;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }

                    break;
                case 4:
                    System.out.println("enter the date you want to travel");
                    date = sc.nextInt();
                    System.out.println("enter time slot you want to travel");
                    time = sc.nextFloat();
                    System.out.println("enter the number of person");
                    person = sc.nextInt();
                    if (date % 2 == 0) {
                        int fare = person * 870;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }

                    } else {
                        int fare = person * 800;
                        System.out.println("your fare is " + fare);
                        System.out.println("press 1 to proceed or o to cancel");
                        int proceed=sc.nextInt();
                        if(proceed==1){
                            System.out.println("now make your payment by entering 1");
                            int book =sc.nextInt();
                            System.out.println("congratulation your ticket is booked");
                            System.out.println("now you are logged out ");
                            System.out.println("thank you");


                        }
                        else {
                            System.out.println("your booking has been cancelled");
                            System.out.println("your logged out");
                        }
                    }
                    break;

                default:
                    System.out.println("invalid input");


            }
        }
    }
}
