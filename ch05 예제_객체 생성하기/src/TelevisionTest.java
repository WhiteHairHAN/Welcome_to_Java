//����_��ü �����ϱ�
//����_�������� ��ü �����ϱ�
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
		
		System.out.println("���� �ڷ������� ä����"+tv.channel);
		System.out.println("���� �ڷ������� ä����"+yourTv.channel);
	}

}
