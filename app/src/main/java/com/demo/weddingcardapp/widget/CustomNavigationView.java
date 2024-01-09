package com.demo.weddingcardapp.widget;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.view.GravityCompat;


import com.demo.weddingcardapp.R;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.demo.weddingcardapp.MainActivity;


public class CustomNavigationView extends FrameLayout {
    LinearLayout imghome;
    LinearLayout imgrate;
    LinearLayout imgshareapp;
    private NavigationView mNavigationView;

    public CustomNavigationView(Context context) {
        this(context, null);
    }

    public CustomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.custom_navigation_view, this);
        this.mNavigationView = (NavigationView) findViewById(R.id.navigationView);
        this.imghome = (LinearLayout) findViewById(R.id.imghome);
        this.imgrate = (LinearLayout) findViewById(R.id.imgrate);
        this.imgshareapp = (LinearLayout) findViewById(R.id.imgshareapp);
        this.imghome.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                if (MainActivity.mDrawerLayout.isDrawerVisible(GravityCompat.START)) {
                    MainActivity.mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });
        this.imgrate.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                CustomNavigationView.this.rateApp();
                if (MainActivity.mDrawerLayout.isDrawerVisible(GravityCompat.START)) {
                    MainActivity.mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });
        this.imgshareapp.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                CustomNavigationView.this.shareApp(context);
                if (MainActivity.mDrawerLayout.isDrawerVisible(GravityCompat.START)) {
                    MainActivity.mDrawerLayout.closeDrawer(GravityCompat.START);
                }
            }
        });

        removeOverScroll();
    }

    public void setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.mNavigationView.setNavigationItemSelectedListener(onNavigationItemSelectedListener);
    }

    private void removeOverScroll() {
        NavigationMenuView findNavigationMenuView = findNavigationMenuView();
        if (findNavigationMenuView != null) {
            findNavigationMenuView.setOverScrollMode(2);
        }
    }

    private NavigationMenuView findNavigationMenuView() {
        for (int i = 0; i < this.mNavigationView.getChildCount(); i++) {
            if (this.mNavigationView.getChildAt(i) instanceof NavigationMenuView) {
                return (NavigationMenuView) this.mNavigationView.getChildAt(i);
            }
        }
        return null;
    }

    
    public void rateApp() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getContext().getPackageName()));
        intent.addFlags(1208483840);
        try {
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Context context = getContext();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + getContext().getPackageName())));
        }
    }

    
    public void shareApp(Context cc) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getContext().getString(R.string.app_name));
            intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\nhttps://play.google.com/store/apps/details?id=" + cc.getPackageName() + "\n\n");
            getContext().startActivity(Intent.createChooser(intent, "choose one"));
        } catch (Exception unused) {
        }
    }

    
    public void feedbackApp() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@virtueinfotech.com"});
        intent.putExtra("android.intent.extra.SUBJECT", getContext().getString(R.string.app_name));
        intent.putExtra("android.intent.extra.TEXT", "");
        try {
            getContext().startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
