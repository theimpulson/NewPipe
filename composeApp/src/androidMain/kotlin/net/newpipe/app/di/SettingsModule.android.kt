/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package net.newpipe.app.di

import androidx.preference.PreferenceManager
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import net.newpipe.app.utils.AppContextWrapper
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module
import org.koin.core.annotation.Singleton

@Module
@Configuration
actual object SettingsModule {

    @Singleton
    actual fun provideSettings(): Settings = SharedPreferencesSettings(
        PreferenceManager.getDefaultSharedPreferences(AppContextWrapper.appContext!!)
    )
}
