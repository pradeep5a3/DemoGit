package com.embitel.aidlexamples;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import

public class MainActivity extends AppCompatActivity {

    public MainActivity(Context context) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("amar","Added");
    }

//    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
//        public int getPid(){
//            return Process.myPid();
//        }
//        public void basicTypes(int anInt, long aLong, boolean aBoolean,
//                               float aFloat, double aDouble, String aString) {
//            // Does nothing
//        }
//    };
}
