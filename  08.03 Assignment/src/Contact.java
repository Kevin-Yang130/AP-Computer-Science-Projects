/*
author: kevin Yang-Li
Version: 08/01/21
Purpose: Create contacts
 */

public class Contact {
    private String name;
    private String relation;
    private String pnumber;
    private String birthday;
    private String email;

    public Contact(String n, String r, String num, String b, String e) {
        name = n;
        relation = r;
        pnumber = num;
        birthday = b;
        email = e;

    }

    // getter methods
    public String getName() {
        return name; }

    public String getRelation() {
        return relation;
    }

    public String getPnumber() {
        return pnumber;
    }

    public String getBithday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    // setter methods

    public void setName(String n) {
        name = n;
    }

    public void setRelation(String t) {
        relation = t;
    }

    public void setPnumber(String p) {
        pnumber = p;
    }

    public void setBirthday(String b) {
        birthday = b;
    }

    public void setEmail(String e) {
        email = e;
    }
}
