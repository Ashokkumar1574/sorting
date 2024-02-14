  Bubble sorting Algorithm

write a java program to sort an array using bubble sorting technique
Example 1:
Input: 
6
10 8 6 4 2 0
Output:
0 2 4 6 8 10

CODE:

import java.util.Scanner;
public class Main{
  public static void bubblesort(int arr[],int n){
    for(int k=0;k<n-1;k++){
      for(int i=0;i<n-k-1;i++){
        if(arr[i]>arr[i+1]){
          int temp;
          temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        } 
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    bubblesort(arr,arr.length);
  }