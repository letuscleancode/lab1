import java.util.Date;
import java.util.List;

public class BankAccount {

    private String id;
    private String name;
    private String address;
    private List<Long> acct;
    private Date dateOfBirth;
    public String getAccDet(){return id+","+ name +","+ address +","+ acct.toString()+" ," + dateOfBirth.toString();}
    public void open(){}
    public void getDetails(){for(Long accountNumber : acct){System.out.println(accountNumber);}}
}
