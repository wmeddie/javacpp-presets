// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libtorch;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Properties;

  /*
    NOTE: We need to provide the default constructor for each struct,
    otherwise Clang 3.8 would complain:
    ```
    error: default initialization of an object of const type 'const enumtype::Enum1'
    without a user-provided default constructor
    ```
  */
  @Namespace("torch::enumtype") @Properties(inherit = org.bytedeco.libtorch.presets.libtorch.class)
public class kRNN_RELU extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public kRNN_RELU(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public kRNN_RELU(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public kRNN_RELU position(long position) {
          return (kRNN_RELU)super.position(position);
      }
      @Override public kRNN_RELU getPointer(long i) {
          return new kRNN_RELU(this).position(position + i);
      }
   public kRNN_RELU() { super((Pointer)null); allocate(); }
private native void allocate(); }
