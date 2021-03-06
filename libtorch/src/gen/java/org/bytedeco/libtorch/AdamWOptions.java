// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Properties;
 // namespace torch

@Namespace("torch::optim") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class AdamWOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdamWOptions(Pointer p) { super(p); }

  public AdamWOptions(double lr/*=1e-3*/) { super((Pointer)null); allocate(lr); }
  private native void allocate(double lr/*=1e-3*/);
  public AdamWOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native void serialize(@ByRef InputArchive archive);
  public native void serialize(@ByRef OutputArchive archive);
  
}
