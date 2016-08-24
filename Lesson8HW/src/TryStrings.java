
public class TryStrings {

	public static void main(String[] args) {
		String text ="Hellin berlin gerlin vazelin in ";
		String[] text1=text.split(" ");
		int counter=0;
		for(int i = 0 ; i < text1.length;i++){
			if(text1[i].contains("in")){
				counter++;
			}
		}
		
		
		
		System.out.println(counter);

	}

}
