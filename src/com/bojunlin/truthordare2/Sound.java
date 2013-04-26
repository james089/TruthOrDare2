package com.bojunlin.truthordare2;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class Sound extends Activity{
	SoundPool soundPool; 
	HashMap<Integer, Integer> soundPoolMap;
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
