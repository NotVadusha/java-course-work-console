package Users;

import java.util.Scanner;

public class Realtor extends User implements IUser{
    protected String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Realtor(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter realtors address (default = 'Kolotushkyna, 15') ");
        Address = scanner.nextLine();
        if (Address.isEmpty()) Address = "Kolotushkyna, 15";
    }

    public Realtor(String fName, String pNum, String cName, String address){
        super(fName, pNum, cName);
        setAddress(address);
    }

    @Override
    public void ShowUserInfo() {

    }
}
