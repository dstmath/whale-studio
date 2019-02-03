package com.whale.whale_studio;

import com.lody.whale.xposed.XC_MethodHook;
import com.lody.whale.xposed.XposedHelpers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XposedHelpers.findAndHookMethod(TextView.class, "setText", CharSequence.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0] = "hooked by whale !";
            }

            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
            }
        });
        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText("Hello world");
    }
}
