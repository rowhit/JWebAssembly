/*
 * Copyright 2017 - 2018 Volker Berlin (i-net software)
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
package de.inetsoftware.jwebassembly.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import de.inetsoftware.jwebassembly.module.ValueType;

/**
 * An entry in the type section of the WebAssembly.
 * 
 * @author Volker Berlin
 */
class FunctionType {

    final List<ValueType> params = new ArrayList<>();

    ValueType             result;                    // Java has only one return parameter

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return params.hashCode() + 31 * Objects.hashCode( result );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals( Object obj ) {
        if( obj == this ) {
            return true;
        }
        if( obj == null || obj.getClass() != getClass() ) {
            return false;
        }
        FunctionType type = (FunctionType)obj;
        return Objects.equals( params, type.params ) && Objects.equals( result, type.result );
    }
}
