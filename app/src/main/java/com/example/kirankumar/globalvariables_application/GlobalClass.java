package com.example.kirankumar.globalvariables_application;

/**
 * Created by kirankumar on 9/1/17.
 */

import android.app.Application;

public class GlobalClass extends Application{

    private String name;
    private String email;


    public String getName() {

        return name;
    }

    public void setName(String aName) {

        name = aName;

    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String aEmail) {

        email = aEmail;
    }

}
