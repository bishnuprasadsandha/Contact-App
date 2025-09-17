package com.example.contactapp.presentation.Utils

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.*
import androidx.compose.runtime.disableHotReloadMode
import androidx.compose.ui.graphics.vector.addPathNodes
import com.example.contactapp.data.database.Contact

@Composable
fun CustemTextField(
    value : String,
    onValueChange : (String) -> Unit,
    label : String,
    modifier: Modifier = Modifier,
    singline : Boolean = true,
    leadingIcon : ImageVector? =null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
                colors = TextFieldDefaults.colors(
            unfocusedTextColor = MaterialTheme.colorScheme.onSurface.copy(alpha = ContentAlpha.disabled),
            focusedTextColor = MaterialTheme.colorScheme.onSurface,
            unfocusedBorderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = ContentAlpha.disabled),
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            cursorColor = MaterialTheme.colorScheme.primary,
            focusedOLabelColor = MaterialTheme.colorScheme.primary,
                    focusedPlaceholderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = ContentAlpha.medium),
                    focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onSurface.copy(alpha = ContentAlpha.disabled)
        ),
        modifier = modifier,
        singline = singline,
        leadingIcon = leadingIcon.let { icon->
            {
                Icon(imageVector = icon, contentDescription = null)
            }
        },
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions
    )
}