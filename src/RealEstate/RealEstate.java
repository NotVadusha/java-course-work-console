package RealEstate;

import java.util.Scanner;

public class RealEstate implements IRealEstate{

    protected int Id;
    protected String Address;
    protected short Floor;
    protected String BuiltIn;
    protected double Area;

    public void setAddress(String address) {
        Address = address;
    }

    public void setArea(double area) {
        Area = area;
    }

    public void setBuiltIn(String builtIn) {
        BuiltIn = builtIn;
    }

    public void setFloor(short floor) {
        Floor = floor;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBuiltIn() {
        return BuiltIn;
    }

    public double getArea() {
        return Area;
    }

    public int getId() {
        return Id;
    }

    public short getFloor() {
        return Floor;
    }

    public String getAddress() {
        return Address;
    }

    public RealEstate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area");
        setArea(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter address");
        setAddress(scanner.nextLine());
        System.out.println("Enter floor");
        setFloor(Short.parseShort(scanner.nextLine()));
        System.out.println("Enter built date");
        setBuiltIn(scanner.nextLine());
    }

    public RealEstate(Double area, String address, Short floor, String builtInDate){
        setArea(area);
        setAddress(address);
        setFloor(floor);
        setBuiltIn(builtInDate);
    }

    public double CalcAverageCost(){
        return 0;
    };
    public RealEstate BiggestRooms(){
        return new RealEstate();
    };
}
