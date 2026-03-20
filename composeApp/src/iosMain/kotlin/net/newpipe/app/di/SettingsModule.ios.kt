/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package net.newpipe.app.di

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module
import org.koin.core.annotation.Singleton
import platform.Foundation.NSUserDefaults

@Module
@Configuration
actual object SettingsModule {

    @Singleton
    actual fun provideSettings(): Settings = NSUserDefaultsSettings(NSUserDefaults())
}
