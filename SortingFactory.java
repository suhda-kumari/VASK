
public class SortingFactory {
   SortingTechnique getsortingTechnique(String sortingTechnique){
	if(sortingTechnique=="Merge")
		  return new Merge_Sort();
	   else
		   return new Quick_Sort();
   }
}
