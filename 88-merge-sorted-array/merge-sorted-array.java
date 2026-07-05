class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int x = nums1.length ; 

        // Remove placeholders 
        for (int i = m ; i < x ; i++) {
            nums1[i] = nums2[i-m];
        }

        // Sorting 
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < x ; i++) {
            swapped = false;
            for (j = 0; j < x - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}