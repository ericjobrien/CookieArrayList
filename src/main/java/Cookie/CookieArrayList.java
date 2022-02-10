package Cookie;


import java.lang.reflect.Array;
import java.util.Arrays;

public class CookieArrayList {

//    variables needed:
//    Array of something;
    Cookie[] cookieArray;
//    The current amount of somethings;
    Integer lengthOfArray;

//    Constructor that creates an initial array of some size;
    public CookieArrayList() {

    }

    public CookieArrayList(Cookie[] cookieArray, Integer lengthOfArray) {
        this.cookieArray = cookieArray;
        this.lengthOfArray = lengthOfArray;
    }

    //    Get method that returns the something of a given index;

    public String getTypeOfCookie(int index) {

        return String.valueOf(this.cookieArray[index]);
    }

    public Integer getIndexOfFirstNull(Cookie[] cookieArray) {

        Integer counter = 0;

        for(int i = 0; i < cookieArray.length; i++) {
            if(cookieArray[i] != null) {
                counter ++;
            } else {
                return counter;
            }
        }

        return counter;
    }

//    Add method
//    First, check that the arraylist will not break if we try to add at the next index:
//    IE, check if the current amount of somethings+1 is not greater that the array size
//    if it is greater:
//          Copy the elements of the current array to a new array.
//          set the pointer of the arrayList's internal array to the new array.
//    that adds things at an index that is currently unused
//    (this will be the current size)

    public Cookie[] addCookie(Cookie cookie) {

        Cookie[] cookies = this.cookieArray;
        Integer currentLength = this.getIndexOfFirstNull(cookies);
        System.out.println("This is the current length of add feature: " + currentLength);

        if(currentLength >= cookies.length) {
           Cookie[] newCookieArray = new Cookie[currentLength * 2];
            for (int i = 0; i < cookies.length; i++) {
                newCookieArray[i] = cookies[i];
            }
            for(int j = 0; j < newCookieArray.length; j++) {
                if(newCookieArray[j] == null) {
                    currentLength = j;
                    newCookieArray[j] = cookie;

                    break;
                }
            }
            return newCookieArray;
        } else {
            cookies[currentLength] = cookie;
        }

        return cookies;
    }



//    a method that can return a boolean determining if your array list contains a certain item

    public Boolean isPresent(String cookieType) {
        Cookie checkCookie;
        for(int i = 0; i < this.lengthOfArray; i++) {
            checkCookie = this.cookieArray[i];

            while(checkCookie.getType() != null) {
                if(checkCookie.getType() == cookieType) {
                    return true;
                } else {
                    return false;
                }
            }

        }

        return false;
    }
//    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
//    a method that can determine if your arraylist is identical to another one

    public static Boolean isIdentical(CookieArrayList cookieArrayList1, CookieArrayList cookieArrayList2) {

        if (cookieArrayList1.lengthOfArray != cookieArrayList2.lengthOfArray) {
            return false;
        } else {
            for(int i = 0; i < cookieArrayList1.lengthOfArray; i++) {
                if(cookieArrayList1.getTypeOfCookie(i) == cookieArrayList2.getTypeOfCookie(i)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

//    (again, .equals)
//    a method that sets a given index to a particular value

    public void setValueOfIndex(Integer index, Cookie cookie) {

        this.cookieArray[index] = cookie;
    }

    public static Integer getArrayListSize(CookieArrayList cookieArrayList) {

        Integer counter = 0;

        for(int i = 0; i < cookieArrayList.lengthOfArray; i++) {
            counter ++;
        }


        return counter;
    }





}