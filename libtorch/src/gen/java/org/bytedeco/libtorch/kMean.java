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
public class kMean extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public kMean(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public kMean(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public kMean position(long position) {
          return (kMean)super.position(position);
      }
      @Override public kMean getPointer(long i) {
          return new kMean(this).position(position + i);
      }
   public kMean() { super((Pointer)null); allocate(); }
private native void allocate(); }