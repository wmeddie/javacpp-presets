// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class RMSprop extends Optimizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RMSprop(Pointer p) { super(p); }


  public RMSprop(@StdVector Tensor params,
        @ByVal(nullValue = "torch::optim::RMSpropOptions({})") RMSpropOptions defaults) { super((Pointer)null); allocate(params, defaults); }
  private native void allocate(@StdVector Tensor params,
        @ByVal(nullValue = "torch::optim::RMSpropOptions({})") RMSpropOptions defaults);
  public RMSprop(@StdVector Tensor params) { super((Pointer)null); allocate(params); }
  private native void allocate(@StdVector Tensor params);

  public native @ByVal Tensor step();
  public native void save(@ByRef OutputArchive archive);
  public native void load(@ByRef InputArchive archive);
}