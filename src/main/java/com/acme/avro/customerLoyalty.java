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
public class customerLoyalty extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7030260311492187288L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"customerLoyalty\",\"namespace\":\"com.acme.avro\",\"fields\":[{\"name\":\"nectarCard\",\"type\":\"string\"},{\"name\":\"issueNo\",\"type\":\"string\"},{\"name\":\"pointsAward\",\"type\":\"int\"},{\"name\":\"includesBonus\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<customerLoyalty> ENCODER =
      new BinaryMessageEncoder<customerLoyalty>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<customerLoyalty> DECODER =
      new BinaryMessageDecoder<customerLoyalty>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<customerLoyalty> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<customerLoyalty> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<customerLoyalty>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this customerLoyalty to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a customerLoyalty from a ByteBuffer. */
  public static customerLoyalty fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence nectarCard;
  @Deprecated public java.lang.CharSequence issueNo;
  @Deprecated public int pointsAward;
  @Deprecated public int includesBonus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public customerLoyalty() {}

  /**
   * All-args constructor.
   * @param nectarCard The new value for nectarCard
   * @param issueNo The new value for issueNo
   * @param pointsAward The new value for pointsAward
   * @param includesBonus The new value for includesBonus
   */
  public customerLoyalty(java.lang.CharSequence nectarCard, java.lang.CharSequence issueNo, java.lang.Integer pointsAward, java.lang.Integer includesBonus) {
    this.nectarCard = nectarCard;
    this.issueNo = issueNo;
    this.pointsAward = pointsAward;
    this.includesBonus = includesBonus;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nectarCard;
    case 1: return issueNo;
    case 2: return pointsAward;
    case 3: return includesBonus;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nectarCard = (java.lang.CharSequence)value$; break;
    case 1: issueNo = (java.lang.CharSequence)value$; break;
    case 2: pointsAward = (java.lang.Integer)value$; break;
    case 3: includesBonus = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nectarCard' field.
   * @return The value of the 'nectarCard' field.
   */
  public java.lang.CharSequence getNectarCard() {
    return nectarCard;
  }

  /**
   * Sets the value of the 'nectarCard' field.
   * @param value the value to set.
   */
  public void setNectarCard(java.lang.CharSequence value) {
    this.nectarCard = value;
  }

  /**
   * Gets the value of the 'issueNo' field.
   * @return The value of the 'issueNo' field.
   */
  public java.lang.CharSequence getIssueNo() {
    return issueNo;
  }

  /**
   * Sets the value of the 'issueNo' field.
   * @param value the value to set.
   */
  public void setIssueNo(java.lang.CharSequence value) {
    this.issueNo = value;
  }

  /**
   * Gets the value of the 'pointsAward' field.
   * @return The value of the 'pointsAward' field.
   */
  public java.lang.Integer getPointsAward() {
    return pointsAward;
  }

  /**
   * Sets the value of the 'pointsAward' field.
   * @param value the value to set.
   */
  public void setPointsAward(java.lang.Integer value) {
    this.pointsAward = value;
  }

  /**
   * Gets the value of the 'includesBonus' field.
   * @return The value of the 'includesBonus' field.
   */
  public java.lang.Integer getIncludesBonus() {
    return includesBonus;
  }

  /**
   * Sets the value of the 'includesBonus' field.
   * @param value the value to set.
   */
  public void setIncludesBonus(java.lang.Integer value) {
    this.includesBonus = value;
  }

  /**
   * Creates a new customerLoyalty RecordBuilder.
   * @return A new customerLoyalty RecordBuilder
   */
  public static com.acme.avro.customerLoyalty.Builder newBuilder() {
    return new com.acme.avro.customerLoyalty.Builder();
  }

  /**
   * Creates a new customerLoyalty RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new customerLoyalty RecordBuilder
   */
  public static com.acme.avro.customerLoyalty.Builder newBuilder(com.acme.avro.customerLoyalty.Builder other) {
    return new com.acme.avro.customerLoyalty.Builder(other);
  }

  /**
   * Creates a new customerLoyalty RecordBuilder by copying an existing customerLoyalty instance.
   * @param other The existing instance to copy.
   * @return A new customerLoyalty RecordBuilder
   */
  public static com.acme.avro.customerLoyalty.Builder newBuilder(com.acme.avro.customerLoyalty other) {
    return new com.acme.avro.customerLoyalty.Builder(other);
  }

  /**
   * RecordBuilder for customerLoyalty instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<customerLoyalty>
    implements org.apache.avro.data.RecordBuilder<customerLoyalty> {

    private java.lang.CharSequence nectarCard;
    private java.lang.CharSequence issueNo;
    private int pointsAward;
    private int includesBonus;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.acme.avro.customerLoyalty.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nectarCard)) {
        this.nectarCard = data().deepCopy(fields()[0].schema(), other.nectarCard);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.issueNo)) {
        this.issueNo = data().deepCopy(fields()[1].schema(), other.issueNo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pointsAward)) {
        this.pointsAward = data().deepCopy(fields()[2].schema(), other.pointsAward);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.includesBonus)) {
        this.includesBonus = data().deepCopy(fields()[3].schema(), other.includesBonus);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing customerLoyalty instance
     * @param other The existing instance to copy.
     */
    private Builder(com.acme.avro.customerLoyalty other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nectarCard)) {
        this.nectarCard = data().deepCopy(fields()[0].schema(), other.nectarCard);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.issueNo)) {
        this.issueNo = data().deepCopy(fields()[1].schema(), other.issueNo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.pointsAward)) {
        this.pointsAward = data().deepCopy(fields()[2].schema(), other.pointsAward);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.includesBonus)) {
        this.includesBonus = data().deepCopy(fields()[3].schema(), other.includesBonus);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'nectarCard' field.
      * @return The value.
      */
    public java.lang.CharSequence getNectarCard() {
      return nectarCard;
    }

    /**
      * Sets the value of the 'nectarCard' field.
      * @param value The value of 'nectarCard'.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder setNectarCard(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nectarCard = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nectarCard' field has been set.
      * @return True if the 'nectarCard' field has been set, false otherwise.
      */
    public boolean hasNectarCard() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nectarCard' field.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder clearNectarCard() {
      nectarCard = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'issueNo' field.
      * @return The value.
      */
    public java.lang.CharSequence getIssueNo() {
      return issueNo;
    }

    /**
      * Sets the value of the 'issueNo' field.
      * @param value The value of 'issueNo'.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder setIssueNo(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.issueNo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'issueNo' field has been set.
      * @return True if the 'issueNo' field has been set, false otherwise.
      */
    public boolean hasIssueNo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'issueNo' field.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder clearIssueNo() {
      issueNo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'pointsAward' field.
      * @return The value.
      */
    public java.lang.Integer getPointsAward() {
      return pointsAward;
    }

    /**
      * Sets the value of the 'pointsAward' field.
      * @param value The value of 'pointsAward'.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder setPointsAward(int value) {
      validate(fields()[2], value);
      this.pointsAward = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'pointsAward' field has been set.
      * @return True if the 'pointsAward' field has been set, false otherwise.
      */
    public boolean hasPointsAward() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'pointsAward' field.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder clearPointsAward() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'includesBonus' field.
      * @return The value.
      */
    public java.lang.Integer getIncludesBonus() {
      return includesBonus;
    }

    /**
      * Sets the value of the 'includesBonus' field.
      * @param value The value of 'includesBonus'.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder setIncludesBonus(int value) {
      validate(fields()[3], value);
      this.includesBonus = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'includesBonus' field has been set.
      * @return True if the 'includesBonus' field has been set, false otherwise.
      */
    public boolean hasIncludesBonus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'includesBonus' field.
      * @return This builder.
      */
    public com.acme.avro.customerLoyalty.Builder clearIncludesBonus() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public customerLoyalty build() {
      try {
        customerLoyalty record = new customerLoyalty();
        record.nectarCard = fieldSetFlags()[0] ? this.nectarCard : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.issueNo = fieldSetFlags()[1] ? this.issueNo : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.pointsAward = fieldSetFlags()[2] ? this.pointsAward : (java.lang.Integer) defaultValue(fields()[2]);
        record.includesBonus = fieldSetFlags()[3] ? this.includesBonus : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<customerLoyalty>
    WRITER$ = (org.apache.avro.io.DatumWriter<customerLoyalty>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<customerLoyalty>
    READER$ = (org.apache.avro.io.DatumReader<customerLoyalty>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
