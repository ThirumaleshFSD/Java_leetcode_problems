//this is leetcode 33
import java.util.*;
class LeetCode33{
  public static void main(String[] args){
    int a[]= {4,5,6,7,0,1,2}, target = 0 ;
    for(int i=0;i<a.length;i++){
      if(a[i]==target){
        return i;
      }
    }
  }
  return -1;
}
