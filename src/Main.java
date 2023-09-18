import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Betül Kars JAVA-Ödev1");
        //Yaş Tespiti
        System.out.println("-------Yaş Tespiti-------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println( hasTeen(23, 15, 42));
        System.out.println( hasTeen(22, 23, 34));

        //Havlayan Köpeğimiz
        System.out.println("-------Havlayan Köpeğimiz-------");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));


        //Oyuncu Kedi
        System.out.println("-------Oyuncu Kedi-------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        //Alan Hesaplama
        System.out.println("-------Alan Hesaplama-------");
        Scanner scan= new Scanner(System.in);
        try{
            System.out.println("Kısa kenarı giriniz:");
            double a = scan.nextDouble();
            System.out.println("Uzun kenarı giriniz:");
            double b = scan.nextDouble();
            System.out.println("Dikdörtgenin Alanı= " + area(a, b));
        }
        catch (Exception ex){
            System.out.println("Hatalı giriş yapıldı");
        }

        System.out.println("-------Dairenin Alanı-------");
        try{
            System.out.println("Yarıçapı giriniz: ");
            double radius = scan.nextDouble();
            System.out.println("Dairenin Alanı= " + area(radius));
        } catch (Exception ex){
            System.out.println("Hatalı giriş yapıldı");
        }

    }


    //Havlayan Köpeğimiz
    public static boolean  shouldWakeUp(boolean bark, int time){
        if(time<0  ||time>23    ) return false;
        if(!bark) return false;
        return time < 8 || time >= 20;
    }




    //Yaş Tespiti
    public static boolean  hasTeen(int age1, int age2, int age3){
        return (age1 >=13 && age1 <=19 ) || (age2 >=13 && age2 <=19 ) || (age3 >=13 && age3 <=19 );

    }



    //Oyuncu Kedi
    public static boolean isCatPlaying(boolean season, int heat){
        if(season){
           return  heat>=25 && heat<=45;
        }return heat>=25 && heat<=35;


    }

    //Alan Hesaplama
    public static double area(double sideLength1, double sideLength2){

        if(sideLength1<0 || sideLength2<0){
            System.out.println("Kenar uzunlukları 0'dan büyük olmalıdır.");
            return -1;
        }

        return sideLength1*sideLength2;
    }

    public static double area(double radius){
        if(radius<0){
            System.out.println("Yarıçap 0'dan büyük olmalıdır!");
            return -1;
        }
        return radius*radius*Math.PI;
    }


}