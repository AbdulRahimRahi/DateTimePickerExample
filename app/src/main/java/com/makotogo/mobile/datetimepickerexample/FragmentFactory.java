/*
 *     Copyright 2016 Makoto Consulting Group, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.makotogo.mobile.datetimepickerexample;

import java.util.Date;

/**
 * Created by sperry on 7/6/16.
 */
public class FragmentFactory {
    public static final String FRAG_ARG_PREFIX = "fragment.argument.";
    public static final String FRAG_ARG_DATE = FRAG_ARG_PREFIX + Date.class.getName();
    public static final String FRAG_ARG_DATE_TYPE = FRAG_ARG_DATE + "Type";
    public static final String FRAG_ARG_DATETIME_PICKER_CHOICE = FRAG_ARG_PREFIX + "date.picker.choice";


}
