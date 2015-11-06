import java.util.*;

public class Visit {
    
    public static int result =0;
    
    public int countPath(int[][] map, int n, int m) 
    {
        int manager_x=0,manager_y=0;
        int shop_x=0,shop_y=0;
        
        for(int i=0; i<map.length; i++)
            for(int j=0; j<map[0].length; j++)
            {
            	if(map[i][j]==1)
            	{
            		manager_x=i;manager_y=j;
        		}
        		if(map[i][j]==2)
                {
                    shop_x=i;shop_y=j;
                }
        	}
        
        int v = (manager_x>shop_x) ? -1 : 1;
        int h = (manager_y>shop_y) ? -1 : 1;
        
        doing(manager_x,manager_y,map);
        int r = Visit.result;
        
        return r;
        

    }
    private void doing(int x,int y,int[][]map)
    {
    	if(x<0 || y<0 || x>=map.length || y>=map[0].length)
    		return;
        if(map[x][y]==2)
        {
            Visit.result+=1;
            return;
        }
        if(map[x][y]==-1)
            {return;}
        else
        {
            doing(x+1,y,map);
            doing(x,y+1,map);
        }
    }
    
    public static void main(String[]asd)
    {
    	int[][]map = {{1,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,2}};
    	System.out.println(new Visit().countPath(map, 7, 5));
    }
}