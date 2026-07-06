class Solution {
    int n,m;
    int [][]grid;
    int [][]solution;
    int total;
    int ob;
    int s1,s2;
    int count=0;
    boolean find(int i,int j,int step){
        if(i<0||i>=n||j<0||j>=m||grid[i][j]==-1||solution[i][j]==1){
            return false;
        }
        if(grid[i][j]==2){
            if(total==step){
                count++;
            }
            return false;
        }
        solution[i][j]=1;
        if(find(i+1,j,step+1)) return true;
        if(find(i,j+1,step+1)) return true;
        if(find(i-1,j,step+1)) return true;
        if(find(i,j-1,step+1)) return true;
        solution[i][j]=0;
        return false;

    }
    public int uniquePathsIII(int[][] grid) {
        this.grid=grid;
        n=grid.length;
        m=grid[0].length;
        solution=new int[n][m];
        ob=0;
        s1=0;
        s2=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==-1){
                    ob++;
                }
                if(grid[i][j]==1){
                    s1=i;
                    s2=j;
                }
            }
        }
        total=n*m-ob;
        find(s1,s2,1);
        return count;

    }
}