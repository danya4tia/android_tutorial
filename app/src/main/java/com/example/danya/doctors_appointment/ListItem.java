package com.example.danya.doctors_appointment;

import android.media.Image;

public class ListItem {
    private String name;
    private Image pic;

    public ListItem(String name, Image pic) {
        this.name = name;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public Image getPic() {
        return pic;
    }
}
