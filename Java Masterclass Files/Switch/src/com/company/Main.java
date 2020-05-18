package com.company;

public class Main {

    public static void main(String[] args) {
//    int value = 3;
//	if(value == 1) {
//        System.out.println("value was 1");
//    } else if (value == 2) {
//        System.out.println("value was 2");
//    } else {
//        System.out.println("was not 1 or 2");
//    }

	int switchValue = 1;

	switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4:case 5:
            System.out.println("was 3 or 4 or 5");
            break;
        default:
            System.out.println("was not 1 or 2");
            break;
    }
    //challenge with char D
    char charValue = 'D';
    switch(charValue) {
        case 'A':
            System.out.println("Letter was A");
            break;
        case 'B':
            System.out.println("Letter was B");
            break;
        case 'C':
            System.out.println("Letter was C");
            break;
        case 'D':
            System.out.println("Letter was D");
            break;
        default:
            System.out.println("was some other letter");
            break;
    }


    }
}
