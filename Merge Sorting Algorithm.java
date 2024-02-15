        Merge Sorting Algorithm:
write a program to implement merge sorting algorithm

Example 1:
Input: 
7
15 26 56 6 65 74 21
Output:
6 15 21 26 56 65 74

CODE:

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n,a[]=new int[100];
    n=sc.nextInt();
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    mergesort(a,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }

    static void mergesort(int a[],int start,int end){
      if(start<end){
        int mid=(start+end)/2;
        mergesort(a,start,mid);
        mergesort(a,mid+1,end);
        merger(a,start,mid,end);
      }
    }

    static void merger(int a[],int start,int mid,int end){
      int ls,rs,i,j,k;
      ls=mid-start+1;
      rs=end-mid;
      int la[]=new int[ls];
      int ra[]=new int[rs];
      for(i=0;i<ls;i++)
        la[i]=a[i+start];
      for(i=0;i<rs;i++)
        ra[i]=a[i+mid+1];
      i=0;j=0;k=start;
      while(i<ls && j<rs){
        if(la[i]<=ra[j]){
          a[k++]=la[i++];
        }else
          a[k++]=ra[j++];
      }
      while(i<ls)
        a[k++]=la[i++];
      while(j<rs)
        a[k++]=ra[j++];
    }
  }
