public class ArraySortingApplication {

	public static void main(String[] args) {
		String sortingtechnique="Merge";
      SortingFactory f=new SortingFactory();
     SortingTechnique s= f.getsortingTechnique(sortingtechnique);
     int a[]={80,20,40,50,90,70,10};
     s.sort(a);
	}

}
