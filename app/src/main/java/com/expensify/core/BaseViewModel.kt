package com.expensify.core

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LifecycleObserver

open class BaseViewModel(app : Application): AndroidViewModel(app),LifecycleObserver {
}