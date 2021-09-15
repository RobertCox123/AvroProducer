/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.acme.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class tenderTypes_record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5626578218454650691L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"tenderTypes_record\",\"namespace\":\"com.acme.avro\",\"fields\":[{\"name\":\"tenderType\",\"type\":\"string\"},{\"name\":\"lineSeq\",\"type\":\"int\"},{\"name\":\"amount\",\"type\":\"string\"},{\"name\":\"startDateTime\",\"type\":\"string\"},{\"name\":\"endDateTime\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<tenderTypes_record> ENCODER =
      new BinaryMessageEncoder<tenderTypes_record>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<tenderTypes_record> DECODER =
      new BinaryMessageDecoder<tenderTypes_record>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<tenderTypes_record> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<tenderTypes_record> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<tenderTypes_record>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this tenderTypes_record to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a tenderTypes_record from a ByteBuffer. */
  public static tenderTypes_record fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence tenderType;
  @Deprecated public int lineSeq;
  @Deprecated public java.lang.CharSequence amount;
  @Deprecated public java.lang.CharSequence startDateTime;
  @Deprecated public java.lang.CharSequence endDateTime;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public tenderTypes_record() {}

  /**
   * All-args constructor.
   * @param tenderType The new value for tenderType
   * @param lineSeq The new value for lineSeq
   * @param amount The new value for amount
   * @param startDateTime The new value for startDateTime
   * @param endDateTime The new value for endDateTime
   */
  public tenderTypes_record(java.lang.CharSequence tenderType, java.lang.Integer lineSeq, java.lang.CharSequence amount, java.lang.CharSequence startDateTime, java.lang.CharSequence endDateTime) {
    this.tenderType = tenderType;
    this.lineSeq = lineSeq;
    this.amount = amount;
    this.startDateTime = startDateTime;
    this.endDateTime = endDateTime;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tenderType;
    case 1: return lineSeq;
    case 2: return amount;
    case 3: return startDateTime;
    case 4: return endDateTime;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tenderType = (java.lang.CharSequence)value$; break;
    case 1: lineSeq = (java.lang.Integer)value$; break;
    case 2: amount = (java.lang.CharSequence)value$; break;
    case 3: startDateTime = (java.lang.CharSequence)value$; break;
    case 4: endDateTime = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tenderType' field.
   * @return The value of the 'tenderType' field.
   */
  public java.lang.CharSequence getTenderType() {
    return tenderType;
  }

  /**
   * Sets the value of the 'tenderType' field.
   * @param value the value to set.
   */
  public void setTenderType(java.lang.CharSequence value) {
    this.tenderType = value;
  }

  /**
   * Gets the value of the 'lineSeq' field.
   * @return The value of the 'lineSeq' field.
   */
  public java.lang.Integer getLineSeq() {
    return lineSeq;
  }

  /**
   * Sets the value of the 'lineSeq' field.
   * @param value the value to set.
   */
  public void setLineSeq(java.lang.Integer value) {
    this.lineSeq = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.CharSequence getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.CharSequence value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'startDateTime' field.
   * @return The value of the 'startDateTime' field.
   */
  public java.lang.CharSequence getStartDateTime() {
    return startDateTime;
  }

  /**
   * Sets the value of the 'startDateTime' field.
   * @param value the value to set.
   */
  public void setStartDateTime(java.lang.CharSequence value) {
    this.startDateTime = value;
  }

  /**
   * Gets the value of the 'endDateTime' field.
   * @return The value of the 'endDateTime' field.
   */
  public java.lang.CharSequence getEndDateTime() {
    return endDateTime;
  }

  /**
   * Sets the value of the 'endDateTime' field.
   * @param value the value to set.
   */
  public void setEndDateTime(java.lang.CharSequence value) {
    this.endDateTime = value;
  }

  /**
   * Creates a new tenderTypes_record RecordBuilder.
   * @return A new tenderTypes_record RecordBuilder
   */
  public static com.acme.avro.tenderTypes_record.Builder newBuilder() {
    return new com.acme.avro.tenderTypes_record.Builder();
  }

  /**
   * Creates a new tenderTypes_record RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new tenderTypes_record RecordBuilder
   */
  public static com.acme.avro.tenderTypes_record.Builder newBuilder(com.acme.avro.tenderTypes_record.Builder other) {
    return new com.acme.avro.tenderTypes_record.Builder(other);
  }

  /**
   * Creates a new tenderTypes_record RecordBuilder by copying an existing tenderTypes_record instance.
   * @param other The existing instance to copy.
   * @return A new tenderTypes_record RecordBuilder
   */
  public static com.acme.avro.tenderTypes_record.Builder newBuilder(com.acme.avro.tenderTypes_record other) {
    return new com.acme.avro.tenderTypes_record.Builder(other);
  }

  /**
   * RecordBuilder for tenderTypes_record instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<tenderTypes_record>
    implements org.apache.avro.data.RecordBuilder<tenderTypes_record> {

    private java.lang.CharSequence tenderType;
    private int lineSeq;
    private java.lang.CharSequence amount;
    private java.lang.CharSequence startDateTime;
    private java.lang.CharSequence endDateTime;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.acme.avro.tenderTypes_record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tenderType)) {
        this.tenderType = data().deepCopy(fields()[0].schema(), other.tenderType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lineSeq)) {
        this.lineSeq = data().deepCopy(fields()[1].schema(), other.lineSeq);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startDateTime)) {
        this.startDateTime = data().deepCopy(fields()[3].schema(), other.startDateTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endDateTime)) {
        this.endDateTime = data().deepCopy(fields()[4].schema(), other.endDateTime);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing tenderTypes_record instance
     * @param other The existing instance to copy.
     */
    private Builder(com.acme.avro.tenderTypes_record other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.tenderType)) {
        this.tenderType = data().deepCopy(fields()[0].schema(), other.tenderType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lineSeq)) {
        this.lineSeq = data().deepCopy(fields()[1].schema(), other.lineSeq);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.startDateTime)) {
        this.startDateTime = data().deepCopy(fields()[3].schema(), other.startDateTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.endDateTime)) {
        this.endDateTime = data().deepCopy(fields()[4].schema(), other.endDateTime);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'tenderType' field.
      * @return The value.
      */
    public java.lang.CharSequence getTenderType() {
      return tenderType;
    }

    /**
      * Sets the value of the 'tenderType' field.
      * @param value The value of 'tenderType'.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder setTenderType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.tenderType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tenderType' field has been set.
      * @return True if the 'tenderType' field has been set, false otherwise.
      */
    public boolean hasTenderType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tenderType' field.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder clearTenderType() {
      tenderType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lineSeq' field.
      * @return The value.
      */
    public java.lang.Integer getLineSeq() {
      return lineSeq;
    }

    /**
      * Sets the value of the 'lineSeq' field.
      * @param value The value of 'lineSeq'.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder setLineSeq(int value) {
      validate(fields()[1], value);
      this.lineSeq = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lineSeq' field has been set.
      * @return True if the 'lineSeq' field has been set, false otherwise.
      */
    public boolean hasLineSeq() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lineSeq' field.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder clearLineSeq() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.CharSequence getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder setAmount(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'startDateTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getStartDateTime() {
      return startDateTime;
    }

    /**
      * Sets the value of the 'startDateTime' field.
      * @param value The value of 'startDateTime'.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder setStartDateTime(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.startDateTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'startDateTime' field has been set.
      * @return True if the 'startDateTime' field has been set, false otherwise.
      */
    public boolean hasStartDateTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'startDateTime' field.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder clearStartDateTime() {
      startDateTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'endDateTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getEndDateTime() {
      return endDateTime;
    }

    /**
      * Sets the value of the 'endDateTime' field.
      * @param value The value of 'endDateTime'.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder setEndDateTime(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.endDateTime = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'endDateTime' field has been set.
      * @return True if the 'endDateTime' field has been set, false otherwise.
      */
    public boolean hasEndDateTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'endDateTime' field.
      * @return This builder.
      */
    public com.acme.avro.tenderTypes_record.Builder clearEndDateTime() {
      endDateTime = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public tenderTypes_record build() {
      try {
        tenderTypes_record record = new tenderTypes_record();
        record.tenderType = fieldSetFlags()[0] ? this.tenderType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lineSeq = fieldSetFlags()[1] ? this.lineSeq : (java.lang.Integer) defaultValue(fields()[1]);
        record.amount = fieldSetFlags()[2] ? this.amount : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.startDateTime = fieldSetFlags()[3] ? this.startDateTime : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.endDateTime = fieldSetFlags()[4] ? this.endDateTime : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<tenderTypes_record>
    WRITER$ = (org.apache.avro.io.DatumWriter<tenderTypes_record>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<tenderTypes_record>
    READER$ = (org.apache.avro.io.DatumReader<tenderTypes_record>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}