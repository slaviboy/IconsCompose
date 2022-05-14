/*
* Copyright (C) 2022 Stanislav Georgiev
* https://github.com/slaviboy
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.slaviboy.iconscompose

sealed class IconType(val pathData: String) {
    class HomeRR : IconType("M 48.1687,18.8492L 32.3667,3.04505C 28.2947,-1.01502 21.7053,-1.01502 17.6333,3.04505L 1.83124,18.8492C 0.654755,20.0182 -0.00473022,21.6095 0,23.268L 0,43.72C 0,47.1718 2.79822,49.9701 6.25,49.9701L 43.75,49.9701C 47.2018,49.9701 50,47.1718 50,43.72L 50,23.268C 50.0047,21.6095 49.3452,20.0182 48.1687,18.8492 Z M 31.25,45.8034L 18.75,45.8034L 18.75,37.6075C 18.75,34.1558 21.5482,31.3575 25,31.3575C 28.4518,31.3575 31.25,34.1558 31.25,37.6075L 31.25,45.8034 Z M 45.8333,43.72C 45.8333,44.8706 44.9006,45.8034 43.75,45.8034L 35.4167,45.8034L 35.4167,37.6075C 35.4167,31.8546 30.753,27.1909 25,27.1909C 19.247,27.1909 14.5833,31.8546 14.5833,37.6075L 14.5833,45.8034L 6.25,45.8034C 5.0994,45.8034 4.16666,44.8706 4.16666,43.72L 4.16666,23.268C 4.16858,22.7158 4.38788,22.1867 4.77707,21.795L 20.5792,5.99714C 23.0241,3.56364 26.9759,3.56364 29.4208,5.99714L 45.2229,21.8013C 45.6106,22.1914 45.8297,22.718 45.8333,23.268L 45.8333,43.72 Z")
}