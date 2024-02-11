public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(secondMaxValue(new int[] {2,8,3,7,8}));
    }
    
    public static int findMissingInt (int [] array) { 
        int num = 0; 
        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] == num ) {
                num++;
                i=0;
            }
            if ( i == (array.length)-1 ) {
                return num;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) { // 2 8 3 7 8 
        int lim = 0;
        int res;
        int min1 = minNumber(array);
        int max1 = maxNumber(array);
        for ( int i = 0; i < (max1-min1); i++ ) {
            for ( int j = 0; j < array.length; j++ ) {
                if ( array[j] == max1 - lim ) {
                    res = array[j];
                    return res;
             } 
          }
          lim++;
  }
        return -1;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int count = 0;
        int [] exampleLong = whoIsLonger(array1, array2);
        int [] exampleShort = whoIsShorter(array1, array2);
        for ( int i = 0; i < exampleLong.length; i++ ) {
            for ( int j = 0; j < exampleShort.length;j++ ) {
                if ( exampleLong[i] != exampleShort[j] ) {
                    count++;
                }
                if ( count == exampleShort.length ) {
                    return false;
                }
            } 
            count = 0;
        } 

        return true;
    }

    public static boolean isSorted(int [] array) { 
        int count1 = 0;
        int count2 = 0;
        for ( int i = 0;i < array.length;i++ ) {
            if ( i == (array.length)-1 && count1 == (array.length)-1 ) return true;
            if ( i == (array.length)-1 ) break;
            if ( array[i] >= array[i+1] ) {
                count1++;
            } 
        }
        for ( int i = 0;i < array.length;i++ ) {
            if ( i == (array.length)-1 && count2 == (array.length)-1 ) return true;
            if ( i == (array.length)-1 ) break;
            if ( array[i] <= array[i+1] ) {
                count2++;
            }
        }
            return false;
        
    }

    public static int maxNumber ( int [] arr ) { 
        int maxNum = arr[0]; 
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] > maxNum ) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int minNumber ( int [] arr ) { 
        int minNum = arr[0];
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < minNum ) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    public static int [] whoIsLonger ( int [] arr1,int [] arr2 ) { 
        int first = 0;
        int second = 0;
        for ( int i = 0; i < arr1.length;i++ ) {
            first++;
        }
        for ( int i = 0; i < arr2.length;i++ ) {
            second++;
        }
        if ( first > second ) return arr1;
        else return arr2;
    } 

    public static int [] whoIsShorter ( int [] arr1,int [] arr2 ) {
        int first = 0;
        int second = 0;
        for ( int i = 0; i < arr1.length;i++ ) {
            first++;
        }
        for ( int i = 0; i < arr2.length;i++ ) {
            second++;
        }
        if ( first > second ) return arr2;
        else return arr1;
    }


}
