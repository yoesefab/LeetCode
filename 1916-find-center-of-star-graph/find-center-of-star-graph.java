class Solution {
    public int findCenter(int[][] edges) {
        
        int center1 = edges[0][0] ; 
        int center2 = edges[0][1] ; 

        // Check Is Center One is The Star 
        for(int i = 1 ; i < edges.length ; i++) 
        {
                if ((edges[i][0] != center1) && (edges[i][1] != center1)) 
                {
                    return center2; 
                }
        }
        return center1 ; 
    }
}