/**
 * TEI Authorizer
 * An Oxygen XML Editor plugin for customizable attribute and value completion and/or creation for TEI P5 documents
 * Copyright (C) 2016 Belgrade Center for Digital Humanities
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.humanistika.oxygen.tei.authorizer.configuration.beans;

import javax.annotation.Nullable;

import java.util.regex.Pattern;

/**
 * Configuration details for uploading a User Field to a server
 *
 * @author Adam Retter, Evolved Binary Ltd
 * @version 1.0
 * @serial 20160405
 */
public class UserFieldInfo {
    private final String name;
    @Nullable private final String label;
    private final boolean multiline;
    private final boolean required;
    @Nullable private final String initialValue;
    @Nullable private final String defaultValue;
    @Nullable private final Pattern validateWith;

    public UserFieldInfo(final String name, @Nullable final String label, final boolean multiline, final boolean required, @Nullable final String initialValue, @Nullable final String defaultValue, @Nullable final Pattern validateWith) {
        this.name = name;
        this.label = label;
        this.multiline = multiline;
        this.required = required;
        this.initialValue = initialValue;
        this.defaultValue = defaultValue;
        this.validateWith = validateWith;
    }

    public String getName() {
        return name;
    }

    @Nullable
    public String getLabel() {
        return label;
    }

    public boolean isMultiline() {
        return multiline;
    }

    public boolean isRequired() {
        return required;
    }

    @Nullable
    public String getInitialValue() {
        return initialValue;
    }

    @Nullable
    public String getDefaultValue() {
        return defaultValue;
    }

    @Nullable
    public Pattern getValidateWith() {
        return validateWith;
    }
}
