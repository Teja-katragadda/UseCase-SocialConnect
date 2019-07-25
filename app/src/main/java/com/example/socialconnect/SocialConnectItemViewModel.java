package com.example.socialconnect;

public class SocialConnectItemViewModel {

    private int Id;
    private String Name;
    private String Email_Id;
    private int contactType;
    private String AvailabilityStatus;
    private String ContactName;
    private String viberId;
    private int availabilityStatusResId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail_Id() {
        return Email_Id;
    }

    public void setEmail_Id(String email_Id) {
        Email_Id = email_Id;
    }

    public int getContactType() {
        return contactType;
    }

    public void setContactType(int contactType) {
        this.contactType = contactType;
    }

    public String getAvailabilityStatus() {
        return AvailabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        AvailabilityStatus = availabilityStatus;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getViberId() {
        return viberId;
    }

    public void setViberId(String viberId) {
        this.viberId = viberId;
    }


    public int getAvailabilityStatusResId() {
        return availabilityStatusResId;
    }

    public void setAvailabilityStatusResId(int availabilityStatusResId) {
        this.availabilityStatusResId = availabilityStatusResId;
    }
}



