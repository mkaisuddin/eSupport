import com.mkyong.customer.util.PasswordHash;


public class test {
	public static void main(String[] args) {
		String st1 = "P@55worder";
		//MyCrypto.encrypt(st1);
		
		//System.err.println(PasswordHash.encrypt(st1));
		System.out.println(PasswordHash.decrypt("UEA1NXdvcmRlcg=="));
	}
}
