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

import org.eclipse.vjet.dsf.jst.declaration.JstVars;
import org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter;

/**
 * 
 *
 */
public class JstVarsNodePrinter implements INodePrinter {

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter#getPropertyNames(Object node)
	 */
	public String[] getPropertyNames(Object node) {
		return new String[] {"object_id", "text"};
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.vjet.eclipse.internal.ui.nodeprinter.INodePrinter#getPropertyValuies(java.lang.Object)
	 */
	public Object[] getPropertyValuies(Object node) {
		String objectID = String.valueOf(node.hashCode());
		JstVars jstVars = (JstVars)node;
		
		String text = jstVars.toText();
		return new Object[] {objectID, text};
	}

}
