package org.pushtalk.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class BasePreferenceManager {

    private static SharedPreferences mSharedPreferences = null;
    private static Editor mEditor = null;
    
    public static void init(Context context){
    	if (null == mSharedPreferences) {
    		mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context) ;
    	}
    }
    
    protected static void removeKey(String key){
        mEditor = mSharedPreferences.edit();
        mEditor.remove(key);
        mEditor.commit();
    }
    
    protected static void removeAll(){
        mEditor = mSharedPreferences.edit();
        mEditor.clear();
        mEditor.commit();
    }

    protected static void commitString(String key, String value){
        mEditor = mSharedPreferences.edit();
        mEditor.putString(key, value);
        mEditor.commit();
    }
    
    protected static String getString(String key, String faillValue){
        return mSharedPreferences.getString(key, faillValue);
    }
    
    protected static void commitInt(String key, int value){
        mEditor = mSharedPreferences.edit();
        mEditor.putInt(key, value);
        mEditor.commit();
    }
    
    protected static int getInt(String key, int failValue){
        return mSharedPreferences.getInt(key, failValue);
    }
    
    protected static void commitLong(String key, long value){
        mEditor = mSharedPreferences.edit();
        mEditor.putLong(key, value);
        mEditor.commit();
    }
    
	protected static long getLong(String key, long failValue) {
        return mSharedPreferences.getLong(key, failValue);
    }
    
    protected static void commitBoolean(String key, boolean value){
        mEditor = mSharedPreferences.edit();
        mEditor.putBoolean(key, value);
        mEditor.commit();
    }
    
    protected static Boolean getBoolean(String key, boolean failValue){
        return mSharedPreferences.getBoolean(key, failValue);
    }
    
	
}