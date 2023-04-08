class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList();
        int k;
        if(numRows==1)
        {
            List<Integer> ss = Arrays.asList(1);
            res.add(ss);
           return res;
        }
        if(numRows==2)
        {
            List<Integer> s = Arrays.asList(1);
            res.add(s);
           List<Integer> ss = Arrays.asList(1,1);
            res.add(ss);
           return res;
        }
        for(int i=0;i<numRows;i++)
        {
            List<Integer> arr= new ArrayList();
            
            if(i==0)
            {
                arr.add(1);
            }
            else if (i==1)
            {
                
                arr.add(1);
                arr.add(1);
            }
            else
            {
                arr.add(1);
                //System.out.println(res.get(0).get(0));
                for(k=1;k<i;k++)
                {
                    
                    int pop=res.get(i-1).get(k) + res.get(i-1).get(k-1);
                    arr.add(pop);
                }
                arr.add(1);
            }
            
            res.add(arr);
        }

        return res;
        
    }
}
