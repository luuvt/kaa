/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventClassFamilyVersionInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventClassFamilyVersionInfo\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"version\",\"type\":\"int\"}],\"direction\":\"out\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String name;
   private int version;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EventClassFamilyVersionInfo() {}

  /**
   * All-args constructor.
   */
  public EventClassFamilyVersionInfo(java.lang.String name, java.lang.Integer version) {
    this.name = name;
    this.version = version;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return version;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: version = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /** Creates a new EventClassFamilyVersionInfo RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder();
  }
  
  /** Creates a new EventClassFamilyVersionInfo RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder(other);
  }
  
  /** Creates a new EventClassFamilyVersionInfo RecordBuilder by copying an existing EventClassFamilyVersionInfo instance */
  public static org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo other) {
    return new org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder(other);
  }
  
  /**
   * RecordBuilder for EventClassFamilyVersionInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventClassFamilyVersionInfo>
    implements org.apache.avro.data.RecordBuilder<EventClassFamilyVersionInfo> {

    private java.lang.String name;
    private int version;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EventClassFamilyVersionInfo instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo other) {
            super(org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'version' field */
    public java.lang.Integer getVersion() {
      return version;
    }
    
    /** Sets the value of the 'version' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder setVersion(int value) {
      validate(fields()[1], value);
      this.version = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'version' field has been set */
    public boolean hasVersion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'version' field */
    public org.kaaproject.kaa.common.endpoint.gen.EventClassFamilyVersionInfo.Builder clearVersion() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EventClassFamilyVersionInfo build() {
      try {
        EventClassFamilyVersionInfo record = new EventClassFamilyVersionInfo();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.version = fieldSetFlags()[1] ? this.version : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}