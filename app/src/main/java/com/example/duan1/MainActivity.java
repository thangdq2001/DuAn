package com.example.duan1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.duan1.FragemntMain.HomeFragMent;
import com.example.duan1.FragemntMain.TravrelFragment;

import com.example.duan1.FragemntMain.likeFragment.LikeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    BottomNavigationView bottomNavigationView;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnAdd = findViewById(R.id.btnAddData);
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                testDiaLog diaLog = new testDiaLog();
//                diaLog.show(getSupportFragmentManager(),"testDiaLog");
//            }
//        });
//    customBottom();
        customBottom();
      getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer,new HomeFragMent()).commit();
        
    }

    // custom bottom navigation
    public void customBottom() {

        bottomNavigationView = findViewById(R.id.bottomMain);
        final Menu menu = bottomNavigationView.getMenu();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuHome:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, new HomeFragMent()).commit();
                        item = menu.findItem(R.id.menuHome).setChecked(true);
                        break;
                    case R.id.menuLike:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, new LikeFragment()).commit();
                        item = menu.findItem(R.id.menuLike).setChecked(true);
                        break;
                    case R.id.menuTravel:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, new TravrelFragment()).commit();
                        item = menu.findItem(R.id.menuTravel).setChecked(true);
                        break;
                }
                return false;
            }
        });
    }

}   