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
public class STSSales extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5046701107684343974L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"STSSales\",\"namespace\":\"com.acme.avro\",\"fields\":[{\"name\":\"partnerMessageId\",\"type\":\"string\"},{\"name\":\"partnerId\",\"type\":\"string\"},{\"name\":\"storeId\",\"type\":\"int\"},{\"name\":\"storeName\",\"type\":\"string\"},{\"name\":\"timeStamp\",\"type\":\"string\"},{\"name\":\"payLoad\",\"type\":{\"type\":\"record\",\"name\":\"payLoad\",\"fields\":[{\"name\":\"workstationId\",\"type\":\"string\"},{\"name\":\"sequenceNumber\",\"type\":\"int\"},{\"name\":\"transaction\",\"type\":{\"type\":\"record\",\"name\":\"transaction\",\"fields\":[{\"name\":\"lineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"lineItems_record\",\"fields\":[{\"name\":\"lineTransType\",\"type\":\"string\"},{\"name\":\"lineType\",\"type\":\"string\"},{\"name\":\"lineSeq\",\"type\":\"int\"},{\"name\":\"posItemId\",\"type\":\"string\"},{\"name\":\"eanNumber\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"jsItemFlag\",\"type\":\"string\"},{\"name\":\"unitPrice\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"string\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"extendedValue\",\"type\":\"string\"},{\"name\":\"returnCode\",\"type\":\"string\"},{\"name\":\"priceModifier\",\"type\":{\"type\":\"record\",\"name\":\"priceModifier\",\"fields\":[{\"name\":\"promotionCode\",\"type\":\"string\"},{\"name\":\"partnerCode\",\"type\":\"string\"},{\"name\":\"promotionDiscount\",\"type\":\"string\"},{\"name\":\"staffDiscount\",\"type\":\"string\"},{\"name\":\"newPrice\",\"type\":\"string\"},{\"name\":\"promotionType\",\"type\":\"string\"},{\"name\":\"promotionDescription\",\"type\":\"string\"}]}},{\"name\":\"source\",\"type\":\"string\"},{\"name\":\"consumableGroup\",\"type\":\"string\"},{\"name\":\"hierarchy\",\"type\":{\"type\":\"record\",\"name\":\"hierarchy\",\"fields\":[{\"name\":\"groupId\",\"type\":\"string\"},{\"name\":\"subcategoryId\",\"type\":\"string\"},{\"name\":\"categoryId\",\"type\":\"string\"}]}},{\"name\":\"scanData\",\"type\":\"string\"},{\"name\":\"startDateTime\",\"type\":\"string\"},{\"name\":\"endDateTime\",\"type\":\"string\"}]}}},{\"name\":\"tenderTypes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"tenderTypes_record\",\"fields\":[{\"name\":\"tenderType\",\"type\":\"string\"},{\"name\":\"lineSeq\",\"type\":\"int\"},{\"name\":\"amount\",\"type\":\"string\"},{\"name\":\"startDateTime\",\"type\":\"string\"},{\"name\":\"endDateTime\",\"type\":\"string\"}]}}},{\"name\":\"promotionRedemption\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"promotionRedemption_record\",\"fields\":[{\"name\":\"promotionCode\",\"type\":\"string\"},{\"name\":\"partnerCode\",\"type\":\"string\"},{\"name\":\"redemptionQuantity\",\"type\":\"int\"}]}}}]}},{\"name\":\"tradingDayDate\",\"type\":\"string\"},{\"name\":\"customerLoyalty\",\"type\":{\"type\":\"record\",\"name\":\"customerLoyalty\",\"fields\":[{\"name\":\"nectarCard\",\"type\":\"string\"},{\"name\":\"issueNo\",\"type\":\"string\"},{\"name\":\"pointsAward\",\"type\":\"int\"},{\"name\":\"includesBonus\",\"type\":\"int\"}]}},{\"name\":\"staffDiscount\",\"type\":{\"type\":\"record\",\"name\":\"staffDiscount\",\"fields\":[{\"name\":\"staffDiscountCard\",\"type\":\"string\"},{\"name\":\"qualifyingSpend\",\"type\":\"string\"},{\"name\":\"discountRate\",\"type\":\"string\"}]}},{\"name\":\"transactionLink\",\"type\":{\"type\":\"record\",\"name\":\"transactionLink\",\"fields\":[{\"name\":\"linkStoreId\",\"type\":\"string\"},{\"name\":\"linkWorkstationId\",\"type\":\"string\"},{\"name\":\"linkDate\",\"type\":\"string\"},{\"name\":\"linkSequenceNumber\",\"type\":\"int\"}]}},{\"name\":\"totalvalue\",\"type\":\"string\"},{\"name\":\"totalGrossAmount\",\"type\":\"string\"},{\"name\":\"totalNetAmount\",\"type\":\"string\"},{\"name\":\"totalQuantity\",\"type\":\"string\"},{\"name\":\"startTransDateTime\",\"type\":\"string\"},{\"name\":\"endTransDateTime\",\"type\":\"string\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<STSSales> ENCODER =
      new BinaryMessageEncoder<STSSales>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<STSSales> DECODER =
      new BinaryMessageDecoder<STSSales>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<STSSales> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<STSSales> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<STSSales>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this STSSales to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a STSSales from a ByteBuffer. */
  public static STSSales fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence partnerMessageId;
  @Deprecated public java.lang.CharSequence partnerId;
  @Deprecated public int storeId;
  @Deprecated public java.lang.CharSequence storeName;
  @Deprecated public java.lang.CharSequence timeStamp;
  @Deprecated public com.acme.avro.payLoad payLoad;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public STSSales() {}

  /**
   * All-args constructor.
   * @param partnerMessageId The new value for partnerMessageId
   * @param partnerId The new value for partnerId
   * @param storeId The new value for storeId
   * @param storeName The new value for storeName
   * @param timeStamp The new value for timeStamp
   * @param payLoad The new value for payLoad
   */
  public STSSales(java.lang.CharSequence partnerMessageId, java.lang.CharSequence partnerId, java.lang.Integer storeId, java.lang.CharSequence storeName, java.lang.CharSequence timeStamp, com.acme.avro.payLoad payLoad) {
    this.partnerMessageId = partnerMessageId;
    this.partnerId = partnerId;
    this.storeId = storeId;
    this.storeName = storeName;
    this.timeStamp = timeStamp;
    this.payLoad = payLoad;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return partnerMessageId;
    case 1: return partnerId;
    case 2: return storeId;
    case 3: return storeName;
    case 4: return timeStamp;
    case 5: return payLoad;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: partnerMessageId = (java.lang.CharSequence)value$; break;
    case 1: partnerId = (java.lang.CharSequence)value$; break;
    case 2: storeId = (java.lang.Integer)value$; break;
    case 3: storeName = (java.lang.CharSequence)value$; break;
    case 4: timeStamp = (java.lang.CharSequence)value$; break;
    case 5: payLoad = (com.acme.avro.payLoad)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'partnerMessageId' field.
   * @return The value of the 'partnerMessageId' field.
   */
  public java.lang.CharSequence getPartnerMessageId() {
    return partnerMessageId;
  }

  /**
   * Sets the value of the 'partnerMessageId' field.
   * @param value the value to set.
   */
  public void setPartnerMessageId(java.lang.CharSequence value) {
    this.partnerMessageId = value;
  }

  /**
   * Gets the value of the 'partnerId' field.
   * @return The value of the 'partnerId' field.
   */
  public java.lang.CharSequence getPartnerId() {
    return partnerId;
  }

  /**
   * Sets the value of the 'partnerId' field.
   * @param value the value to set.
   */
  public void setPartnerId(java.lang.CharSequence value) {
    this.partnerId = value;
  }

  /**
   * Gets the value of the 'storeId' field.
   * @return The value of the 'storeId' field.
   */
  public java.lang.Integer getStoreId() {
    return storeId;
  }

  /**
   * Sets the value of the 'storeId' field.
   * @param value the value to set.
   */
  public void setStoreId(java.lang.Integer value) {
    this.storeId = value;
  }

  /**
   * Gets the value of the 'storeName' field.
   * @return The value of the 'storeName' field.
   */
  public java.lang.CharSequence getStoreName() {
    return storeName;
  }

  /**
   * Sets the value of the 'storeName' field.
   * @param value the value to set.
   */
  public void setStoreName(java.lang.CharSequence value) {
    this.storeName = value;
  }

  /**
   * Gets the value of the 'timeStamp' field.
   * @return The value of the 'timeStamp' field.
   */
  public java.lang.CharSequence getTimeStamp() {
    return timeStamp;
  }

  /**
   * Sets the value of the 'timeStamp' field.
   * @param value the value to set.
   */
  public void setTimeStamp(java.lang.CharSequence value) {
    this.timeStamp = value;
  }

  /**
   * Gets the value of the 'payLoad' field.
   * @return The value of the 'payLoad' field.
   */
  public com.acme.avro.payLoad getPayLoad() {
    return payLoad;
  }

  /**
   * Sets the value of the 'payLoad' field.
   * @param value the value to set.
   */
  public void setPayLoad(com.acme.avro.payLoad value) {
    this.payLoad = value;
  }

  /**
   * Creates a new STSSales RecordBuilder.
   * @return A new STSSales RecordBuilder
   */
  public static com.acme.avro.STSSales.Builder newBuilder() {
    return new com.acme.avro.STSSales.Builder();
  }

  /**
   * Creates a new STSSales RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new STSSales RecordBuilder
   */
  public static com.acme.avro.STSSales.Builder newBuilder(com.acme.avro.STSSales.Builder other) {
    return new com.acme.avro.STSSales.Builder(other);
  }

  /**
   * Creates a new STSSales RecordBuilder by copying an existing STSSales instance.
   * @param other The existing instance to copy.
   * @return A new STSSales RecordBuilder
   */
  public static com.acme.avro.STSSales.Builder newBuilder(com.acme.avro.STSSales other) {
    return new com.acme.avro.STSSales.Builder(other);
  }

  /**
   * RecordBuilder for STSSales instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<STSSales>
    implements org.apache.avro.data.RecordBuilder<STSSales> {

    private java.lang.CharSequence partnerMessageId;
    private java.lang.CharSequence partnerId;
    private int storeId;
    private java.lang.CharSequence storeName;
    private java.lang.CharSequence timeStamp;
    private com.acme.avro.payLoad payLoad;
    private com.acme.avro.payLoad.Builder payLoadBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.acme.avro.STSSales.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.partnerMessageId)) {
        this.partnerMessageId = data().deepCopy(fields()[0].schema(), other.partnerMessageId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partnerId)) {
        this.partnerId = data().deepCopy(fields()[1].schema(), other.partnerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.storeId)) {
        this.storeId = data().deepCopy(fields()[2].schema(), other.storeId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.storeName)) {
        this.storeName = data().deepCopy(fields()[3].schema(), other.storeName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timeStamp)) {
        this.timeStamp = data().deepCopy(fields()[4].schema(), other.timeStamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.payLoad)) {
        this.payLoad = data().deepCopy(fields()[5].schema(), other.payLoad);
        fieldSetFlags()[5] = true;
      }
      if (other.hasPayLoadBuilder()) {
        this.payLoadBuilder = com.acme.avro.payLoad.newBuilder(other.getPayLoadBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing STSSales instance
     * @param other The existing instance to copy.
     */
    private Builder(com.acme.avro.STSSales other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.partnerMessageId)) {
        this.partnerMessageId = data().deepCopy(fields()[0].schema(), other.partnerMessageId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partnerId)) {
        this.partnerId = data().deepCopy(fields()[1].schema(), other.partnerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.storeId)) {
        this.storeId = data().deepCopy(fields()[2].schema(), other.storeId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.storeName)) {
        this.storeName = data().deepCopy(fields()[3].schema(), other.storeName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timeStamp)) {
        this.timeStamp = data().deepCopy(fields()[4].schema(), other.timeStamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.payLoad)) {
        this.payLoad = data().deepCopy(fields()[5].schema(), other.payLoad);
        fieldSetFlags()[5] = true;
      }
      this.payLoadBuilder = null;
    }

    /**
      * Gets the value of the 'partnerMessageId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPartnerMessageId() {
      return partnerMessageId;
    }

    /**
      * Sets the value of the 'partnerMessageId' field.
      * @param value The value of 'partnerMessageId'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setPartnerMessageId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.partnerMessageId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'partnerMessageId' field has been set.
      * @return True if the 'partnerMessageId' field has been set, false otherwise.
      */
    public boolean hasPartnerMessageId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'partnerMessageId' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearPartnerMessageId() {
      partnerMessageId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'partnerId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPartnerId() {
      return partnerId;
    }

    /**
      * Sets the value of the 'partnerId' field.
      * @param value The value of 'partnerId'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setPartnerId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.partnerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'partnerId' field has been set.
      * @return True if the 'partnerId' field has been set, false otherwise.
      */
    public boolean hasPartnerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'partnerId' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearPartnerId() {
      partnerId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeId' field.
      * @return The value.
      */
    public java.lang.Integer getStoreId() {
      return storeId;
    }

    /**
      * Sets the value of the 'storeId' field.
      * @param value The value of 'storeId'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setStoreId(int value) {
      validate(fields()[2], value);
      this.storeId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'storeId' field has been set.
      * @return True if the 'storeId' field has been set, false otherwise.
      */
    public boolean hasStoreId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'storeId' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearStoreId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStoreName() {
      return storeName;
    }

    /**
      * Sets the value of the 'storeName' field.
      * @param value The value of 'storeName'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setStoreName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.storeName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'storeName' field has been set.
      * @return True if the 'storeName' field has been set, false otherwise.
      */
    public boolean hasStoreName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'storeName' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearStoreName() {
      storeName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeStamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getTimeStamp() {
      return timeStamp;
    }

    /**
      * Sets the value of the 'timeStamp' field.
      * @param value The value of 'timeStamp'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setTimeStamp(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.timeStamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timeStamp' field has been set.
      * @return True if the 'timeStamp' field has been set, false otherwise.
      */
    public boolean hasTimeStamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timeStamp' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearTimeStamp() {
      timeStamp = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'payLoad' field.
      * @return The value.
      */
    public com.acme.avro.payLoad getPayLoad() {
      return payLoad;
    }

    /**
      * Sets the value of the 'payLoad' field.
      * @param value The value of 'payLoad'.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder setPayLoad(com.acme.avro.payLoad value) {
      validate(fields()[5], value);
      this.payLoadBuilder = null;
      this.payLoad = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'payLoad' field has been set.
      * @return True if the 'payLoad' field has been set, false otherwise.
      */
    public boolean hasPayLoad() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'payLoad' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.acme.avro.payLoad.Builder getPayLoadBuilder() {
      if (payLoadBuilder == null) {
        if (hasPayLoad()) {
          setPayLoadBuilder(com.acme.avro.payLoad.newBuilder(payLoad));
        } else {
          setPayLoadBuilder(com.acme.avro.payLoad.newBuilder());
        }
      }
      return payLoadBuilder;
    }

    /**
     * Sets the Builder instance for the 'payLoad' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.acme.avro.STSSales.Builder setPayLoadBuilder(com.acme.avro.payLoad.Builder value) {
      clearPayLoad();
      payLoadBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payLoad' field has an active Builder instance
     * @return True if the 'payLoad' field has an active Builder instance
     */
    public boolean hasPayLoadBuilder() {
      return payLoadBuilder != null;
    }

    /**
      * Clears the value of the 'payLoad' field.
      * @return This builder.
      */
    public com.acme.avro.STSSales.Builder clearPayLoad() {
      payLoad = null;
      payLoadBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public STSSales build() {
      try {
        STSSales record = new STSSales();
        record.partnerMessageId = fieldSetFlags()[0] ? this.partnerMessageId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.partnerId = fieldSetFlags()[1] ? this.partnerId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.storeId = fieldSetFlags()[2] ? this.storeId : (java.lang.Integer) defaultValue(fields()[2]);
        record.storeName = fieldSetFlags()[3] ? this.storeName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.timeStamp = fieldSetFlags()[4] ? this.timeStamp : (java.lang.CharSequence) defaultValue(fields()[4]);
        if (payLoadBuilder != null) {
          record.payLoad = this.payLoadBuilder.build();
        } else {
          record.payLoad = fieldSetFlags()[5] ? this.payLoad : (com.acme.avro.payLoad) defaultValue(fields()[5]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<STSSales>
    WRITER$ = (org.apache.avro.io.DatumWriter<STSSales>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<STSSales>
    READER$ = (org.apache.avro.io.DatumReader<STSSales>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
