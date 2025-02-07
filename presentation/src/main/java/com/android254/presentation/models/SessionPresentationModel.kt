/*
 * Copyright 2022 DroidconKE
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
package com.android254.presentation.models

data class SessionPresentationModel(
    val id: String,
    val title: String,
    val description: String,
    val venue: String,
    val speakerImage: String,
    val speakerName: String,
    val startTime: String,
    val endTime: String,
    val amOrPm: String,
    val isStarred: Boolean,
    val format: String,
    val level: String,
    val startDate: String,
    val endDate: String,
    val remoteId: String,
    val isService: Boolean = false,
    val sessionImage: String = "",
    val eventDay: String
)