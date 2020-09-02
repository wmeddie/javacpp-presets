// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Properties;


@Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class PlacementDtor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PlacementDtor(Pointer p) { super(p); }
    protected PlacementDtor() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, @Cast("size_t") long arg1);
}
