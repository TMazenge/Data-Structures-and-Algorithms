import java.util.Arrays;

public class DifferentHashCode {


 	public static void main(String[] args){

		String[] codes = {"ab", "cd", "ef", "gh", "ij", "kl", "mn", "op", "qr", "st", "uv", "wx", "yz"};
		int N = 78;
		String[] sample = new String[N];
		int k=0;

		while (k < N){

			for(int i=0; i<codes.length; i++){
				for(int j=i+1; j<codes.length; j++){
				//System.out.println(i + " " + j + " " + k);
					sample[k] = "" + codes[i] + codes[j];
					k++;
				}
			}
			k++;
		}
		

		System.out.println(Arrays.toString(sample));

		int checkCode = sample[0].hashCode();
		System.out.println(checkCode);
		for(int i=1; i<sample.length; i++){
			if (checkCode != sample[i].hashCode()){
				System.out.println("Found different hashCode: " + sample[i].hashCode() );
			}
		}
		System.out.println();
		System.out.println(sample[0].hashCode());
		System.out.println(sample[sample.length - 1].hashCode());
		
	}

}