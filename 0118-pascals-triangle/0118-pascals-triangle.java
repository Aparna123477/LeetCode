class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
      
            res.add(new ArrayList<Integer>());
            res.get(0).add(1);
            for(int i=1;i<numRows;i++)
            {
                List<Integer>newRows=new ArrayList<>();
                newRows.add(1);
                List<Integer>prevRow=res.get(i-1);
                for(int j=1;j<i;j++)
                {
                    newRows.add(prevRow.get(j)+prevRow.get(j-1));
                }
                newRows.add(1);
                res.add(newRows);
            }
            return res;
            
        
        
    }
}