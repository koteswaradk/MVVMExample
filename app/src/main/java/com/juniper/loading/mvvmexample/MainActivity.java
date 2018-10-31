package com.juniper.loading.mvvmexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.juniper.loading.mvvmexample.commands.UserLogin;
import com.juniper.loading.mvvmexample.databinding.ActivityMainBinding;
import com.juniper.loading.mvvmexample.model.User;
import com.juniper.loading.mvvmexample.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

  private   ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserModel userModel=new UserModel(new User("email","password"));
        activityMainBinding.setLogin(userModel);
        activityMainBinding.setUserloginevent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,""+activityMainBinding.getLogin().getEmail(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
