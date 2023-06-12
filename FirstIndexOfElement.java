    public static int firstOccurenceRecursion(int[] arr, int idx, int key) {

        if(idx == arr.length)
        {
            return -1;
        }

        int ans = firstOccurenceRecursion(arr, idx+1,key);
        if(arr[idx] == key)
        {
            return idx;
        }
        else{
            return ans;
        }
        
    }
