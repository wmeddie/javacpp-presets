// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Properties;
 // namespace functional

// ============================================================================

/** Options for the {@code SoftMarginLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  SoftMarginLoss model(SoftMarginLossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class SoftMarginLossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftMarginLossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftMarginLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SoftMarginLossOptions position(long position) {
        return (SoftMarginLossOptions)super.position(position);
    }
    @Override public SoftMarginLossOptions getPointer(long i) {
        return new SoftMarginLossOptions(this).position(position + i);
    }


  public SoftMarginLossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
public SoftMarginLossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kNone reduction);
public SoftMarginLossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kMean reduction);
public SoftMarginLossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
private native void allocate(@ByVal kSum reduction);

  /** Specifies the reduction to apply to the output: 'none' | 'mean' | 'sum'.
   *  'none': no reduction will be applied, 'mean': the sum of the output will
   *  be divided by the number of elements in the output, 'sum': the output will
   *  be summed. Default: 'mean' */
}
