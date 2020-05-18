package com.company;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumversFound = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
        }


        //challenge excercise
        public static boolean isEvenNumber(int number) {
            if((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }
    }





//    public static void main(String[] args) {
//        int count = 1;
//        while(count !=6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }


//       count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100){
//                break;
//            }
//        } while (count !=6);



//        for(int i = 1; i<6; i++){
//            System.out.println("Count value is " + i);
//        }

//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }


}
