 Insertion Soring Algorithm
----------------------------------------------------
        
write a java program to sort an array using insertion sorting technique
Example 1:
Input: 
5
5 2 9 1 5
Output:
1 2 5 5 9

CODE:

import java.util.Scanner;
public class Main{
public static void insertionsort(int arr[],int n){
  int i,j,key=0;
  for(j=1;j<n;j++){
    key=arr[j];
    i=j-1;
    while(i>=0 && arr[i]>key){
      arr[i+1]=arr[i];
      i=i-1;
    }
    arr[i+1]=key;
  }
  for(i=0;i<n;i++){
    System.out.print(arr[i]+" ");
  }
}
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int [n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    insertionsort(arr,arr.length);
    }
 }