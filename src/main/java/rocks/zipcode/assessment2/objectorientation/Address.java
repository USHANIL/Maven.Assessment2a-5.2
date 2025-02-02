package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    public Address() {
        this.addLine1 = "";
        this.addLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    private String addLine1;
    private String addLine2;
    private String city;
    private String state;
    private String zipcode;
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addLine1 = addressLine1;
        this.addLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.addLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addLine1 = addressLine1;

    }

    public String getAddressLine2(){ return this.addLine2;
}

    public void setAddressLine2(String addressLine2) {
        this.addLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String toString(){

        StringBuilder address = new StringBuilder();
        address.append(String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'}",getAddressLine1(),getAddressLine2(),getCity(),getState(),getZipcode()));
        return address.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this.toString().equals(o.toString()))
            return true;
        else return false;
    }
}
