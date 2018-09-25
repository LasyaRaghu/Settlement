import com.operations.TransactionOperations;
import com.operations.impl.TransactionOperationsImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Citi";
		String password="Citi123";
		TransactionOperations top = new TransactionOperationsImpl();
		
		Boolean result=top.Login(name, password);
		if(!result)
			System.out.println("enter correct credentials");
	}

}
