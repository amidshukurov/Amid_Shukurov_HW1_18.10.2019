package HW3_Week_Planner;

import java.util.Scanner;

public class HW3_WeekPlanner {
    public static void main(String[] args) {

        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film.";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "Attend Iba tech academy lesson.";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "Work; Solving problems.";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "Visit parents after lesson.";
        scedule[5][0] = "Friday";
        scedule[5][1] = "A bit rest.";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "Again turning to lessons.a";
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("1. Please, input the day of the week:");
            //here input is cleaned from spaces
            String s = input.nextLine().toLowerCase().replaceAll(" ","");
//----------------------------------------------------------------------------------------------//
            //here system check input correctness. If wrong day of week entered system ask for enter correct day.
            // and if there is change request, task of the day is changed here and iteration start from top.
            int countercheck=0;//if day of week founded it turns to 1
            int counterforchange = 0; // if there is change request it turns to 1
            int counterforwrongchange =0;//if there is change and day of week entered wrong i use it to iterate till right day of week input
            while (countercheck==0) {
                // if there is change request, task of the day is changed here and iteration start from top.
                if (s.contains("change")||s.contains("reschedule")||counterforwrongchange ==1) {
                    System.out.println("Change request");
                    String takeDayOfWeek = s.replaceAll("change","").replaceAll("reschedule","");
                    counterforwrongchange = 1;
                    for (int i = 0; i < scedule.length; i++) {
                        if (scedule[i][0].toLowerCase().equals(takeDayOfWeek)) {
                            counterforchange=1;
                            countercheck=1;
                            s="";
                            System.out.format("Please, input new tasks for %s.", scedule[i][0]);
                            scedule[i][1]=input.nextLine();
                            System.out.format("You changed task for %s.\n", scedule[i][0]);
                        }
                    }
                }
                if (s.equals("exit"))  countercheck = 1;
                for (String[] strings : scedule) {
                    if (strings[0].toLowerCase().equals(s)) {
                        countercheck = 1;
                        break;
                    }
                }

                if (counterforchange==0 & counterforwrongchange==1) {
                    System.out.println("Change request can not be completed because you entered wrong day.");
                    System.out.println("2. Please, input the day of the week:");
                    counterforchange=0;
                    counterforwrongchange=1;
                    s = input.nextLine().toLowerCase().replaceAll(" ","");
                    continue;
                }
                if (countercheck!=1){
                    System.out.println(s);
                    System.out.println("Sorry, I don't understand you, please try again.");
                    System.out.println("3. Please, input the day of the week:");
                    s = input.nextLine().toLowerCase().replaceAll(" ","");
                }
            }
//-----------------------------------------------------------------------------------------------------------//

            //check for task of the day.
            switch (s){
                case "sunday":
                    System.out.format("Your tasks for %s: %s\n",scedule[0][0],scedule[0][1]);
                    continue;
                case "monday":
                    System.out.format("Your tasks for %s: %s\n",scedule[1][0],scedule[1][1]);
                    continue;
                case "tuesday":
                    System.out.format("Your tasks for %s: %s\n",scedule[2][0],scedule[2][1]);
                    continue;
                case "wednesday":
                    System.out.format("Your tasks for %s: %s\n",scedule[3][0],scedule[3][1]);
                    continue;
                case "thursday":
                    System.out.format("Your tasks for %s: %s\n",scedule[4][0],scedule[4][1]);
                    continue;
                case "friday":
                    System.out.format("Your tasks for %s: %s\n",scedule[5][0],scedule[5][1]);
                    continue;
                case "saturday":
                    System.out.format("Your tasks for %s: %s\n",scedule[6][0],scedule[6][1]);
                    continue;
                case "exit":
                    System.out.println("Thank you");
                    break;

            }
            break;
        }

    }
}
