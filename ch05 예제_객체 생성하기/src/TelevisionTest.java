//예제_객체 생성하기
//예제_여러개의 객체 생성하기
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널은"+tv.channel);
		System.out.println("너의 텔레비전의 채널은"+yourTv.channel);
	}

}
