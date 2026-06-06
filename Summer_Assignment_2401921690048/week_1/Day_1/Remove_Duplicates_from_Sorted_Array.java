class Solution {
    public int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;
        int i = 0; int j = 1; int k = 1;
        while( j<a.length){
            while( a[i] == a[j] ){
                j++;
                if ( j >= a.length){
                    return k;
                }
            }
            
            if (i+1 != j && j < a.length){
                i++; 
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                k++;
                j++;
            }
            if (i+1 == j && j<a.length){
                i++;
                j++;
                k++;
            }
        }
        return k;
    }
}