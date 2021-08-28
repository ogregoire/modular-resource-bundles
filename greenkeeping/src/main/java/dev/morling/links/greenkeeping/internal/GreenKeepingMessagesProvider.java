/*
 *  Copyright 2021 The original authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package dev.morling.links.greenkeeping.internal;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.AbstractResourceBundleProvider;

import dev.morling.links.core.spi.LinksMessagesProvider;

public class GreenKeepingMessagesProvider extends AbstractResourceBundleProvider implements LinksMessagesProvider {

    @Override
    public ResourceBundle getBundle(String baseName, Locale locale) {
        if (locale.getVariant().equals("greenkeeping")) {
            locale = new Locale(locale.getLanguage(), locale.getCountry());
            return super.getBundle(baseName.replace("core.LinksMessages", "greenkeeping.internal.LinksMessages"), locale);
        }

        return null;
    }
}
