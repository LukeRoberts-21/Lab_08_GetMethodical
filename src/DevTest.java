import java.util.Scanner;
public class DevTest {
    static Scanner in = new Scanner(System.in);
    static void main() {
//        String name = SafeInput.getNonZeroLenString(in,"Enter your name ");
//        System.out.println("Your name is: " + name);
//
//        int favNum = getInt(in,"Enter your favorite number");
//        System.out.println("Your favorite number is "+favNum);

//        double Salary = getDouble(in, "Enter your Salary");
//        System.out.println("Your salary is: "+ Salary);
//
//        int age =  getRangedInt(in,"Enter your age",18,100);
//        System.out.println("Your age is "+ age);
//        double salary = getRangedDouble(in,"Enter your salary",200.5,100000.6);
//        System.out.println("Your salary is " + salary);
//        boolean confirm = getYNConfirm(in,"Do you want to continue");
//        System.out.println("Your answer is "+ confirm);
//
//        String regEx = "[a-zA-Z0-9]+";
//         String name = getRegExString(in,"Enter your name",regEx);
//        System.out.println("Your name is "+name);
//
//        String SSN_regEx = "^\\d{3}-\\d{2}-\\d{4}$";
//        String UC_ID_regEx = "^M\\d{5}$";
//        String SSN = getRegExString(in,"Enter your Social Security Number",SSN_regEx);
//        System.out.println("Your SSN is "+SSN);
//
//        String UC_ID = getRegExString(in,"Enter UC ID",UC_ID_regEx);
//        System.out.println("Your UC ID is "+UC_ID);
        prettyHeader("hi");




    }

    /**
     *
     * @param msg
     */
    public static void prettyHeader(String msg){
        int totalWidth = 60;
        int sideStars = 3;
        for (int j = 0; j< totalWidth; j++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("***");
        int totalSpace = totalWidth - 6 - msg.length();
        int leftSpace = totalSpace / 2;
        int rightSpace = totalSpace - leftSpace;
        for (int j=0; j<leftSpace;j++ ){
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int j=0; j<rightSpace; j++){
            System.out.print(" ");
        }
        System.out.println("***");
        for (int j = 0; j< totalWidth; j++){
            System.out.print("*");
        }

    }

    /**
     *
     * @param pipe Scanner
     * @param prompt Prompt user on what to enter
     * @param regEx Regular expression to match
     * @return a string in the format of regEx
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        boolean done = false;
        String val = "";
        do{
            System.out.print(prompt + ": ");
            val = pipe.nextLine();
            if(val.matches(regEx)){
                done= true;
            }else {
                System.out.println("Enter a value that matches the pattern: "+regEx + " Not "+val);
                continue;
            }
        }while (!done);
        return val;
    }





    /**
     *
     * @param pipe Scanner
     * @param prompt Prompts the user
     * @return Returns
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        boolean done = false;
        String val = "";
        do{
            System.out.print(prompt + " [Y/N]: ");
            val = pipe.nextLine();
            if(val.equalsIgnoreCase("Y")||val.equalsIgnoreCase("N")){
                done=true;
            }else {
                System.out.println("Enter Y or N");
                continue;
            }
        }while (!done);
        return val.equalsIgnoreCase("Y");
    }









    /** @param pipe Scanner
     * @param prompt Prompts the user
     * @param low Lower bound
     * @param high Upper bound
     * @return a double within the range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double val = 0;
        do{
            System.out.print(prompt + "["+low +", "+high+ "]: ");
            if (pipe.hasNextDouble()){
                val =pipe.nextDouble();
                if (val >= low && val <= high)
                    done= true;
                else {
                    System.out.println("The double is not in range. Must be larger than " +low +" and smaller than " + high );
                    continue;
                }
            }
            else{
                String trash = pipe.nextLine();
                System.out.println("Enter a valid double, not " + trash);
                continue;
            }
        }while (!done);
        return val;
    }



    /**
     * Gets a number from user and determines if it is within a bound
     * @param pipe Scanner
     * @param prompt Prompts the user
     * @param low Lower bound
     * @param high Upper bound
     * @return an int within the range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int val = 0;
        do{
            System.out.print(prompt + "["+low+" - "+high+"] : ");
            if (pipe.hasNextInt())
            {
                val =pipe.nextInt();
                pipe.nextLine();
                if (val >= low && val <= high)
                    done= true;
                else
                    System.out.println("The integer is not in range. Must be larger than " +low +" and smaller than " + high );


            }
            else{
                String trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not " + trash);


            }
        }while (!done);
        return val;
    }












    /**
     * A method that gets a double from the user
     * @param pipe Scanner to read the double
     * @param prompt prompt user
     * @return an double value
     *
     *
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double val = 0;
        do{
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()){
                val =pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                String trash = pipe.nextLine();
                System.out.println("Enter a valid double, not " + trash);
            }
        }while (!done);
        return val;
    }











    /**
     * A method that gets an integer from the user
     * @param pipe Scanner to read the Int
     * @param prompt prompt user
     * @return an int value
     *
     *
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        double val = 0;
        do{
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()){
                val =pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                String trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not " + trash);
            }
        }while (!done);
        return (int) val;
    }
//    public static int getInt(Scanner pipe, String prompt) {
//
//        do {
//            System.out.print(prompt+ ": ");
//        }
//    }









    /**
     * A method that gets a non-zero length String from the user.
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

}
