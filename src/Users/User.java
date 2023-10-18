package Users;

import java.util.Scanner;

abstract public class User {

    protected String CompanyName;
    protected String FullName;
    protected String PhoneNumber;

    public String getCompanyName() {
        return CompanyName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public User(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full Name (default = 'name') ");
        setFullName(scanner.nextLine());
        System.out.println("Enter phone number");
        setPhoneNumber(scanner.nextLine());
        System.out.println("Enter company name");
        setCompanyName(scanner.nextLine());
    }

    public User(String fName, String pNum, String cName){
        setFullName(fName);
        setPhoneNumber(pNum);
        setCompanyName(cName);
    }

}
