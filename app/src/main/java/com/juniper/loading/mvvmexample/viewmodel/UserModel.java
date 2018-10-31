package com.juniper.loading.mvvmexample.viewmodel;

import android.databinding.BaseObservable;

import com.juniper.loading.mvvmexample.R;
import com.juniper.loading.mvvmexample.model.User;

/**
 * Created by koteswara on 10/30/18.
 */

public class UserModel extends BaseObservable{
    private String email;
    private String password;
    private String emaihintl;
    private String passwordhint;

    public UserModel(User user) {

        this.emaihintl=user.emaihintl;
        this.passwordhint=user.passwordhint;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
       notifyPropertyChanged(R.id.emailid);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.passid);
    }

    public String getEmaihintl() {
        return emaihintl;
    }

    public void setEmaihintl(String emaihintl) {
        this.emaihintl = emaihintl;
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint;
    }
}
