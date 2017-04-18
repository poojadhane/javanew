package ExceptionHandling;

public class Account 
{
	private String accId; //must start with ACC and accId length must be 6
	private String acctype;


	public Account(String accId, String acctype) throws AccountException {
		super();
		if(accId.startsWith("ACC")&& accId.length()==6)
		this.accId = accId;
		else
			throw new AccountException("invalid account id ");
		this.acctype = acctype;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accid) throws AccountException 
	{
		if(accid.startsWith("ACC")&& accid.length()==6)
		this.accId = accid;
		else
			throw new AccountException("invalid account id ");
			
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", acctype=" + acctype + "]";
	}

}
