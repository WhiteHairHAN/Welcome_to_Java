
public class GetMin {

	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,12,4,1,19};
		int min = s[0];
		
		for(int i =0 ; i<s.length; i++)
		//length 용도가 뭘까??
		{
			if(s[i]<min)
			{
				min = s[i];
			}
		}
		
		System.out.println("최솟값은"+ min+"입니다");
		
	}

}
