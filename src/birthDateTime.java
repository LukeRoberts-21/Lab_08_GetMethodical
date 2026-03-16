import java.util.Scanner;

public class birthDateTime {
    static void main() {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in,"Enter the year you were born",1950,2015);
        System.out.println("The year you were born is: "+year);
        int month = SafeInput.getRangedInt(in,"Enter the month you were born", 1,12);
        System.out.println("The month you were born is: " + month);
        int maxDays = 0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 29;
                break;
        }
        int day = SafeInput.getRangedInt(in,"Enter the day that you were born on",1,maxDays);
        System.out.println("The day you were born on is: "+ day);
        int hour = SafeInput.getRangedInt(in,"Enter the hour it was when you were born",0,23);
        System.out.println("The hour it was when you were born was: "+hour);
        int minute = SafeInput.getRangedInt(in,"Enter the minute it was when you were born",0,59);
        System.out.println("The minute it was when you were born was: "+minute);
        System.out.println("Your birthday is "+month+"/"+day+"/"+year+" and it is at the time " + hour+":"+minute);

    }
}
