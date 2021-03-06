// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Properties;
 // namespace functional

// ============================================================================

/** Options for the {@code MarginRankingLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  MarginRankingLoss model(MarginRankingLossOptions().margin(0.5).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class MarginRankingLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MarginRankingLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MarginRankingLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarginRankingLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MarginRankingLossOptions position(long position) {
        return (MarginRankingLossOptions)super.position(position);
    }
    @Override public MarginRankingLossOptions getPointer(long i) {
        return new MarginRankingLossOptions(this).position(position + i);
    }


  /** Has a default value of {@code 0}. */
  /** Specifies the reduction to apply to the output. Default: Mean */
}
