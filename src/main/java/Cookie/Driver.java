package Cookie;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args){
        boolean myBoolean = false;
        boolean myBoolean2 = false;
        byte myByte = 123;
//      16 bits
        short s = 1234;
        char myChar = 'a';
//        whole number, maxes at just over 2 billion, 32 bits
        int myInt = 12345;
//        floats have an accuracy issue, don't use them
        float myFloat = 1.0000001F;
//        much larger than ints, potentially, 64 bits
        long myLong = 1234567890L;
        double myDouble = 222.22222222;


        Integer[] arrayOfIntegers = new Integer[16];


        int changeThisToInt = Integer.parseInt("5");

//        this doesn't exist, this is why we use wrappers:
//        int.changeThisToIntPlease("5");

        if(myBoolean){
//            do this
        }else if(myBoolean2){

        }else{

        }
        while(myBoolean && myBoolean2){
//            block scope: we can access a variable within only its own block
            int myScopedInt = 0;
            myScopedInt =5;

//            do that while conditional is true
        }
//        :(
//        myScopedInt =5;
        for(int i = 0; i < 16; i++){
            arrayOfIntegers[i] = 2;

        }



        do{

        }while(myBoolean2);

        myBoolean = returnTruePlease();

        Math.sqrt(4);




        Cookie c1 = new Cookie();
        Cookie c2 = c1;
//        we can modify public variables outside of the object
        c1.edible = true;
        c1.setType("chocolate chip");

        Cookie c3 = new Cookie("peanut butter", 100);
        Cookie c4 = new Cookie("oatmeal", 100);

        Cookie[] cookiesArray = new Cookie[4];

        cookiesArray[0]=c1;
        cookiesArray[1]=c2;
        cookiesArray[2]=c3;
        cookiesArray[3]=c4;
        myInt = cookiesArray.length;

        CookieList myList = new CookieList();
        myList.addCookie(c1);
        myList.addCookie(c2);
        myList.addCookie(c3);
        myList.addCookie(c4);

        myList.traverseCookies();

        Object[] myObjects = new Object[16];

        myObjects[0]=c1;


        System.out.println(myObjects[0]);


        CookieArrayList cookieArrayList = new CookieArrayList(cookiesArray, cookiesArray.length);

        String cookieString = cookieArrayList.getTypeOfCookie(0);


        Cookie cookie8 = new Cookie();
        cookie8.edible = true;
        cookie8.setType("Amazing");
        cookie8.setGrams(11.22);
        cookie8.setNumChips(5);

        Cookie cookie9 = new Cookie("Delicious", 34);

        Cookie[] testingAdd1 = cookieArrayList.addCookie(cookie8);

        for (int i = 0; i < testingAdd1.length; i++) {
            System.out.println("Type of cookie in Testing 1 is " + testingAdd1[i] + " at index " + i);
        }
        CookieArrayList cookieArrayList2 = new CookieArrayList(testingAdd1, testingAdd1.length);

        Integer indexOfFirstNull = cookieArrayList2.getIndexOfFirstNull(testingAdd1);
        System.out.println("Found Index of first null: " + indexOfFirstNull);

        Cookie[] testingAdd2 = cookieArrayList2.addCookie(cookie9);

        for(int i = 0; i < testingAdd2.length; i++) {
            System.out.println("Type of Cookie in Testing 2 is " + testingAdd2[i] + " at index " + i);
        }

        System.out.println("Testing if something is present: " + cookieArrayList2.isPresent("Absolutely"));




         cookieArrayList.setValueOfIndex(0, cookie9);

        System.out.println("Did the Array change after setting value: " + cookieArrayList.getTypeOfCookie(0));

        CookieArrayList cookieArrayList3 = new CookieArrayList(cookiesArray, cookiesArray.length);

        Boolean isIdentical = CookieArrayList.isIdentical(cookieArrayList, cookieArrayList3);

        for(int i = 0; i <cookieArrayList.lengthOfArray; i++) {
            System.out.println("Each cookie from Array List 1: " + cookieArrayList.getTypeOfCookie(i));
        }

        for(int i = 0; i <cookieArrayList3.lengthOfArray; i++) {
            System.out.println("Each cookie from Array List 3: " + cookieArrayList3.getTypeOfCookie(i));
        }

        System.out.println("Checking to see if arrayLists are identical: " + isIdentical);

    }

    public static boolean returnTruePlease(){
        return true;
    }

}