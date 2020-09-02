/*
 * Copyright (C) 2020 Samuel Audet, Eduardo Gonzalez
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.libtorch.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.presets.javacpp;
import org.bytedeco.javacpp.tools.*;
import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;

@Properties(inherit = javacpp.class, target = "org.bytedeco.libtorch", global = "org.bytedeco.libtorch.global.libtorch", value = {@Platform(
    value = {"linux", "macosx", "windows"},
    //define = {},
    compiler = "cpp14",
    include = {
        "LibTorch/LibTorch.h"
    },
    link = {"libtorch"}),
public class libtorch implements InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "libtorch"); }

    public void map(InfoMap infoMap) {
    }

}
