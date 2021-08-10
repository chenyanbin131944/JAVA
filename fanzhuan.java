

public class fanzhuan {
  public static void main(String[] args) {
    int [] arrayA={1,2,6,4,56};
  
    for(int i=0;i<arrayA.length;i++){

      System.out.println(arrayA[i]);


    }
System.out.println("==========");
for(int min=0,max=arrayA.length-1;min<max;min++,max--){
int temp=arrayA[min];
arrayA[min]=arrayA[max];
arrayA[max]=temp;
System.out.println("==========");

for(int i=0;i<arrayA.length;i++){

  System.out.println(arrayA[i]);


}



}








  }
  
}
