public class LargestInArray{  
public static int getLargest(int[] a, int nt){  
int t;  
for (int i = 0; i < nt; i++)   
        {  
            for (int j = i + 1; j < nt; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    t = a[i];  
                    a[i] = a[j];  
                    a[j] = t;  
                }  
            }  
        }  
       return a[nt-1];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};
 System.out.println("Largest: "+getLargest(a,6));  
}} 
   
      