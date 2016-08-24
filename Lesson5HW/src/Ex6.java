
public class Ex6 {

	public static void main(String[] args) {
		int[] arr = {2,3,5,6,20};
		int[] arr2 = {2,3,5,6,22};
		boolean res = true;
		if(arr.length==arr2.length){
			for(int i=0,j=0;i<arr.length;i++,j++){
				boolean c = arr[i]==arr2[j];
			
			
					if(c==false){
						res = false;
					}
			}
			if(res==false){
				System.out.println("Massives are not equal.");
			}else{
				System.out.println("Massives are equal.");
			}
		
			System.out.println("Massives are with same length.");
		
		}else{
			System.out.println("Massives are not equal.");
			System.out.println("Massives are not with same lenght.");
			
		}
	}
}
