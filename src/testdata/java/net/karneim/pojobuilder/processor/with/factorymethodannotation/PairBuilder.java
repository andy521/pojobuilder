package net.karneim.pojobuilder.processor.with.factorymethodannotation;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class PairBuilder<L extends Object, R extends Object>
    implements Cloneable {
  protected PairBuilder<L, R> self;
  protected L value$left$L;
  protected boolean isSet$left$L;
  protected R value$right$R;
  protected boolean isSet$right$R;

  /**
   * Creates a new {@link PairBuilder}.
   */
  public PairBuilder() {
    self = (PairBuilder<L, R>)this;
  }

  /**
   * Sets the default value for the {@link Pair#left} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PairBuilder<L, R> withLeft(L value) {
    this.value$left$L = value;
    this.isSet$left$L = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Pair#right} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PairBuilder<L, R> withRight(R value) {
    this.value$right$R = value;
    this.isSet$right$R = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      @SuppressWarnings("unchecked")
      PairBuilder<L, R> result = (PairBuilder<L, R>)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @SuppressWarnings("unchecked")
  public PairBuilder<L, R> but() {
    return (PairBuilder<L, R>)clone();
  }

  /**
   * Creates a new {@link Pair} based on this builder's settings.
   *
   * @return the created Pair
   */
  public Pair<L, R> build() {
    try {
      Pair<L, R> result = PairFactory.createPair(value$left$L, value$right$R);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Throwable t) {
      throw new java.lang.reflect.UndeclaredThrowableException(t);
    }
  }
}