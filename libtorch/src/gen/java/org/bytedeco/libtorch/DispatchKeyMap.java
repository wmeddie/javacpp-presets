// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Properties;


// NB: You really shouldn't use this instance; this enum is guaranteed
// to be pretty small so a regular array should be acceptable.
@Name("std::hash<c10::DispatchKey>") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class DispatchKeyMap extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DispatchKeyMap() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DispatchKeyMap(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DispatchKeyMap(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DispatchKeyMap position(long position) {
        return (DispatchKeyMap)super.position(position);
    }
    @Override public DispatchKeyMap getPointer(long i) {
        return new DispatchKeyMap(this).position(position + i);
    }

}
