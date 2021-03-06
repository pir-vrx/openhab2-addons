/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.innogysmarthome.internal.client.exception;

/**
 * Thrown, if the session is not initialized or disconnected.
 *
 * @author Oliver Kuhl - Initial contribution
 *
 */
@SuppressWarnings("serial")
public class SessionNotFoundException extends ApiException {

    public SessionNotFoundException() {
        super();
    }

    public SessionNotFoundException(String message) {
        super(message);
    }

}
