public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        }
        
    

    public static String capVowelsLowRest (String string) { 
        char [] sVowels = {'a','e','i','o','u','#','@'};
        char [] bVowels = {'A','E','I','O','U','#','@'};
        char [] sLetters = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char [] bLetters = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
        int lim = 0;
        String res = "";
        for ( int i = 0;i < string.length();i++ ) {
            for ( int j = 0;j < bLetters.length;j++ ) {
                if ( (string.charAt(i) == sVowels[lim]) && lim < sVowels.length ) {
                    res = res + (char)(string.charAt(i) - 32);
                }
                if ( (string.charAt(i) == bVowels[lim]) && lim < bVowels.length ) {
                    res = res + string.charAt(i);
                }
                if ( string.charAt(i) == sLetters[j] ) {
                    res = res + string.charAt(i);
                } 
                if ( string.charAt(i) == bLetters[j] ) {
                    res = res + (char)(string.charAt(i) + 32);
                }
                if ( string.charAt(i) == 32 && j == (bLetters.length - 1) ) {
                    res += " ";
                }
                if ( j >= 4 ) {
                    lim = 5;
                } 
                lim++;
                if ( j == (bLetters.length - 1) ) {
                    lim = 0;
                }
            }
        }

        return res;
    }

    public static String camelCase (String string) {
        char [] bLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] sLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count = 0;
        String res = "";
        boolean lim = true;
        for ( int i = 0;i < string.length();i++ ) { 
            if ( string.charAt(i) == 32 && lim == false ) {
                break; }       
            for ( int j = 0;j < bLetters.length;j++ ) {
                if ( string.charAt(i) == bLetters[j] ) {
                    res = res + (char)(string.charAt(i) + 32);
                    lim = false;
                    count++;
                }
                if ( string.charAt(i) == sLetters[j] ) {
                    res = res + string.charAt(i);
                    lim = false;
                    count++;
            }
            if ( string.charAt(i) == 32 && j == bLetters.length - 1 ) {
                count++;
            }
        }     
        } 
    
        for ( ;count < string.length();count++ ) {
            for ( int j =0; j < bLetters.length;j++ ) {
            if ( string.charAt(count) == 32 ) {
                res = res;
            }
            if ( string.charAt(count) != 32 && string.charAt(count -1) == 32 ) {
                if ( string.charAt(count) == sLetters[j] ) {
                    res = res + (char)(string.charAt(count) - 32);
            }   else if ( string.charAt(count) == bLetters[j] ) {
            res = res + string.charAt(count);}
         }
         if ( string.charAt(count) == sLetters[j] && string.charAt(count -1) != 32 ) {
            res = res + string.charAt(count);
         }
         if ( string.charAt(count) == bLetters[j] && string.charAt(count -1) != 32 ) {
            res = res + (char)(string.charAt(count) + 32);
         }
      }   
 }
        return res;
    
}

    public static int[] allIndexOf (String string, char chr) { //Hello World , l
        int arrPush = 0;
        int count = 0;
        for ( int i = 0; i < string.length();i++ ) {
            if ( string.charAt(i) == chr ) { 
                count++;
            }
        }
        int [] arr = new int [count];
        for ( int i = 0; i < string.length();i++ ) {
            if ( string.charAt(i) == chr ) {
                arr[arrPush] = i;
                arrPush++;
            }
        }

        return arr;
    }
}
