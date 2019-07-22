package com.example.socialconnect;

public class SocialConnectItemViewModel {

    private String Id;
    private String Name;
    private String Email_Id;
    private String contactType;
    private String AvailabilityStatus;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public String getContactType() {
        return contactType;
    }

    public String getAvailabilityStatus() {
        return AvailabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        AvailabilityStatus = availabilityStatus;
    }

    public void setName(String ram) {
        Name = ram;
    }

    public void setContactType(String s) {
        Id = s;
    }
}
