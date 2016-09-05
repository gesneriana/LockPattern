package com.asuna.lockpattern.pattern;

import com.asuna.lockpattern.view.LockPatternUtils;

import android.app.Application;

public class MyApplication extends Application {
	private static MyApplication mInstance;
	private LockPatternUtils mLockPatternUtils;

	public static MyApplication getInstance() {
		return mInstance;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;
		mLockPatternUtils = new LockPatternUtils(this);
	}

	public LockPatternUtils getLockPatternUtils() {
		return mLockPatternUtils;
	}
}
