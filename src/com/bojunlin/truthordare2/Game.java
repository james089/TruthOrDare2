package com.bojunlin.truthordare2;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;


import com.bojunlin.truthordare2.Questions;
import com.bojunlin.truthordare2.ShakeDetector.OnShakeListener;

public class Game extends Activity {
	
	SoundPool soundPool; 
	HashMap<Integer, Integer> soundPoolMap;
	Questions question=new Questions();
    private ShakeDetector mShakeDetector;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
	
    
    
	 //====================shake========================
//	   private TextView textView1 = null;
//	   private TextView textView2 = null; //A texView to show the question

	
/* <Oncreate */ 
	  
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	   
		initSounds();// 初始化声音资源
	
//      textView1 = (TextView) findViewById(R.id.xbox);
//		textView2 = (TextView) findViewById(R.id.question);
		
      
       Intent intent1 = getIntent();
       final int message = intent1.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);
//      textView1.setText(message);
        
        // ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector(new OnShakeListener() {
            @Override
            public void onShake() {
            	String Mess = question.showMessage(message);
              	dialog(Mess);
              	playSound(message,0);
            }
        });
   
		
	}

/* Oncreate/> */ 
	
	    
	    public void dialog(String str)
	    {
            
	    	new AlertDialog.Builder(this).setTitle("Here is the question:").setMessage(
	                str)
	                 .setPositiveButton("Finish",
	                         new DialogInterface.OnClickListener() {
	                             @Override
	                             public void onClick(DialogInterface arg0,
	                                     int arg1) {
	                             	
	                             }
	                         }).show();
	    }
	    
	    
	    @Override
	    protected void onResume() {
	        super.onResume();
	        mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
	    }

	    @Override
	    protected void onPause() {
	        mSensorManager.unregisterListener(mShakeDetector);
	        super.onPause();
	    }   
	
	@SuppressLint("UseSparseArrays")
	public void initSounds() {
		  soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
		  soundPoolMap = new HashMap<Integer, Integer>();

		  soundPoolMap.put(1, soundPool.load(this, R.raw.spica, 1));// 加载声音
		  soundPoolMap.put(2, soundPool.load(this, R.raw.voila, 1));// 加载声音
		  soundPoolMap.put(3, soundPool.load(this, R.raw.rubidium, 1));// 加载声音
		  soundPoolMap.put(4, soundPool.load(this, R.raw.deneb, 1));// 加载声音
		  
		  	}
		   
	public void playSound(int sound, int loop)// 播放声音的方法
		  	{
		  		AudioManager mgr = (AudioManager) this
		  				.getSystemService(Context.AUDIO_SERVICE);
		 
		  		float streamVolumeCurrent = mgr.getStreamVolume(AudioManager.STREAM_MUSIC);
		  		float streamVolumeMax = mgr
		  				.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		  		float volume = streamVolumeCurrent / streamVolumeMax;// 得到音量的大小
		  
		  		soundPool.play(soundPoolMap.get(sound), volume, volume, 1, loop, 1f);
		  	}	  



	
}