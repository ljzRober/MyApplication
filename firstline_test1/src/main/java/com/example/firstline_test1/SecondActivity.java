package com.example.firstline_test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends MainActivity {
    private static String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.finish_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishALL();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }

    public static void actionStart(Context context, String...datas){
        Intent intent = new Intent(context, SecondActivity.class);
        int i = 1;
        Log.i(TAG, "actionStart: "+datas.getClass());
        for (String data : datas){
            intent.putExtra("param"+i, data);
            i++;
        }
        context.startActivity(intent);
    }
}
