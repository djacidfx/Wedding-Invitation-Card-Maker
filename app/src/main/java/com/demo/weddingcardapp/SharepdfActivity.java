package com.demo.weddingcardapp;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;


import java.io.File;


public class SharepdfActivity extends AppCompatActivity {
    ImageView back;
    Button btnhome;
    ImageView imgpdf1;
    ImageView layout_toolbar;
    ImageView sharepdf;
    SharedPreferences store;
    File targetDirector;



    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sharepdf);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        this.btnhome = (Button) findViewById(R.id.btnhome);
        this.imgpdf1 = (ImageView) findViewById(R.id.imgpdf1);
        this.store = SharedPreferences.getInstance(this, "weddingcard");
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        initToolbar(R.color.color_groomform, R.drawable.bluebar);
        File file = new File((Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + "/" + getString(R.string.app_name) + "/") + PreviewActivity.saved_filenm + ".pdf");
        this.targetDirector = file;
        Uri.fromFile(file);
        this.btnhome.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Intent intent = new Intent(SharepdfActivity.this, MainActivity.class);
                intent.addFlags(335577088);
                SharepdfActivity.this.startActivity(intent);
            }
        });
        this.imgpdf1.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                SharepdfActivity sharepdfActivity = SharepdfActivity.this;
                Uri uriForFile = FileProvider.getUriForFile(sharepdfActivity, sharepdfActivity.getApplicationContext().getPackageName(), SharepdfActivity.this.targetDirector);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                try {
                    SharepdfActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(SharepdfActivity.this, "No required app", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initToolbar(int i, int i2) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(ContextCompat.getColor(this, i));
        }
        this.back = (ImageView) findViewById(R.id.back);
        this.sharepdf = (ImageView) findViewById(R.id.sharepdf);
        this.back.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                SharepdfActivity.this.onBackPressed();
            }
        });
        this.sharepdf.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                SharepdfActivity.this.shareImg();
            }
        });
    }

    
    public void shareImg() {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this, getPackageName(), this.targetDirector));
            intent.putExtra("android.intent.extra.TEXT", "Shared via " + getString(R.string.app_name));
            intent.setType("image/png");
            startActivity(Intent.createChooser(intent, "Share image via"));
            if (this.store.contains(getString(R.string.check_rate))) {
                return;
            }
            exitdialog();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exitdialog() {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i != -3) {
                    if (i != -1) {
                        return;
                    }
                    SharepdfActivity.this.store.saveString(SharepdfActivity.this.getString(R.string.check_rate), "true");
                    dialogInterface.dismiss();
                    return;
                }
                SharepdfActivity sharepdfActivity = SharepdfActivity.this;
                sharepdfActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + SharepdfActivity.this.getPackageName())));
                dialogInterface.dismiss();
            }
        };
        new AlertDialog.Builder(this).setMessage("If you enjoy using this app, Would You Like To Rate Us !!").setPositiveButton("Cancel", onClickListener).setTitle("").setNeutralButton("Rate Us", onClickListener).show();
    }
}
