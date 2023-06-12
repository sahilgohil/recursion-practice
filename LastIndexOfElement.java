public static int lastOccurencerecursion(int[] arr, int idx, int key)
    {
        if(idx == arr.length)
        {
            return -1;
        }

        int ans = lastOccurencerecursion(arr, idx+1, key);

        if(ans == -1)
        {
            if(arr[idx] == key)
            {
                return idx;
            }
            else{
                return ans;
            }
        }
        else{
            return ans;
        }
    }
