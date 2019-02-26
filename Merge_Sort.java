
public class Merge_Sort implements SortingTechnique{

	public  void sort(int a[]) {
     mergeSort(a,0,a.length-1);
     printArray(a);
	}
	static void printArray(int a[]){
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
	
  static void mergeSort(int a[],int l,int r){
	 
	  if(r>l){
		  int m=(l+r)/2;
		  mergeSort(a,l,m);
		  mergeSort(a,m+1,r);	  
	     merger(a,l,m,r);
	  }
  }
  static void  merger(int a[],int l,int m, int r){
     int n1=m-l+1;
     int n2=r-m;
     
     int[] L=new int[n1];
     int[] R=new int[n2];
      
      
      for(int i=0; i<n1;i++)
    	  L[i]=a[i+l];
      for(int j=0;j<n2;j++)
    	  R[j]=a[m+1+j];
    	  int i=0,j=0;
    	  int k=l;
    	  while(i<n1 && j<n2)
    	  {
    		  if(L[i]<=R[j])
    		  { a[k]=L[i];i++;k++;}
    		  else 
    		  {a[k]=R[j];j++;k++;}
    	  }
    	  
    	  while(i<n1)
    	  {  a[k]=L[i];i++;k++;}
    	  
    	  while(j<n2)
    	  {
    		  a[k]=R[j];
    		  j++;
    		  k++;
    	  }
    	  
  }
}
