package HasARelationship;

public class Owner {

	private String nameSurname;
	private String eMailAddress;
	
	
	public String getNameSurname() {
		return nameSurname;
	}


	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}


	public String geteMailAddress() {
		return eMailAddress;
	}


	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}


	public Owner(String nameSurname, String eMailAddress) {
		super();
		this.nameSurname = nameSurname;
		this.eMailAddress = eMailAddress;
	}


	@Override
	public String toString() {
		return "Owner [nameSurname=" + nameSurname + ", eMailAddress=" + eMailAddress + "]";
	}
	
	
}
