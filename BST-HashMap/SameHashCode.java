import java.util.Arrays;

 public class SameHashCode{


 	public static String[]  getStringCodes(int N, String[] codes){
		String[] sample = new String[N*N];
		int k=0;
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.println(i + " " + j + " " + k);
				sample[k] = "" + codes[i] + codes[j];
				k++;
			}
		}
		return sample;
 	}

 	public static void main(String[] args){


		int N = (int)(Math.pow(2, 4));
		String[] codes = new String[N];
		codes[0] = "Aa";
		codes[1] = "BB";

		String[] sample = getStringCodes(2, codes);
		
		System.out.println(Arrays.toString(sample));

		for(int i=0; i<3; i++){
			codes[i] = sample[i];
		}
		System.out.println(Arrays.toString(codes));


		sample = getStringCodes(3, codes);
		System.out.println(Arrays.toString(sample));
		for(int i=0; i<4; i++){
			codes[i] = sample[i];
		}
		System.out.println(Arrays.toString(codes));
		



		for(int i=0; i<15; i++)
			System.out.println(sample[i]);
	
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