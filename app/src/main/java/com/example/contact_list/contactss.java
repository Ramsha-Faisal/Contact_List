package com.example.contact_list;

public class contactss {
    private String Name;
    private String phone;
    private int photo;

    public contactss(String name, String number, int pic)
    {
        Name=name;
        phone=number;
        photo=pic;
    }


    public String getNmae()
    {
        return Name;
    }

    public String getphone()
    {
        return phone;
    }

    public int getPhoto()
    {
        return photo;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setPhnno(String number) {
        phone = number;
    }
    public void setPhoto(int pic )
    {
        photo=pic;
    }
}
