
public class Ex4 {

	public static void main(String[] args) {
		int[] arr = {6,27, -1, 5, 7, 7, 5, -1, 27, 6};
		boolean res = true;
		for(int i=0,j=1;i<arr.length;i++,j++){
			int b;
			b = arr.length-j;
			boolean c = arr[i]==arr[b];
			if(c==false){
				res = false;
			}
			
		}
		
		if(res==true){
			System.out.println("Masivat e ogledalen.");
		}else{
			System.out.println("Masivat ne e ogledalen.");
		}
			
		
		

	}

}
