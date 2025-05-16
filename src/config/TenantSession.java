package config;

public class TenantSession {

    private static TenantSession instance;

    private String tenantId;
    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String gender;
    private String birthdate;
    private String idNumber;
    private String propertyId;
    private String moveInDate;
    private String moveOutDate;
    private String status;
    
    private String pname;
    private String ptype;
    private String pcompound;
    private String pcapacity;
    private String pprice;

    // Empty constructor
    public TenantSession() {}

    // Get instance (singleton)
    public static synchronized TenantSession getInstance() {
        if (instance == null) {
            instance = new TenantSession();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    // Getters and Setters
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }
    
    public String getMoveOutDate() {
        return moveOutDate;
    }
    
    public void setMoveOutDate(String moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getPname() {
    return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPcompound() {
        return pcompound;
    }

    public void setPcompound(String pcompound) {
        this.pcompound = pcompound;
    }

    public String getPcapacity() {
        return pcapacity;
    }

    public void setPcapacity(String pcapacity) {
        this.pcapacity = pcapacity;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

}
