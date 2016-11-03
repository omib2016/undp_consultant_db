package com.undp.entity;

/**
 * Class representing the user entry having all sign up information.
 */
public class UserEntry
{

    //User logon
    private String username;
    private String password;
    //Personal details
    private String firstName;
    private String middleName;
    private String lastName;
    private BusinessType businessType;
    private String addressLine1;
    private String addressLine2;
    //User contact details
    private String emailId;
    private String mobileNumber;
    private String landlineNumber;
    private String faxNumber;
    private String city;
    private String state;
    private UserCountry country;
    //Pro details
    private String companyName;
    private Category category;
    private SubCategory subCategory;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(UserCountry country) {
        this.country = country;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public UserEntry()
    {

    }

    private UserEntry(UserEntryBuilder userEntryBuilder)
    {
        this.username = userEntryBuilder.userName;
        this.password = userEntryBuilder.password;
        this.firstName = userEntryBuilder.firstName;
        this.middleName = userEntryBuilder.middleName;
        this.lastName = userEntryBuilder.lastName;
        this.businessType = userEntryBuilder.businessType;
        this.addressLine1 = userEntryBuilder.addressLine1;
        this.addressLine2 = userEntryBuilder.addressLine2;
        this.emailId = userEntryBuilder.emailId;
        this.mobileNumber = userEntryBuilder.mobileNumber;
        this.landlineNumber = userEntryBuilder.landlineNumber;
        this.faxNumber = userEntryBuilder.faxNumber;
        this.city = userEntryBuilder.city;
        this.state = userEntryBuilder.state;
        this.country = userEntryBuilder.country;
        this.companyName = userEntryBuilder.companyName;
        this.category = userEntryBuilder.category;
        this.subCategory = userEntryBuilder.subCategory;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public UserCountry getCountry() {
        return country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Category getCategory() {
        return category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public static class UserEntryBuilder
    {
        private String userName;
        private String password;
        //Personal details
        private String userId;
        private String firstName;
        private String middleName;
        private String lastName;
        private BusinessType businessType;
        private String addressLine1;
        private String addressLine2;
        //User contact details
        private String emailId;
        private String mobileNumber;
        private String landlineNumber;
        private String faxNumber;
        private String city;
        private String state;
        private UserCountry country;
        //Pro details
        private String companyName;
        private Category category;
        private SubCategory subCategory;

        public UserEntryBuilder buildWithUserName(String userName)
        {
            this.userName = userName;
            return this;
        }

        public UserEntryBuilder buildWithPassword(String password)
        {
            this.password = password;
            return this;
        }

        public UserEntryBuilder buildWithUserId(String userId)
        {
            this.userId = userId;
            return this;
        }

        public UserEntryBuilder buildWithFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public UserEntryBuilder buildWithMiddleName(String middleName)
        {
            this.middleName = middleName;
            return this;
        }

        public UserEntryBuilder buildWithLastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public UserEntryBuilder buildWithBusinessType(BusinessType businessType)
        {
            this.businessType = businessType;
            return this;
        }

        public UserEntryBuilder buildWithAddressLine1(String addressLine1)
        {
            this.addressLine1 = addressLine1;
            return this;
        }

        public UserEntryBuilder buildWithAddressLine2(String addressLine2)
        {
            this.addressLine2 = addressLine2;
            return this;
        }

        public UserEntryBuilder buildWithEmailId(String emailId)
        {
            this.emailId = emailId;
            return this;
        }

        public UserEntryBuilder buildWithMobileNumber(String mobileNumber)
        {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UserEntryBuilder buildWithLandlineNumber(String landlineNumber)
        {
            this.landlineNumber = landlineNumber;
            return this;
        }

        public UserEntryBuilder buildWithFaxNumber(String faxNumber)
        {
            this.faxNumber = faxNumber;
            return this;
        }

        public UserEntryBuilder buildWithState(String state)
        {
            this.state = state;
            return this;
        }

        public UserEntryBuilder buildWithUserCountry(UserCountry userCountry)
        {
            this.country = userCountry;
            return this;
        }

        public UserEntryBuilder buildWithCompanyName(String companyName)
        {
            this.companyName = companyName;
            return this;
        }

        public UserEntryBuilder buildWithCategoryName(Category category)
        {
            this.category = category;
            return this;
        }

        public UserEntryBuilder buildWithSubCategory(SubCategory subCategory)
        {
            this.subCategory = subCategory;
            return this;
        }

        public UserEntry build()
        {
            return new UserEntry(this);
        }

    }

    @Override
    public String toString() {
        return "UserEntry{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", businessType=" + businessType +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", landlineNumber='" + landlineNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country=" + country +
                ", companyName='" + companyName + '\'' +
                ", category=" + category +
                ", subCategory=" + subCategory +
                '}';
    }
}
