/*
 * Copyright 2008-2010 the original author or authors.
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
package org.springframework.data.repository.support;

/**
 * Interface to abstract the ways to determine if the given entity is to be
 * considered as new.
 * 
 * @author Oliver Gierke
 */
public interface IsNewAware {

    /**
     * Returns whether the given entity is considered to be new.
     * 
     * @param entity
     * @return
     */
    boolean isNew(Object entity);
}