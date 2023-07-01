package com.expensify.ui.splash

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.expensify.R
import com.expensify.core.BaseActivity
import com.expensify.core.BaseViewModel
import com.expensify.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity<ActivitySplashBinding,BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_splash

    override fun getViewModel(): Class<BaseViewModel> = BaseViewModel::class.java

    override fun init() {}

    override fun initListener() {}

    override fun addObserver() {}
}