
import java.util.*;

/*class creditCardInfo implements Comparable
{
	
	private int cnum;
	private String uname;
	private int expdate;
	
	public creditCardInfo(int cnum, String uname, int expdate) {
		super();
		this.cnum = cnum;
		this.uname = uname;
		this.expdate = expdate;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getExpdate() {
		return expdate;
	}

	public void setExpdate(int expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "creditCardInfo [cnum=" + cnum + ", uname=" + uname + ", expdate=" + expdate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnum, expdate, uname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		creditCardInfo other = (creditCardInfo) obj;
		return cnum == other.cnum && expdate == other.expdate && Objects.equals(uname, other.uname);
	}

	//public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return this.getExpdate().compareTo(((creditCardInfo) o).getExpdate());
	}
	
	
//}

public class CreditCardApp {

	public static void main(String[] args) {
		
		
		Map<Integer,creditCardInfo> mymap = new LinkedHashMap<Integer,creditCardInfo>();
		
		creditCardInfo cinf= new creditCardInfo(3456,"shwetha",2024);
		creditCardInfo cinf1= new creditCardInfo(8976,"priyaa",2000);
		creditCardInfo cinf2= new creditCardInfo(2426,"shwetha",2014);
		creditCardInfo cinf3= new creditCardInfo(4678,"shwetha",2028);
		
		
		
	//	List<Integer> list = new ArrayList<Integer>( mymap.values() );
        
		
		mymap.put(33,cinf1);
		mymap.put(44,cinf);
		mymap.put(11,cinf3);
		mymap.put(22,cinf2);
		
		
	//	Collections.sort(mymap);
		
		System.out.println(mymap);
		
		
		
	}
}
*/