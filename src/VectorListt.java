import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorListt {

	public static void main(String[] args) {
	//	Vector vc=new Vector();
		List<Integer>myvec=new Vector<Integer>();
		
		myvec.add(22);
		myvec.add(30);
		myvec.add(45);
		
		System.out.println(myvec);
		Collections.sort(myvec);
		System.out.println(myvec);
	}
}
