package Users;

import java.util.Scanner;

public class Client extends User implements IUser{
    protected Boolean ServiceType;
    protected int RealEstateId;

    public void setRealEstateId(int realEstateId) {
        RealEstateId = realEstateId;
    }

    public void setServiceType(Boolean serviceType) {
        ServiceType = serviceType;
    }

    public int getRealEstateId() {
        return RealEstateId;
    }

    public Boolean getServiceType() {
        return ServiceType;
    }


    public Client(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter service type (1=buy, 0=sell) ");
        setServiceType(Boolean.getBoolean(scanner.nextLine()));
        System.out.println("Enter real estate id");
        setRealEstateId(Integer.getInteger(scanner.nextLine()));
    }

    public Client(String fName, String pNum, String cName, boolean serviceType, int realStateId){
        super(fName, pNum, cName);
        setServiceType(serviceType);
        setRealEstateId(realStateId);
    }

    @Override
    public void ShowUserInfo() {

    }
}
