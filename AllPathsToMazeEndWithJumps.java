   public static ArrayList<String> findAllPathsToMazeEndWithJumps(int sr,int sc, int er, int ec) {

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
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=ec-sc;i++)
        {
            ArrayList<String> eastJump = findAllPathsToMazeEndWithJumps(sr, sc+i, er, ec);
            for(String s:eastJump)
            {
                ans.add(i+"e"+s);
            }
        }
        for(int i=1;i<=er-sr;i++)
        {
            ArrayList<String> southJump = findAllPathsToMazeEndWithJumps(sr+i, sc, er, ec);
            for(String s:southJump)
            {
                ans.add(i+"s"+s);
            }

        }
        for(int i=1;i<=er-sr;i++)
        {
            ArrayList<String> diagonalJumps = findAllPathsToMazeEndWithJumps(sr+i, sc+i, er, ec);
            for(String s:diagonalJumps)
            {
                ans.add(i+"d"+s);
            }

        }
        return ans;
        
    }
