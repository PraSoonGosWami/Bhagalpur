package com.example.asus.bhagalpur;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.bhagalpur.Fragments.AboutFragment;
import com.example.asus.bhagalpur.Fragments.FoodFragment;
import com.example.asus.bhagalpur.Fragments.HotelsFragment;
import com.example.asus.bhagalpur.Fragments.OverviewFragment;
import com.example.asus.bhagalpur.Fragments.PlacesFragment;
import com.example.asus.bhagalpur.Fragments.TempleFragment;
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SNavigationDrawer sNavigationDrawer;
    Class fragmentClass;
    public static Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sNavigationDrawer = findViewById(R.id.navigationDrawer);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        List<MenuItem> menuItems = new ArrayList<>();
        //First parameter is the title of the menu item and then the second parameter is the image which will be the background of the menu item.

        menuItems.add(new MenuItem("An Overview",R.drawable.message_bg));
        menuItems.add(new MenuItem("Temples",R.drawable.temples_tab));
        menuItems.add(new MenuItem("Places",R.drawable.places_tab));
        menuItems.add(new MenuItem("Food",R.drawable.food_tabs));
        menuItems.add(new MenuItem("Hotels",R.drawable.hotels_tab));
        //menuItems.add(new MenuItem("Schools",R.drawable.school_tab));
        menuItems.add(new MenuItem("About",R.drawable.message_bg));
        //then add them to navigation drawer

        sNavigationDrawer.setMenuItemList(menuItems);
        fragmentClass =  OverviewFragment.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();
        }
        //Listener to handle the menu item click. It returns the position of the menu item clicked. Based on that you can switch between the fragments.

        sNavigationDrawer.setOnMenuItemClickListener(new SNavigationDrawer.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClicked(int position) {
                System.out.println("Position "+position);

                switch (position){
                    case 0:{
                        fragmentClass = OverviewFragment.class;
                        break;
                    }
                    case 1:{
                        fragmentClass = TempleFragment.class;
                        break;
                    }
                    case 2:{
                        fragmentClass = PlacesFragment.class;
                        break;
                    }
                    case 3:{
                        fragmentClass = FoodFragment.class;
                        break;
                    }
                    case 4:{
                        fragmentClass = HotelsFragment.class;
                        break;
                    }
                    case 5:{
                        fragmentClass = AboutFragment.class;
                        break;
                    }


                }

                //Listener for drawer events such as opening and closing.
                sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {

                    @Override
                    public void onDrawerOpened() {

                    }

                    @Override
                    public void onDrawerOpening(){

                    }

                    @Override
                    public void onDrawerClosing(){
                        System.out.println("Drawer closed");

                        try {
                            fragment = (Fragment) fragmentClass.newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (fragment != null) {
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();

                        }
                    }

                    @Override
                    public void onDrawerClosed() {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        System.out.println("State "+newState);
                    }
                });
            }
        });

    }
}
