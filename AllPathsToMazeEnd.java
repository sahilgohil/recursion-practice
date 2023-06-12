    public static ArrayList<String> findAllPathsToMazeEnd(int sr,int sc, int er, int ec) {

        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr>er || sc>ec)
        {
            return new ArrayList<>();
        }

        ArrayList<String> east = findAllPathsToMazeEnd(sr, sc+1, er, ec);
        ArrayList<String> south = findAllPathsToMazeEnd(sr+1, sc, er, ec);

        ArrayList<String> ans = new ArrayList<>();
        for(String i:east)
        {
            ans.add("e"+i);
        }
        for(String i:south)
        {
            ans.add("s"+i);
        }
        return ans;
        
    }
