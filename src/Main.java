import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Betül Kars JAVA-Ödev1");
        //Yaş Tespiti
        System.out.println("Yaş Tespiti");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println( hasTeen(23, 15, 42));
        System.out.println( hasTeen(22, 23, 34));

        //Havlayan Köpeğimiz
        System.out.println("Havlayan Köpeğimiz");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));


        //Oyuncu Kedi
        System.out.println("Oyuncu Kedi");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        //Alan Hesaplama
        System.out.println("Alan Hesaplama");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(-5.0, 4.0));

        //Alan Hesaplama(Daire)
        System.out.println("Lütfen yarıçap uzunluğunu giriniz.");
        Scanner scanner = new Scanner(System.in);
        double radius1;
        radius1 = scanner.nextDouble();
        System.out.println(area(radius1));

    }


    //Havlayan Köpeğimiz
    public static boolean  shouldWakeUp(boolean bark, int time){
        if(time<0 || time >23 ){
            return false;
        }
        if(bark == true){
            if(time>=8 && time<=20){
                return false;
            }
        }else if (bark == false){
            return false;
        }else {
            return true;
        }

        return bark;
    }




    //Yaş Tespiti
    public static boolean  hasTeen(int age1, int age2, int age3){
        if(age1 >=13 && age1 <=19 ){
            return true;
        }else if (age2 >=13 && age2 <=19 ) {
            return true;
        }else if (age3 >=13 && age3 <=19 ) {
            return true;
        }else{
            return false;
        }
    }



    //Oyuncu Kedi
    public static boolean isCatPlaying(boolean season, int heat){
        if(season == true){
            if(heat>=25 && heat<=45){
                return true;
            }else{
                return false;
            }
        }else if (season == false){
            if(heat>=25 && heat<=35){
                return true;
            }


        }
        return season;
    }

    //Alan Hesaplama
    public static double area(double sideLength1, double sideLength2){

        if(sideLength1<0 || sideLength2<0){
            return -1;
        }

        return sideLength1*sideLength2;
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }


}