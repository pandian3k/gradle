/*
 * Copyright 2007-2008 the original author or authors.
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
package org.gradle.api.artifacts.maven;


import org.apache.ivy.core.module.descriptor.Artifact;

import java.io.File;

/**
 * A filter for artifacts to be published.
 */
public interface PublishFilter {
    PublishFilter ALWAYS_ACCEPT = new PublishFilter() {
        @Override
        public boolean accept(Artifact artifact, File src) {
            return true;
        }
    };

    boolean accept(Artifact artifact, File src);
}
