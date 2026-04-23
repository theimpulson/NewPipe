/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package org.schabi.newpipe.koin

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.KoinApplication

/**
 * Entry point for Koin-related configuration
 */
@ComponentScan
@KoinApplication
object KoinApp
