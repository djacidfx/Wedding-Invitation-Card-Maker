package com.demo.weddingcardapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import com.demo.weddingcardapp.interfaces.PositionClickListener;
import com.demo.weddingcardapp.widget.CustomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.demo.weddingcardapp.noti.NotificationReceivcer;
import com.ramotion.cardslider.CardSliderLayoutManager;
import com.ramotion.cardslider.CardSnapHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MainActivity extends AppCompatActivity implements PositionClickListener {
    public static DrawerLayout mDrawerLayout;
    public static int position1;
    RecycleAdapter adapter;
    AlertDialog.Builder builder;
    CustomNavigationView mCustomNavigationView;
    private ActionBarDrawerToggle mDrawerToggle;
    Toolbar mToolbar;
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        startAlarmBroadcastReceiver(this);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.mToolbar = toolbar;
        setSupportActionBar(toolbar);
        this.mCustomNavigationView = (CustomNavigationView) findViewById(R.id.customNavigationView);
        setupNavigationView();
        setupDrawerLayout();
        initToolbar(R.color.color_bg1);
        this.recyclerView = (RecyclerView) findViewById(R.id.recycleView1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf((int) R.drawable.w_0_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_1_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_2_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_3_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_4_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_5_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_6_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_7_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_8_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_9_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_10_d_0));
        arrayList.add(Integer.valueOf((int) R.drawable.w_11_d_0));
        this.recyclerView.setLayoutManager(new CardSliderLayoutManager(200, 750, 14.0f));
        RecycleAdapter recycleAdapter = new RecycleAdapter(arrayList, this, this);
        this.adapter = recycleAdapter;
        this.recyclerView.setAdapter(recycleAdapter);
        new CardSnapHelper().attachToRecyclerView(this.recyclerView);
    }

    private void requestMultiplePermissions() {


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){

            MainActivity.this.opeNextActivity();
        }else{
            Dexter.withActivity(this).withPermissions("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE").withListener(new MultiplePermissionsListener() { 
                @Override 
                public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                    if (multiplePermissionsReport.areAllPermissionsGranted()) {
                        MainActivity.this.opeNextActivity();
                    }
                    if (multiplePermissionsReport.isAnyPermissionPermanentlyDenied()) {
                        Toast.makeText(MainActivity.this, "Please allow app to continue", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", MainActivity.this.getPackageName(), null));
                        MainActivity.this.startActivity(intent);
                    }
                }

                @Override 
                public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                    Toast.makeText(MainActivity.this, "Please allow app to continue", Toast.LENGTH_SHORT).show();
                    permissionToken.continuePermissionRequest();
                }
            }).withErrorListener(new PermissionRequestErrorListener() { 
                @Override 
                public void onError(DexterError dexterError) {
                }
            }).onSameThread().check();
        }




    }

    public void opeNextActivity() {
        Intent intent = new Intent(this, FormActivity.class);
        intent.putExtra("position", position1);
        startActivity(intent);
    }

    public static void startAlarmBroadcastReceiver(Context context) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, NotificationReceivcer.class), PendingIntent.FLAG_IMMUTABLE);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.cancel(broadcast);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 23);
        calendar.set(12, 0);
        calendar.set(13, 0);
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), broadcast);
    }

    public void exitdialog() {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i != -3) {
                    if (i != -1) {
                        return;
                    }
                    dialogInterface.dismiss();
                    MainActivity.this.finish();
                    System.exit(0);
                    return;
                }
                MainActivity mainActivity = MainActivity.this;
                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + MainActivity.this.getPackageName())));
                dialogInterface.dismiss();
            }
        };
        new AlertDialog.Builder(this).setMessage("Are you sure you want to exit?").setPositiveButton("Exit", onClickListener).setTitle("").setNeutralButton("Rate Us", onClickListener).show();
    }

    @Override 
    public void itemClicked(int i) {
        requestMultiplePermissions();
    }

    
    public static class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
        Context context;
        public final PositionClickListener listener;
        ArrayList<Integer> recycleData;

        public RecycleAdapter(ArrayList<Integer> arrayList, Context context, PositionClickListener positionClickListener) {
            this.recycleData = arrayList;
            this.context = context;
            this.listener = positionClickListener;
        }

        @Override 
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycleplaceholder, viewGroup, false));
        }

        @Override 
        public void onBindViewHolder(ViewHolder viewHolder, final int i) {
            Glide.with(this.context).load(this.recycleData.get(i)).into(viewHolder.recycleImage);
            viewHolder.recycleImage.setOnClickListener(new View.OnClickListener() { 
                @Override 
                public void onClick(View view) {
                    MainActivity.position1 = i;
                    RecycleAdapter.this.listener.itemClicked(i);
                }
            });
        }

        @Override 
        public int getItemCount() {
            return this.recycleData.size();
        }

        
        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView recycleImage;

            public ViewHolder(View view) {
                super(view);
                this.recycleImage = (ImageView) view.findViewById(R.id.recycleImage);
            }
        }
    }

    private void initToolbar(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(ContextCompat.getColor(this, i));
        }
    }

    
    @Override 
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.mDrawerToggle.syncState();
    }

    @Override 
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mDrawerToggle.onConfigurationChanged(configuration);
    }

    @Override 
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.mDrawerToggle.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override 
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerVisible(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            exitdialog();
        }
    }

    private void setupNavigationView() {
        this.mCustomNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { 
            @Override 
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                MainActivity.this.selectDrawerItem(menuItem);
                return false;
            }
        });
    }

    private void setupDrawerLayout() {
        ActionBarDrawerToggle actionBarDrawerToggle = setupDrawerToggle();
        this.mDrawerToggle = actionBarDrawerToggle;
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
    }

    public void selectDrawerItem(MenuItem menuItem) {
        Toast.makeText(this, menuItem.getTitle().toString(), Toast.LENGTH_SHORT).show();
        mDrawerLayout.closeDrawers();
    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, mDrawerLayout, this.mToolbar, R.string.open, R.string.close);
    }
}
