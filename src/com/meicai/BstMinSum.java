package com.meicai;

import java.util.ArrayList;
import java.util.List;

public class BstMinSum
{
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int minTreePath(TNode t)
  {
    // INSERT YOUR CODE HERE
    List<Integer> results = new ArrayList<Integer>();
    
    search(t,0,results);
    
    int min = results.get(0); 
    for(int result:results)
    {
        if(result<min)
            min = result;
    }
    
    return min;
    
    
  }
  
  public static void search(TNode pos, int perValue, List<Integer> results)
  {
      if(pos.left==null && pos.right==null)// lest
      {
          results.add(perValue+pos.value);
      }
      else
      {
          if(pos.left!=null)
          {
              search(pos.left,perValue+pos.value,results);
          }
          if(pos.right!=null)
          {
              search(pos.right,perValue+pos.value,results);
          }
      }
  }
  // METHOD SIGNATURE ENDS
}

class TNode
{
 public int value;
 public TNode left;
 public TNode right;
}