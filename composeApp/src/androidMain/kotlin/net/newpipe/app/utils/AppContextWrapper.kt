/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package net.newpipe.app.utils

import android.content.Context
import androidx.startup.Initializer

internal object AppContextWrapper {
    var appContext: Context? = null
}

// Used in the AndroidManifest
internal class ContextInitializer : Initializer<Context> {
    private var appContext: Context? = null

    override fun create(context: Context): Context =
        context.applicationContext.also {
            appContext = it
            AppContextWrapper.appContext = it
        }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
