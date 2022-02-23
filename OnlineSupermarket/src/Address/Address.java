
package Address;

public class Address {
    private String city;
    private String town;
    private String neighborhood;
    private String street;
    private String apartment_no;
    private String flat_no;

    public Address() {
    }

    public Address(String city, String town, String neighborhood, String street, String apartment_no, String flat_no) {
        this.city = city;
        this.town = town;
        this.neighborhood = neighborhood;
        this.street = street;
        this.apartment_no = apartment_no;
        this.flat_no = flat_no;
    }

    public String getCity() {
        return city;
    }

    public String getTown() {
        return town;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public String getApartment_no() {
        return apartment_no;
    }

    public String getFlat_no() {
        return flat_no;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setApartment_no(String apartment_no) {
        this.apartment_no = apartment_no;
    }

    public void setFlat_no(String flat_no) {
        this.flat_no = flat_no;
    }

    @Override
    public String toString() {
        return city + " " + town + " " + neighborhood + " " + street + " " + apartment_no + " " + flat_no + "\n";
    }

    
}
