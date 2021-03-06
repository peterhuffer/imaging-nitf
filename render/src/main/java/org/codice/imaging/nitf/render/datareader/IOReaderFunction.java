/*
 * Copyright (c) Codice Foundation
 *
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 *
 */
package org.codice.imaging.nitf.render.datareader;

import java.io.IOException;

/**
 * Generic interface for reading from an ImageInputStream.
 *
 * Implementations of this will be provided an image input stream, and will read
 * from that stream, returning the data for a single pixel for a single band.
 *
 * @param <T> returned data type
 * @param <R> the stream to read from.
 */
@FunctionalInterface
public interface IOReaderFunction<T, R> {

    /**
     * Read the pixel band data.
     *
     * @param param the ImageInputStream to read from.
     * @return pixel band data.
     * @throws IOException if reading fails.
     */
    T apply(R param) throws IOException;
}
