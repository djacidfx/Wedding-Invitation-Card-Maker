package com.demo.weddingcardapp;

import android.content.Context;
import android.util.Log;
import java.util.Map;
import java.util.Set;


public class SharedPreferences {
    private static SharedPreferences mInstance;
    private final android.content.SharedPreferences.Editor editor;
    private final android.content.SharedPreferences prefs;
    private final String TAG = "SharedPreferences";
    private final String filename = "preferences";
    private boolean logging = false;

    private String getFilename() {
        return "preferences";
    }

    private SharedPreferences(Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("preferences", 0);
        this.prefs = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    private SharedPreferences(Context context, String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.prefs = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    public static SharedPreferences getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPreferences(context);
        }
        return mInstance;
    }

    public static SharedPreferences getInstance(Context context, String str) {
        SharedPreferences sharedPreferences = mInstance;
        if ((sharedPreferences != null && !sharedPreferences.getFilename().equals(str)) || mInstance == null) {
            mInstance = new SharedPreferences(context, str);
        }
        return mInstance;
    }

    public void setLogging(boolean z) {
        this.logging = z;
    }

    public boolean isLoggingEnabled() {
        return this.logging;
    }

    public void clearAll() {
        this.editor.clear();
        this.editor.apply();
    }

    public boolean contains(String str) {
        return this.prefs.contains(str);
    }

    public void removeValue(String str) {
        if (this.logging) {
            Log.d("SharedPreferences", "Removing key " + str + " from preferences");
        }
        this.editor.remove(str);
        this.editor.apply();
    }

    public boolean getBoolean(String str, boolean z) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + this.prefs.getBoolean(str, z));
        }
        return this.prefs.getBoolean(str, z);
    }

    public int getInteger(String str, int i) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + this.prefs.getInt(str, i));
        }
        return this.prefs.getInt(str, i);
    }

    public String getString(String str, String str2) {
        if (this.logging) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value: ");
            sb.append(str);
            sb.append(" is ");
            sb.append(str2 != null ? this.prefs.getString(str, str2).trim() : null);
            Log.d("SharedPreferences", sb.toString());
        }
        if (str2 != null) {
            return this.prefs.getString(str, str2).trim();
        }
        return null;
    }

    public float getFloat(String str, float f) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + this.prefs.getFloat(str, f));
        }
        return this.prefs.getFloat(str, f);
    }

    public long getLong(String str, long j) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + this.prefs.getLong(str, j));
        }
        return this.prefs.getLong(str, j);
    }

    public double getDouble(String str, double d) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + Double.longBitsToDouble(this.prefs.getLong(str, Double.doubleToLongBits(d))));
        }
        return Double.longBitsToDouble(this.prefs.getLong(str, Double.doubleToLongBits(d)));
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        if (this.logging) {
            Log.d("SharedPreferences", "Value: " + str + " is " + this.prefs.getStringSet(str, set).toString());
        }
        return this.prefs.getStringSet(str, set);
    }

    public Map<String, ?> getAll() {
        if (this.logging) {
            Log.d("SharedPreferences", "Total of " + this.prefs.getAll().size() + " values stored");
        }
        return this.prefs.getAll();
    }

    public void saveBoolean(String str, boolean z) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + z);
        }
        this.editor.putBoolean(str, z);
        this.editor.apply();
    }

    public void saveInteger(String str, int i) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + i);
        }
        this.editor.putInt(str, i);
        this.editor.apply();
    }

    public void saveString(String str, String str2) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + str2);
        }
        this.editor.putString(str, str2 != null ? str2.trim() : null);
        this.editor.apply();
    }

    public void saveFloat(String str, float f) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + f);
        }
        this.editor.putFloat(str, f);
        this.editor.apply();
    }

    public void saveLong(String str, long j) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + j);
        }
        this.editor.putLong(str, j);
        this.editor.apply();
    }

    public void saveDouble(String str, double d) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + d);
        }
        this.editor.putLong(str, Double.doubleToRawLongBits(d));
        this.editor.apply();
    }

    public void saveStringSet(String str, Set<String> set) {
        if (this.logging) {
            Log.d("SharedPreferences", "Saving " + str + " with value " + set.toString());
        }
        this.editor.putStringSet(str, set);
        this.editor.apply();
    }
}
