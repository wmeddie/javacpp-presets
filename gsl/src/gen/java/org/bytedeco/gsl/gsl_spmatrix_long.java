// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*
 * COO format:
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   j = A->p[n]
 *
 * Compressed column format (CSC):
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   A->p[j] <= n < A->p[j+1]
 * so that column j is stored in
 * [ data[p[j]], data[p[j] + 1], ..., data[p[j+1] - 1] ]
 *
 * Compressed row format (CSR):
 *
 * If data[n] = A_{ij}, then:
 *   j = A->i[n]
 *   A->p[i] <= n < A->p[i+1]
 * so that row i is stored in
 * [ data[p[i]], data[p[i] + 1], ..., data[p[i+1] - 1] ]
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_spmatrix_long extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_spmatrix_long() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_spmatrix_long(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_spmatrix_long(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_spmatrix_long position(long position) {
        return (gsl_spmatrix_long)super.position(position);
    }

  public native @Cast("size_t") long size1(); public native gsl_spmatrix_long size1(long setter);               /* number of rows */
  public native @Cast("size_t") long size2(); public native gsl_spmatrix_long size2(long setter);               /* number of columns */

  /* i (size nzmax) contains:
   *
   * COO/CSC: row indices
   * CSR: column indices
   */
  public native IntPointer i(); public native gsl_spmatrix_long i(IntPointer setter);

  public native CLongPointer data(); public native gsl_spmatrix_long data(CLongPointer setter);               /* matrix elements of size nzmax */

  /*
   * COO: p[n] = column number of element data[n]
   * CSC: p[j] = index in data of first non-zero element in column j
   * CSR: p[i] = index in data of first non-zero element in row i
   */
  public native IntPointer p(); public native gsl_spmatrix_long p(IntPointer setter);

  public native @Cast("size_t") long nzmax(); public native gsl_spmatrix_long nzmax(long setter);              /* maximum number of matrix elements */
  public native @Cast("size_t") long nz(); public native gsl_spmatrix_long nz(long setter);                 /* number of non-zero values in matrix */

  public native gsl_bst_workspace tree(); public native gsl_spmatrix_long tree(gsl_bst_workspace setter);   /* binary tree structure */
  public native gsl_spmatrix_pool pool(); public native gsl_spmatrix_long pool(gsl_spmatrix_pool setter);   /* memory pool for binary tree nodes */
  public native @Cast("size_t") long node_size(); public native gsl_spmatrix_long node_size(long setter);          /* size of individual tree node in bytes */

  /*
   * workspace of size MAX(size1,size2)*MAX(sizeof(long),sizeof(int))
   * used in various routines
   */
      @Name("work.work_void") public native Pointer work_work_void(); public native gsl_spmatrix_long work_work_void(Pointer setter);
      @Name("work.work_int") public native IntPointer work_work_int(); public native gsl_spmatrix_long work_work_int(IntPointer setter);
      @Name("work.work_atomic") public native CLongPointer work_work_atomic(); public native gsl_spmatrix_long work_work_atomic(CLongPointer setter);

  public native int sptype(); public native gsl_spmatrix_long sptype(int setter);                /* sparse storage type */
  public native @Cast("size_t") long spflags(); public native gsl_spmatrix_long spflags(long setter);            /* GSL_SPMATRIX_FLG_xxx */
}