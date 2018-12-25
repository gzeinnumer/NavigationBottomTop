package com.gzeinnumer.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class NavigationBottomTopExer extends AppCompatActivity {

    private FrameLayout frameLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListenerBottom
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction = null;
            int id = item.getItemId();
            if(id == R.id.textView_fragment){
                ExerTextViewFragment fragment = new ExerTextViewFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            } else if(id == R.id.editText_fragment){
                ExerEditTextFragment fragment = new ExerEditTextFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            } else  if(id == R.id.button_fragment){
                ExerButtonFragment fragment = new ExerButtonFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            }

            return false;
        }
    };

    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListenerTop
            = new BottomNavigationView.OnNavigationItemSelectedListener(){
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction fragmentTransaction = null;
            int id = menuItem.getItemId();
            if(id == R.id.listView_fragment){
                ExerListViewFragment fragment = new ExerListViewFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            } else if(id == R.id.recyclerView_fragment){
                ExerRecyclerViewFragment fragment = new ExerRecyclerViewFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            } else  if(id == R.id.cardView_fragment){
                ExerCardViewFragment fragment = new ExerCardViewFragment();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout,fragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_navigation_bottom_top);

        frameLayout = findViewById(R.id.frameLayout);

        BottomNavigationView navigationBottom = (BottomNavigationView) findViewById(R.id.navigationBottom);
        navigationBottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListenerBottom);

        BottomNavigationView navigationTop = (BottomNavigationView) findViewById(R.id.navigationTop);
        navigationTop.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListenerTop);

    }

}
