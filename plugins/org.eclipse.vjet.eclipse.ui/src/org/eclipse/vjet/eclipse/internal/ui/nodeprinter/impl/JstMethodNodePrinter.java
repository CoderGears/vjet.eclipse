/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.vjet.eclipse.internal.ui.nodeprinter.impl;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter;

/**
 * 
 *
 */
public class JstMethodNodePrinter implements INodePrinter {

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter#getPropertyNames(Object node)
	 */
	public String[] getPropertyNames(Object node) {
		return new String[] {"object_id", "name", "return_type"};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter#getPropertyValuies(java.lang.Object)
	 */
	public Object[] getPropertyValuies(Object node) {
		String objectID = String.valueOf(node.hashCode());
		IJstMethod jstMethod = (IJstMethod)node;
		String name = jstMethod.getName().getName();
		String returnType = jstMethod.getRtnType() != null ? jstMethod.getRtnType().getName() : "void";
		return new Object[] {objectID, name, returnType};
	}
	
}
