/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.vjet.eclipse.javatojs.core.tests.codegen.java2js.data;

import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.eclipse.javatojs.core.tests.codegen.java2js.data.child.FieldsJsr;
import org.eclipse.vjet.vsf.jsref.JsFunc;
import org.eclipse.vjet.vsf.jsref.JsObjData;
import org.eclipse.vjet.vsf.jsref.JsTypeRef;
import org.eclipse.vjet.vsf.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.vsf.resource.pattern.js.IJsResourceRef;
import org.eclipse.vjet.vsf.resource.pattern.js.JsResource;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class ArrayJsr extends FieldsJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("org.eclipse.vjet.eclipse.javatojs.core.tests.codegen.java2js.data.Array", ArrayJsr.class, "Array", true);

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(FieldsJsr.ResourceSpec.getInstance());

    public ArrayJsr(){
        super(S.getJsCmpMeta(), true);
    }

    protected ArrayJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }

    public JsFunc<Void> initializer(){
        return call("initializer");
    }

    public JsFunc<Void> creation(){
        return call("creation");
    }

    public JsFunc<Void> access(){
        return call("access");
    }
    
    public static JsTypeRef<ArrayJsr> prototype = new JsTypeRef<ArrayJsr>(S);
}