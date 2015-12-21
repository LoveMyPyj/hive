/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.serde2.thrift.test;

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
public class MiniStruct implements org.apache.thrift.TBase<MiniStruct, MiniStruct._Fields>, java.io.Serializable, Cloneable, Comparable<MiniStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MiniStruct");

  private static final org.apache.thrift.protocol.TField MY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("my_string", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MY_ENUM_FIELD_DESC = new org.apache.thrift.protocol.TField("my_enum", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MiniStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MiniStructTupleSchemeFactory());
  }

  private String my_string; // optional
  private MyEnum my_enum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MY_STRING((short)1, "my_string"),
    /**
     * 
     * @see MyEnum
     */
    MY_ENUM((short)2, "my_enum");

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
        case 1: // MY_STRING
          return MY_STRING;
        case 2: // MY_ENUM
          return MY_ENUM;
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
  private static final _Fields optionals[] = {_Fields.MY_STRING,_Fields.MY_ENUM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MY_STRING, new org.apache.thrift.meta_data.FieldMetaData("my_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MY_ENUM, new org.apache.thrift.meta_data.FieldMetaData("my_enum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MyEnum.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MiniStruct.class, metaDataMap);
  }

  public MiniStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MiniStruct(MiniStruct other) {
    if (other.isSetMy_string()) {
      this.my_string = other.my_string;
    }
    if (other.isSetMy_enum()) {
      this.my_enum = other.my_enum;
    }
  }

  public MiniStruct deepCopy() {
    return new MiniStruct(this);
  }

  @Override
  public void clear() {
    this.my_string = null;
    this.my_enum = null;
  }

  public String getMy_string() {
    return this.my_string;
  }

  public void setMy_string(String my_string) {
    this.my_string = my_string;
  }

  public void unsetMy_string() {
    this.my_string = null;
  }

  /** Returns true if field my_string is set (has been assigned a value) and false otherwise */
  public boolean isSetMy_string() {
    return this.my_string != null;
  }

  public void setMy_stringIsSet(boolean value) {
    if (!value) {
      this.my_string = null;
    }
  }

  /**
   * 
   * @see MyEnum
   */
  public MyEnum getMy_enum() {
    return this.my_enum;
  }

  /**
   * 
   * @see MyEnum
   */
  public void setMy_enum(MyEnum my_enum) {
    this.my_enum = my_enum;
  }

  public void unsetMy_enum() {
    this.my_enum = null;
  }

  /** Returns true if field my_enum is set (has been assigned a value) and false otherwise */
  public boolean isSetMy_enum() {
    return this.my_enum != null;
  }

  public void setMy_enumIsSet(boolean value) {
    if (!value) {
      this.my_enum = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MY_STRING:
      if (value == null) {
        unsetMy_string();
      } else {
        setMy_string((String)value);
      }
      break;

    case MY_ENUM:
      if (value == null) {
        unsetMy_enum();
      } else {
        setMy_enum((MyEnum)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MY_STRING:
      return getMy_string();

    case MY_ENUM:
      return getMy_enum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MY_STRING:
      return isSetMy_string();
    case MY_ENUM:
      return isSetMy_enum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MiniStruct)
      return this.equals((MiniStruct)that);
    return false;
  }

  public boolean equals(MiniStruct that) {
    if (that == null)
      return false;

    boolean this_present_my_string = true && this.isSetMy_string();
    boolean that_present_my_string = true && that.isSetMy_string();
    if (this_present_my_string || that_present_my_string) {
      if (!(this_present_my_string && that_present_my_string))
        return false;
      if (!this.my_string.equals(that.my_string))
        return false;
    }

    boolean this_present_my_enum = true && this.isSetMy_enum();
    boolean that_present_my_enum = true && that.isSetMy_enum();
    if (this_present_my_enum || that_present_my_enum) {
      if (!(this_present_my_enum && that_present_my_enum))
        return false;
      if (!this.my_enum.equals(that.my_enum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_my_string = true && (isSetMy_string());
    list.add(present_my_string);
    if (present_my_string)
      list.add(my_string);

    boolean present_my_enum = true && (isSetMy_enum());
    list.add(present_my_enum);
    if (present_my_enum)
      list.add(my_enum.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(MiniStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMy_string()).compareTo(other.isSetMy_string());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMy_string()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.my_string, other.my_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMy_enum()).compareTo(other.isSetMy_enum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMy_enum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.my_enum, other.my_enum);
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
    StringBuilder sb = new StringBuilder("MiniStruct(");
    boolean first = true;

    if (isSetMy_string()) {
      sb.append("my_string:");
      if (this.my_string == null) {
        sb.append("null");
      } else {
        sb.append(this.my_string);
      }
      first = false;
    }
    if (isSetMy_enum()) {
      if (!first) sb.append(", ");
      sb.append("my_enum:");
      if (this.my_enum == null) {
        sb.append("null");
      } else {
        sb.append(this.my_enum);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MiniStructStandardSchemeFactory implements SchemeFactory {
    public MiniStructStandardScheme getScheme() {
      return new MiniStructStandardScheme();
    }
  }

  private static class MiniStructStandardScheme extends StandardScheme<MiniStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MiniStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MY_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.my_string = iprot.readString();
              struct.setMy_stringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MY_ENUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.my_enum = org.apache.hadoop.hive.serde2.thrift.test.MyEnum.findByValue(iprot.readI32());
              struct.setMy_enumIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MiniStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.my_string != null) {
        if (struct.isSetMy_string()) {
          oprot.writeFieldBegin(MY_STRING_FIELD_DESC);
          oprot.writeString(struct.my_string);
          oprot.writeFieldEnd();
        }
      }
      if (struct.my_enum != null) {
        if (struct.isSetMy_enum()) {
          oprot.writeFieldBegin(MY_ENUM_FIELD_DESC);
          oprot.writeI32(struct.my_enum.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MiniStructTupleSchemeFactory implements SchemeFactory {
    public MiniStructTupleScheme getScheme() {
      return new MiniStructTupleScheme();
    }
  }

  private static class MiniStructTupleScheme extends TupleScheme<MiniStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MiniStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMy_string()) {
        optionals.set(0);
      }
      if (struct.isSetMy_enum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMy_string()) {
        oprot.writeString(struct.my_string);
      }
      if (struct.isSetMy_enum()) {
        oprot.writeI32(struct.my_enum.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MiniStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.my_string = iprot.readString();
        struct.setMy_stringIsSet(true);
      }
      if (incoming.get(1)) {
        struct.my_enum = org.apache.hadoop.hive.serde2.thrift.test.MyEnum.findByValue(iprot.readI32());
        struct.setMy_enumIsSet(true);
      }
    }
  }

}

