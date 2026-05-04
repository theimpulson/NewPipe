/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package net.newpipe.app.model

import org.jetbrains.compose.resources.StringResource

/**
 * Class to hold data for list items in about screen
 */
data class AboutData(
    val title: StringResource,
    val description: StringResource,
    val buttonText: StringResource,
    val url: String
)
