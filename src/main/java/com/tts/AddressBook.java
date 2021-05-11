package com.tts;

public class AddressBook {

    private String FIRSTNAME;
    private String LASTNAME;
    private String PHONENUMBER;
    private String EMAILADDRESS;

    public AddressBook(String FIRSTNAME, String LASTNAME, String PHONENUMBER, String EMAILADDRESS) {
        super();
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.PHONENUMBER = PHONENUMBER;
        this.EMAILADDRESS = EMAILADDRESS;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public void setPHONENUMBER(String PHONENUMBER) {
        this.PHONENUMBER = PHONENUMBER;
    }

    public String getEMAILADDRESS() {
        return EMAILADDRESS;
    }

    public void setEMAILADDRESS(String EMAILADDRESS) {
        this.EMAILADDRESS = EMAILADDRESS;
    }

    @Override
    public String toString(){
        return "Name=" + FIRSTNAME +
                ", Last Name=" + LASTNAME +
                ", Phone No=" + PHONENUMBER +
                ", Email= " + EMAILADDRESS;
    }
}
