/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.util.collections;

/**
 * Simple interface for an intensional set definition
 * 
 * @author sfink
 */
public interface Filter<T> {
  /**
   * @return true iff o is in the set defined by this filter
   */
  public boolean accepts(T o);
}
