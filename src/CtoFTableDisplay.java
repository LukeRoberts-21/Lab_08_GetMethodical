public class CtoFTableDisplay {
    static void main(){
        for (int i =-100; i<=100; i++){
            double celcius = i;
            double f = CtoF(celcius);
            System.out.printf("%-10.0f | %10.2f%n",celcius,f);
        }
    }
    public static double CtoF(double Celsius){
        double F = (Celsius*9/5)+32;
        return F;
    }
}
