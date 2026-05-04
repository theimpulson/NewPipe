/*
 * SPDX-FileCopyrightText: 2026 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package net.newpipe.app.composable.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.newpipe.app.model.AboutData
import newpipe.composeapp.generated.resources.Res
import newpipe.composeapp.generated.resources.contribution_encouragement
import newpipe.composeapp.generated.resources.contribution_title
import newpipe.composeapp.generated.resources.view_on_github
import org.jetbrains.compose.resources.stringResource

/**
 * Composable to display item providing information about NewPipe
 * @param data A data item with information
 * @param onClick Callback when the action button is clicked
 */
@Composable
fun AboutListItem(modifier: Modifier = Modifier, data: AboutData, onClick: () -> Unit = {}) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = stringResource(data.title),
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = stringResource(data.description),
            style = MaterialTheme.typography.bodyMedium
        )

        TextButton(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
            onClick = onClick
        ) {
            Text(text = stringResource(data.buttonText))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AboutListItemPreview() {
    AboutListItem(
        data = AboutData(
            Res.string.contribution_title,
            Res.string.contribution_encouragement,
            Res.string.view_on_github,
            ""
        )
    )
}
