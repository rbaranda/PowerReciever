package com.example.powerreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

private CustomReceiver mReceiver = new CustomReceiver();

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    LocalBroadcastManager.getInstance(this)
            .registerReceiver(mReceiver,
                          new IntentFilter(ACTION_CUSTOM_BROADCAST));

    IntentFilter filter = new IntentFilter();

    public void sendCustomBroadcast(View view) {
        Intent customBroadcastIntent = new Intent(ACTION_CUSTOM_BROADCAST);
        LocalBroadcastManager.getInstance(this).sendBroadcast(customBroadcastIntent);
        
    }
}
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction(Intent.ACTION_POWER_CONNECTED);

@Override
protected void onDestroy() {
        //Unregister the receiver
        this.unregisterReceiver(mReceiver);
        super.onDestroy();
        LocalBroadcastManager.getInstance(this)
        .unregisterReceiver(mReceiver);
        }

private static final String ACTION_CUSTOM_BROADCAST =
        BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST"


