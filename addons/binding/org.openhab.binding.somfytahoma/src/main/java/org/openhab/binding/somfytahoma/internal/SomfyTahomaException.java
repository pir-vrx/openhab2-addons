/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.somfytahoma.internal;

/**
 * The {@link SomfyTahomaException} represents an exception in the response of
 * the TahomaLink cloud service.
 *
 * @author Ondrej Pecta - Initial contribution
 */
public class SomfyTahomaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SomfyTahomaException(String message) {
        super(message);
    }

    public SomfyTahomaException(final Throwable cause) {
        super(cause);
    }

    public SomfyTahomaException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
