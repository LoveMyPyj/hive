/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-17")
public class DecimalColumnStatsData implements org.apache.thrift.TBase<DecimalColumnStatsData, DecimalColumnStatsData._Fields>, java.io.Serializable, Cloneable, Comparable<DecimalColumnStatsData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DecimalColumnStatsData");

  private static final org.apache.thrift.protocol.TField LOW_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("lowValue", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HIGH_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("highValue", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("numNulls", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField NUM_DVS_FIELD_DESC = new org.apache.thrift.protocol.TField("numDVs", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DecimalColumnStatsDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DecimalColumnStatsDataTupleSchemeFactory());
  }

  private Decimal lowValue; // optional
  private Decimal highValue; // optional
  private long numNulls; // required
  private long numDVs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOW_VALUE((short)1, "lowValue"),
    HIGH_VALUE((short)2, "highValue"),
    NUM_NULLS((short)3, "numNulls"),
    NUM_DVS((short)4, "numDVs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOW_VALUE
          return LOW_VALUE;
        case 2: // HIGH_VALUE
          return HIGH_VALUE;
        case 3: // NUM_NULLS
          return NUM_NULLS;
        case 4: // NUM_DVS
          return NUM_DVS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUMNULLS_ISSET_ID = 0;
  private static final int __NUMDVS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LOW_VALUE,_Fields.HIGH_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOW_VALUE, new org.apache.thrift.meta_data.FieldMetaData("lowValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Decimal.class)));
    tmpMap.put(_Fields.HIGH_VALUE, new org.apache.thrift.meta_data.FieldMetaData("highValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Decimal.class)));
    tmpMap.put(_Fields.NUM_NULLS, new org.apache.thrift.meta_data.FieldMetaData("numNulls", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_DVS, new org.apache.thrift.meta_data.FieldMetaData("numDVs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DecimalColumnStatsData.class, metaDataMap);
  }

  public DecimalColumnStatsData() {
  }

  public DecimalColumnStatsData(
    long numNulls,
    long numDVs)
  {
    this();
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
    this.numDVs = numDVs;
    setNumDVsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DecimalColumnStatsData(DecimalColumnStatsData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLowValue()) {
      this.lowValue = new Decimal(other.lowValue);
    }
    if (other.isSetHighValue()) {
      this.highValue = new Decimal(other.highValue);
    }
    this.numNulls = other.numNulls;
    this.numDVs = other.numDVs;
  }

  public DecimalColumnStatsData deepCopy() {
    return new DecimalColumnStatsData(this);
  }

  @Override
  public void clear() {
    this.lowValue = null;
    this.highValue = null;
    setNumNullsIsSet(false);
    this.numNulls = 0;
    setNumDVsIsSet(false);
    this.numDVs = 0;
  }

  public Decimal getLowValue() {
    return this.lowValue;
  }

  public void setLowValue(Decimal lowValue) {
    this.lowValue = lowValue;
  }

  public void unsetLowValue() {
    this.lowValue = null;
  }

  /** Returns true if field lowValue is set (has been assigned a value) and false otherwise */
  public boolean isSetLowValue() {
    return this.lowValue != null;
  }

  public void setLowValueIsSet(boolean value) {
    if (!value) {
      this.lowValue = null;
    }
  }

  public Decimal getHighValue() {
    return this.highValue;
  }

  public void setHighValue(Decimal highValue) {
    this.highValue = highValue;
  }

  public void unsetHighValue() {
    this.highValue = null;
  }

  /** Returns true if field highValue is set (has been assigned a value) and false otherwise */
  public boolean isSetHighValue() {
    return this.highValue != null;
  }

  public void setHighValueIsSet(boolean value) {
    if (!value) {
      this.highValue = null;
    }
  }

  public long getNumNulls() {
    return this.numNulls;
  }

  public void setNumNulls(long numNulls) {
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
  }

  public void unsetNumNulls() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  /** Returns true if field numNulls is set (has been assigned a value) and false otherwise */
  public boolean isSetNumNulls() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  public void setNumNullsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMNULLS_ISSET_ID, value);
  }

  public long getNumDVs() {
    return this.numDVs;
  }

  public void setNumDVs(long numDVs) {
    this.numDVs = numDVs;
    setNumDVsIsSet(true);
  }

  public void unsetNumDVs() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMDVS_ISSET_ID);
  }

  /** Returns true if field numDVs is set (has been assigned a value) and false otherwise */
  public boolean isSetNumDVs() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMDVS_ISSET_ID);
  }

  public void setNumDVsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMDVS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOW_VALUE:
      if (value == null) {
        unsetLowValue();
      } else {
        setLowValue((Decimal)value);
      }
      break;

    case HIGH_VALUE:
      if (value == null) {
        unsetHighValue();
      } else {
        setHighValue((Decimal)value);
      }
      break;

    case NUM_NULLS:
      if (value == null) {
        unsetNumNulls();
      } else {
        setNumNulls((Long)value);
      }
      break;

    case NUM_DVS:
      if (value == null) {
        unsetNumDVs();
      } else {
        setNumDVs((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOW_VALUE:
      return getLowValue();

    case HIGH_VALUE:
      return getHighValue();

    case NUM_NULLS:
      return Long.valueOf(getNumNulls());

    case NUM_DVS:
      return Long.valueOf(getNumDVs());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOW_VALUE:
      return isSetLowValue();
    case HIGH_VALUE:
      return isSetHighValue();
    case NUM_NULLS:
      return isSetNumNulls();
    case NUM_DVS:
      return isSetNumDVs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DecimalColumnStatsData)
      return this.equals((DecimalColumnStatsData)that);
    return false;
  }

  public boolean equals(DecimalColumnStatsData that) {
    if (that == null)
      return false;

    boolean this_present_lowValue = true && this.isSetLowValue();
    boolean that_present_lowValue = true && that.isSetLowValue();
    if (this_present_lowValue || that_present_lowValue) {
      if (!(this_present_lowValue && that_present_lowValue))
        return false;
      if (!this.lowValue.equals(that.lowValue))
        return false;
    }

    boolean this_present_highValue = true && this.isSetHighValue();
    boolean that_present_highValue = true && that.isSetHighValue();
    if (this_present_highValue || that_present_highValue) {
      if (!(this_present_highValue && that_present_highValue))
        return false;
      if (!this.highValue.equals(that.highValue))
        return false;
    }

    boolean this_present_numNulls = true;
    boolean that_present_numNulls = true;
    if (this_present_numNulls || that_present_numNulls) {
      if (!(this_present_numNulls && that_present_numNulls))
        return false;
      if (this.numNulls != that.numNulls)
        return false;
    }

    boolean this_present_numDVs = true;
    boolean that_present_numDVs = true;
    if (this_present_numDVs || that_present_numDVs) {
      if (!(this_present_numDVs && that_present_numDVs))
        return false;
      if (this.numDVs != that.numDVs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_lowValue = true && (isSetLowValue());
    list.add(present_lowValue);
    if (present_lowValue)
      list.add(lowValue);

    boolean present_highValue = true && (isSetHighValue());
    list.add(present_highValue);
    if (present_highValue)
      list.add(highValue);

    boolean present_numNulls = true;
    list.add(present_numNulls);
    if (present_numNulls)
      list.add(numNulls);

    boolean present_numDVs = true;
    list.add(present_numDVs);
    if (present_numDVs)
      list.add(numDVs);

    return list.hashCode();
  }

  @Override
  public int compareTo(DecimalColumnStatsData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLowValue()).compareTo(other.isSetLowValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLowValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lowValue, other.lowValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHighValue()).compareTo(other.isSetHighValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHighValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.highValue, other.highValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumNulls()).compareTo(other.isSetNumNulls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumNulls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numNulls, other.numNulls);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumDVs()).compareTo(other.isSetNumDVs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumDVs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numDVs, other.numDVs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DecimalColumnStatsData(");
    boolean first = true;

    if (isSetLowValue()) {
      sb.append("lowValue:");
      if (this.lowValue == null) {
        sb.append("null");
      } else {
        sb.append(this.lowValue);
      }
      first = false;
    }
    if (isSetHighValue()) {
      if (!first) sb.append(", ");
      sb.append("highValue:");
      if (this.highValue == null) {
        sb.append("null");
      } else {
        sb.append(this.highValue);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("numNulls:");
    sb.append(this.numNulls);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numDVs:");
    sb.append(this.numDVs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNumNulls()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numNulls' is unset! Struct:" + toString());
    }

    if (!isSetNumDVs()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numDVs' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (lowValue != null) {
      lowValue.validate();
    }
    if (highValue != null) {
      highValue.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DecimalColumnStatsDataStandardSchemeFactory implements SchemeFactory {
    public DecimalColumnStatsDataStandardScheme getScheme() {
      return new DecimalColumnStatsDataStandardScheme();
    }
  }

  private static class DecimalColumnStatsDataStandardScheme extends StandardScheme<DecimalColumnStatsData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DecimalColumnStatsData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOW_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.lowValue = new Decimal();
              struct.lowValue.read(iprot);
              struct.setLowValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HIGH_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.highValue = new Decimal();
              struct.highValue.read(iprot);
              struct.setHighValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_NULLS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numNulls = iprot.readI64();
              struct.setNumNullsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NUM_DVS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numDVs = iprot.readI64();
              struct.setNumDVsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DecimalColumnStatsData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.lowValue != null) {
        if (struct.isSetLowValue()) {
          oprot.writeFieldBegin(LOW_VALUE_FIELD_DESC);
          struct.lowValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.highValue != null) {
        if (struct.isSetHighValue()) {
          oprot.writeFieldBegin(HIGH_VALUE_FIELD_DESC);
          struct.highValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(NUM_NULLS_FIELD_DESC);
      oprot.writeI64(struct.numNulls);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_DVS_FIELD_DESC);
      oprot.writeI64(struct.numDVs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DecimalColumnStatsDataTupleSchemeFactory implements SchemeFactory {
    public DecimalColumnStatsDataTupleScheme getScheme() {
      return new DecimalColumnStatsDataTupleScheme();
    }
  }

  private static class DecimalColumnStatsDataTupleScheme extends TupleScheme<DecimalColumnStatsData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DecimalColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.numNulls);
      oprot.writeI64(struct.numDVs);
      BitSet optionals = new BitSet();
      if (struct.isSetLowValue()) {
        optionals.set(0);
      }
      if (struct.isSetHighValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLowValue()) {
        struct.lowValue.write(oprot);
      }
      if (struct.isSetHighValue()) {
        struct.highValue.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DecimalColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.numNulls = iprot.readI64();
      struct.setNumNullsIsSet(true);
      struct.numDVs = iprot.readI64();
      struct.setNumDVsIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.lowValue = new Decimal();
        struct.lowValue.read(iprot);
        struct.setLowValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.highValue = new Decimal();
        struct.highValue.read(iprot);
        struct.setHighValueIsSet(true);
      }
    }
  }

}

