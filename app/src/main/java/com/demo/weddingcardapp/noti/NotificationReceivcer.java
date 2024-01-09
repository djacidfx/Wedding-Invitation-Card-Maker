package com.demo.weddingcardapp.noti;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;


import com.demo.weddingcardapp.LaucherActivityNew;
import com.demo.weddingcardapp.R;


public class NotificationReceivcer extends BroadcastReceiver {
    @Override 
    public void onReceive(Context context, Intent intent) {
        showNotification(context);
    }

    @SuppressLint("RestrictedApi")
    void showNotification(Context context) {
        NotificationCompat.Builder contentTitle;
        String string = context.getResources().getString(R.string.app_name);
        Intent intent = new Intent(context, LaucherActivityNew.class);
        intent.putExtras(new Bundle());
        intent.setFlags(201326592);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon200);
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("your_name", string, NotificationManager.IMPORTANCE_HIGH));
            contentTitle = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon200).setLargeIcon(decodeResource).setLights(SupportMenu.CATEGORY_MASK, 300, 300).setChannelId("your_name").setContentTitle("Hello");
        } else {
            contentTitle = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon200).setPriority(1).setContentTitle("Hello");
        }
        contentTitle.setContentIntent(activity);
        contentTitle.setContentText("We miss you");
        contentTitle.setAutoCancel(true);
        notificationManager.notify(1, contentTitle.build());
    }
}
