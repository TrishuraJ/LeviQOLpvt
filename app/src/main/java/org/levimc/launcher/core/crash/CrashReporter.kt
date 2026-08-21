package org.levimc.launcher.core.crash

import android.app.Application
import android.content.Context

object CrashReporter {

    @JvmStatic
    fun init(application: Application) {
        // Firebase removed
    }

    @JvmStatic
    fun sendUnsentReports() {
        // Firebase removed
    }

    @JvmStatic
    fun refreshCrashlyticsCollection(context: Context) {
        // Firebase removed
    }

    @JvmStatic
    fun isHandlingCrash(): Boolean {
        return false
    }
}
