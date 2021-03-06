// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Properties;


/** Options for {@code torch::nn::functional::layer_norm}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::layer_norm(input, F::LayerNormFuncOptions({2, 2}).eps(2e-5));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class LayerNormFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerNormFuncOptions(Pointer p) { super(p); }

  /* implicit */ public LayerNormFuncOptions(@ByVal LongVector normalized_shape) { super((Pointer)null); allocate(normalized_shape); }
private native void allocate(@ByVal LongVector normalized_shape);
  /** input shape from an expected input. */

  /** a value added to the denominator for numerical stability. {@code }Default: 1e-5{@code }. */
}
