package Account;
import java.time.LocalDate;
import java.util.UUID;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class acc {

	
		private String accNo;
		private accType acType;
		private double amount;
		private LocalDate dateOfOpening;
		private static acc account;
		static
		{
			ac=new acc();
			

	}
public static acc createacc(accType acType,double amount)
{
	ac.setaccNo(UUID.random UUID().toString());
	ac.setacType(accType);
	ac.setamount(amount);
}
}
