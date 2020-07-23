package com.example.android.demoappforteamworks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
        private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ContactUsFragment Fragment= new ContactUsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment,Fragment);
        fragmentTransaction.commit();
        button1 =findViewById(R.id.contact_us);
        button1.setBackgroundColor(getResources().getColor(R.color.color_dark_grey));
        button2=findViewById(R.id.images);
        button3= findViewById(R.id.view_images);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoContactUsFragment();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoGalleryFragment();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoViewGalleryFragment();
            }
        });
    }

    private void gotoContactUsFragment() {

        button1.setBackgroundColor(getResources().getColor(R.color.color_dark_grey));
        button2.setBackgroundColor(getResources().getColor(R.color.color_grey));
        button3.setBackgroundColor(getResources().getColor(R.color.color_grey));

        ContactUsFragment Fragment= new ContactUsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,Fragment);
        fragmentTransaction.commit();

    }

    private void gotoGalleryFragment() {

        button2.setBackgroundColor(getResources().getColor(R.color.color_dark_grey));
        button1.setBackgroundColor(getResources().getColor(R.color.color_grey));
        button3.setBackgroundColor(getResources().getColor(R.color.color_grey));
        GalleryFragment galleryFragment= new GalleryFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,galleryFragment);
        fragmentTransaction.commit();

    }

    private void gotoViewGalleryFragment() {

        button3.setBackgroundColor(getResources().getColor(R.color.color_dark_grey));
        button1.setBackgroundColor(getResources().getColor(R.color.color_grey));
        button2.setBackgroundColor(getResources().getColor(R.color.color_grey));
        ListFragment listFragment= new ListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,listFragment);
        fragmentTransaction.commit();
    }
}
