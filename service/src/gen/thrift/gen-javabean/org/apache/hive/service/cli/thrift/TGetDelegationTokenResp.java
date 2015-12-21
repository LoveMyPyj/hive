/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

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
public class TGetDelegationTokenResp implements org.apache.thrift.TBase<TGetDelegationTokenResp, TGetDelegationTokenResp._Fields>, java.io.Serializable, Cloneable, Comparable<TGetDelegationTokenResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetDelegationTokenResp");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DELEGATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("delegationToken", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetDelegationTokenRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetDelegationTokenRespTupleSchemeFactory());
  }

  private TStatus status; // required
  private String delegationToken; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    DELEGATION_TOKEN((short)2, "delegationToken");

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
        case 1: // STATUS
          return STATUS;
        case 2: // DELEGATION_TOKEN
          return DELEGATION_TOKEN;
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
  private static final _Fields optionals[] = {_Fields.DELEGATION_TOKEN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStatus.class)));
    tmpMap.put(_Fields.DELEGATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("delegationToken", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetDelegationTokenResp.class, metaDataMap);
  }

  public TGetDelegationTokenResp() {
  }

  public TGetDelegationTokenResp(
    TStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetDelegationTokenResp(TGetDelegationTokenResp other) {
    if (other.isSetStatus()) {
      this.status = new TStatus(other.status);
    }
    if (other.isSetDelegationToken()) {
      this.delegationToken = other.delegationToken;
    }
  }

  public TGetDelegationTokenResp deepCopy() {
    return new TGetDelegationTokenResp(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.delegationToken = null;
  }

  public TStatus getStatus() {
    return this.status;
  }

  public void setStatus(TStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public String getDelegationToken() {
    return this.delegationToken;
  }

  public void setDelegationToken(String delegationToken) {
    this.delegationToken = delegationToken;
  }

  public void unsetDelegationToken() {
    this.delegationToken = null;
  }

  /** Returns true if field delegationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetDelegationToken() {
    return this.delegationToken != null;
  }

  public void setDelegationTokenIsSet(boolean value) {
    if (!value) {
      this.delegationToken = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TStatus)value);
      }
      break;

    case DELEGATION_TOKEN:
      if (value == null) {
        unsetDelegationToken();
      } else {
        setDelegationToken((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case DELEGATION_TOKEN:
      return getDelegationToken();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case DELEGATION_TOKEN:
      return isSetDelegationToken();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetDelegationTokenResp)
      return this.equals((TGetDelegationTokenResp)that);
    return false;
  }

  public boolean equals(TGetDelegationTokenResp that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_delegationToken = true && this.isSetDelegationToken();
    boolean that_present_delegationToken = true && that.isSetDelegationToken();
    if (this_present_delegationToken || that_present_delegationToken) {
      if (!(this_present_delegationToken && that_present_delegationToken))
        return false;
      if (!this.delegationToken.equals(that.delegationToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_delegationToken = true && (isSetDelegationToken());
    list.add(present_delegationToken);
    if (present_delegationToken)
      list.add(delegationToken);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetDelegationTokenResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDelegationToken()).compareTo(other.isSetDelegationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelegationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delegationToken, other.delegationToken);
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
    StringBuilder sb = new StringBuilder("TGetDelegationTokenResp(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetDelegationToken()) {
      if (!first) sb.append(", ");
      sb.append("delegationToken:");
      if (this.delegationToken == null) {
        sb.append("null");
      } else {
        sb.append(this.delegationToken);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetDelegationTokenRespStandardSchemeFactory implements SchemeFactory {
    public TGetDelegationTokenRespStandardScheme getScheme() {
      return new TGetDelegationTokenRespStandardScheme();
    }
  }

  private static class TGetDelegationTokenRespStandardScheme extends StandardScheme<TGetDelegationTokenResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetDelegationTokenResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELEGATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.delegationToken = iprot.readString();
              struct.setDelegationTokenIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetDelegationTokenResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.delegationToken != null) {
        if (struct.isSetDelegationToken()) {
          oprot.writeFieldBegin(DELEGATION_TOKEN_FIELD_DESC);
          oprot.writeString(struct.delegationToken);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetDelegationTokenRespTupleSchemeFactory implements SchemeFactory {
    public TGetDelegationTokenRespTupleScheme getScheme() {
      return new TGetDelegationTokenRespTupleScheme();
    }
  }

  private static class TGetDelegationTokenRespTupleScheme extends TupleScheme<TGetDelegationTokenResp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetDelegationTokenResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetDelegationToken()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDelegationToken()) {
        oprot.writeString(struct.delegationToken);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetDelegationTokenResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.delegationToken = iprot.readString();
        struct.setDelegationTokenIsSet(true);
      }
    }
  }

}

