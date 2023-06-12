public static int[] findAllIndicesRecursion(int[] arr, int idx, int key, int fsf) {
        if(arr.length == idx)
        {
            return new int[fsf];
        }

        // either i find it 
            // if i find it then i have to return the array having the index filled
            if(arr[idx] == key)
            {
                int[] recArray = findAllIndicesRecursion(arr, idx+1, key, fsf+1);
                recArray[fsf] = idx;
                return recArray;
            }
            else{
                int[] recArray = findAllIndicesRecursion(arr, idx+1, key, fsf);
                return recArray;
            }

        // or i dont find it
            // if i dont find then return the array as it is
        
    }
