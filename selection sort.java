       selection sort:

write a program to implement selection sorting algorithm

Example 1:
Input: 
5
25 15 10 5 0
Output:
0 5 10 15 25

CODE:

 import java.util.Scanner;
 public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   int n,i,j,a[]=new int[100],mini_index=0,temp=0;
    n=sc.nextInt();
    for(i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(i=0;i<n;i++){
        mini_index=i;
        for(j=i+1;j<n;j++){
          if(a[j]<a[mini_index])
              mini_index=j;
            }
        temp=a[mini_index];
        a[mini_index]=a[i];
        a[i]=temp;
      }
      for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
}
}
----------------------------------------------------
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
--------------------------------------------------------
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