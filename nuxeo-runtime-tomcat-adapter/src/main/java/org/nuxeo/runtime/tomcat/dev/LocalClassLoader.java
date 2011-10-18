package org.nuxeo.runtime.tomcat.dev;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/*
 * (C) Copyright 2006-2010 Nuxeo SAS (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *     bstefanescu
 */

/**
 * @author <a href="mailto:bs@nuxeo.com">Bogdan Stefanescu</a>
 * 
 */
public interface LocalClassLoader {

    Class<?> loadLocalClass(String name, boolean resolve)
            throws ClassNotFoundException;

    Class<?> loadClass(String name) throws ClassNotFoundException;

    void addURL(URL url);

    URL getLocalResource(String name);

    Enumeration<URL> getLocalResources(String name) throws IOException;

    InputStream getLocalResourceAsStream(String name) throws IOException;

}
