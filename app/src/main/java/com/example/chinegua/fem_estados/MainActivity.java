package com.example.chinegua.fem_estados;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;


/**
 * Created by chinegua on 10/10/17.
 */


public class MainActivity extends Activity{

    private static final String TAG = "MiW";

    @Override
    public void onCreate(Bundle savedInstanceState){
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.i(TAG,"onStart");

    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");

    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");

    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");

    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.v(TAG,"onRestart");

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDetroy");

    }

    public void lanzarDialogo(View v){
        Intent intent = new Intent(this,DialogActivity.class);
        startActivity(intent);
    }

}
