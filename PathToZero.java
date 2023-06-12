// find all the paths that reach zero 
// you can take one step, two steps, three steps
public static ArrayList<String> pathsToZero(int n) {
        if(n == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0)
        {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        // ways from path 1
        ArrayList<String> oneWay = pathsToZero(n-1);
        // ways from path 2
        ArrayList<String> twoWay = pathsToZero(n-2);
        // ways from path 3
        ArrayList<String> threeWay = pathsToZero(n-3);

        ArrayList<String> ans = new ArrayList<>();
        for(String i:oneWay)
        {
            ans.add(1+i);
        }
        for(String i:twoWay)
        {
            ans.add(2+i);
        }
        for(String i:threeWay)
        {
            ans.add(3+i);
        }
        return ans;
        
    }
