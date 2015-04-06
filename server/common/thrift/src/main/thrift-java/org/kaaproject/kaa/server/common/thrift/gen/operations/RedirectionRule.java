/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-6")
public class RedirectionRule implements org.apache.thrift.TBase<RedirectionRule, RedirectionRule._Fields>, java.io.Serializable, Cloneable, Comparable<RedirectionRule> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RedirectionRule");

  private static final org.apache.thrift.protocol.TField ACCESS_POINT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("accessPointId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RULE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField REDIRECTION_PROBABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("redirectionProbability", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField RULE_TTL_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleTTL", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RedirectionRuleStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RedirectionRuleTupleSchemeFactory());
  }

  public int accessPointId; // required
  public long ruleId; // required
  public double redirectionProbability; // required
  public long ruleTTL; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACCESS_POINT_ID((short)1, "accessPointId"),
    RULE_ID((short)2, "ruleId"),
    REDIRECTION_PROBABILITY((short)3, "redirectionProbability"),
    RULE_TTL((short)4, "ruleTTL");

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
        case 1: // ACCESS_POINT_ID
          return ACCESS_POINT_ID;
        case 2: // RULE_ID
          return RULE_ID;
        case 3: // REDIRECTION_PROBABILITY
          return REDIRECTION_PROBABILITY;
        case 4: // RULE_TTL
          return RULE_TTL;
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
  private static final int __ACCESSPOINTID_ISSET_ID = 0;
  private static final int __RULEID_ISSET_ID = 1;
  private static final int __REDIRECTIONPROBABILITY_ISSET_ID = 2;
  private static final int __RULETTL_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACCESS_POINT_ID, new org.apache.thrift.meta_data.FieldMetaData("accessPointId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Integer")));
    tmpMap.put(_Fields.RULE_ID, new org.apache.thrift.meta_data.FieldMetaData("ruleId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Long")));
    tmpMap.put(_Fields.REDIRECTION_PROBABILITY, new org.apache.thrift.meta_data.FieldMetaData("redirectionProbability", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE        , "probability")));
    tmpMap.put(_Fields.RULE_TTL, new org.apache.thrift.meta_data.FieldMetaData("ruleTTL", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Long")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RedirectionRule.class, metaDataMap);
  }

  public RedirectionRule() {
  }

  public RedirectionRule(
    int accessPointId,
    long ruleId,
    double redirectionProbability,
    long ruleTTL)
  {
    this();
    this.accessPointId = accessPointId;
    setAccessPointIdIsSet(true);
    this.ruleId = ruleId;
    setRuleIdIsSet(true);
    this.redirectionProbability = redirectionProbability;
    setRedirectionProbabilityIsSet(true);
    this.ruleTTL = ruleTTL;
    setRuleTTLIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RedirectionRule(RedirectionRule other) {
    __isset_bitfield = other.__isset_bitfield;
    this.accessPointId = other.accessPointId;
    this.ruleId = other.ruleId;
    this.redirectionProbability = other.redirectionProbability;
    this.ruleTTL = other.ruleTTL;
  }

  public RedirectionRule deepCopy() {
    return new RedirectionRule(this);
  }

  @Override
  public void clear() {
    setAccessPointIdIsSet(false);
    this.accessPointId = 0;
    setRuleIdIsSet(false);
    this.ruleId = 0;
    setRedirectionProbabilityIsSet(false);
    this.redirectionProbability = 0.0;
    setRuleTTLIsSet(false);
    this.ruleTTL = 0;
  }

  public int getAccessPointId() {
    return this.accessPointId;
  }

  public RedirectionRule setAccessPointId(int accessPointId) {
    this.accessPointId = accessPointId;
    setAccessPointIdIsSet(true);
    return this;
  }

  public void unsetAccessPointId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACCESSPOINTID_ISSET_ID);
  }

  /** Returns true if field accessPointId is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessPointId() {
    return EncodingUtils.testBit(__isset_bitfield, __ACCESSPOINTID_ISSET_ID);
  }

  public void setAccessPointIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACCESSPOINTID_ISSET_ID, value);
  }

  public long getRuleId() {
    return this.ruleId;
  }

  public RedirectionRule setRuleId(long ruleId) {
    this.ruleId = ruleId;
    setRuleIdIsSet(true);
    return this;
  }

  public void unsetRuleId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RULEID_ISSET_ID);
  }

  /** Returns true if field ruleId is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleId() {
    return EncodingUtils.testBit(__isset_bitfield, __RULEID_ISSET_ID);
  }

  public void setRuleIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RULEID_ISSET_ID, value);
  }

  public double getRedirectionProbability() {
    return this.redirectionProbability;
  }

  public RedirectionRule setRedirectionProbability(double redirectionProbability) {
    this.redirectionProbability = redirectionProbability;
    setRedirectionProbabilityIsSet(true);
    return this;
  }

  public void unsetRedirectionProbability() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REDIRECTIONPROBABILITY_ISSET_ID);
  }

  /** Returns true if field redirectionProbability is set (has been assigned a value) and false otherwise */
  public boolean isSetRedirectionProbability() {
    return EncodingUtils.testBit(__isset_bitfield, __REDIRECTIONPROBABILITY_ISSET_ID);
  }

  public void setRedirectionProbabilityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REDIRECTIONPROBABILITY_ISSET_ID, value);
  }

  public long getRuleTTL() {
    return this.ruleTTL;
  }

  public RedirectionRule setRuleTTL(long ruleTTL) {
    this.ruleTTL = ruleTTL;
    setRuleTTLIsSet(true);
    return this;
  }

  public void unsetRuleTTL() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RULETTL_ISSET_ID);
  }

  /** Returns true if field ruleTTL is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleTTL() {
    return EncodingUtils.testBit(__isset_bitfield, __RULETTL_ISSET_ID);
  }

  public void setRuleTTLIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RULETTL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACCESS_POINT_ID:
      if (value == null) {
        unsetAccessPointId();
      } else {
        setAccessPointId((Integer)value);
      }
      break;

    case RULE_ID:
      if (value == null) {
        unsetRuleId();
      } else {
        setRuleId((Long)value);
      }
      break;

    case REDIRECTION_PROBABILITY:
      if (value == null) {
        unsetRedirectionProbability();
      } else {
        setRedirectionProbability((Double)value);
      }
      break;

    case RULE_TTL:
      if (value == null) {
        unsetRuleTTL();
      } else {
        setRuleTTL((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCESS_POINT_ID:
      return Integer.valueOf(getAccessPointId());

    case RULE_ID:
      return Long.valueOf(getRuleId());

    case REDIRECTION_PROBABILITY:
      return Double.valueOf(getRedirectionProbability());

    case RULE_TTL:
      return Long.valueOf(getRuleTTL());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACCESS_POINT_ID:
      return isSetAccessPointId();
    case RULE_ID:
      return isSetRuleId();
    case REDIRECTION_PROBABILITY:
      return isSetRedirectionProbability();
    case RULE_TTL:
      return isSetRuleTTL();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RedirectionRule)
      return this.equals((RedirectionRule)that);
    return false;
  }

  public boolean equals(RedirectionRule that) {
    if (that == null)
      return false;

    boolean this_present_accessPointId = true;
    boolean that_present_accessPointId = true;
    if (this_present_accessPointId || that_present_accessPointId) {
      if (!(this_present_accessPointId && that_present_accessPointId))
        return false;
      if (this.accessPointId != that.accessPointId)
        return false;
    }

    boolean this_present_ruleId = true;
    boolean that_present_ruleId = true;
    if (this_present_ruleId || that_present_ruleId) {
      if (!(this_present_ruleId && that_present_ruleId))
        return false;
      if (this.ruleId != that.ruleId)
        return false;
    }

    boolean this_present_redirectionProbability = true;
    boolean that_present_redirectionProbability = true;
    if (this_present_redirectionProbability || that_present_redirectionProbability) {
      if (!(this_present_redirectionProbability && that_present_redirectionProbability))
        return false;
      if (this.redirectionProbability != that.redirectionProbability)
        return false;
    }

    boolean this_present_ruleTTL = true;
    boolean that_present_ruleTTL = true;
    if (this_present_ruleTTL || that_present_ruleTTL) {
      if (!(this_present_ruleTTL && that_present_ruleTTL))
        return false;
      if (this.ruleTTL != that.ruleTTL)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_accessPointId = true;
    list.add(present_accessPointId);
    if (present_accessPointId)
      list.add(accessPointId);

    boolean present_ruleId = true;
    list.add(present_ruleId);
    if (present_ruleId)
      list.add(ruleId);

    boolean present_redirectionProbability = true;
    list.add(present_redirectionProbability);
    if (present_redirectionProbability)
      list.add(redirectionProbability);

    boolean present_ruleTTL = true;
    list.add(present_ruleTTL);
    if (present_ruleTTL)
      list.add(ruleTTL);

    return list.hashCode();
  }

  @Override
  public int compareTo(RedirectionRule other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccessPointId()).compareTo(other.isSetAccessPointId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessPointId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessPointId, other.accessPointId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRuleId()).compareTo(other.isSetRuleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleId, other.ruleId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRedirectionProbability()).compareTo(other.isSetRedirectionProbability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRedirectionProbability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.redirectionProbability, other.redirectionProbability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRuleTTL()).compareTo(other.isSetRuleTTL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleTTL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleTTL, other.ruleTTL);
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
    StringBuilder sb = new StringBuilder("RedirectionRule(");
    boolean first = true;

    sb.append("accessPointId:");
    sb.append(this.accessPointId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ruleId:");
    sb.append(this.ruleId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("redirectionProbability:");
    sb.append(this.redirectionProbability);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ruleTTL:");
    sb.append(this.ruleTTL);
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RedirectionRuleStandardSchemeFactory implements SchemeFactory {
    public RedirectionRuleStandardScheme getScheme() {
      return new RedirectionRuleStandardScheme();
    }
  }

  private static class RedirectionRuleStandardScheme extends StandardScheme<RedirectionRule> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RedirectionRule struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCESS_POINT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.accessPointId = iprot.readI32();
              struct.setAccessPointIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RULE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ruleId = iprot.readI64();
              struct.setRuleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REDIRECTION_PROBABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.redirectionProbability = iprot.readDouble();
              struct.setRedirectionProbabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RULE_TTL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ruleTTL = iprot.readI64();
              struct.setRuleTTLIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RedirectionRule struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACCESS_POINT_ID_FIELD_DESC);
      oprot.writeI32(struct.accessPointId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RULE_ID_FIELD_DESC);
      oprot.writeI64(struct.ruleId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REDIRECTION_PROBABILITY_FIELD_DESC);
      oprot.writeDouble(struct.redirectionProbability);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RULE_TTL_FIELD_DESC);
      oprot.writeI64(struct.ruleTTL);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RedirectionRuleTupleSchemeFactory implements SchemeFactory {
    public RedirectionRuleTupleScheme getScheme() {
      return new RedirectionRuleTupleScheme();
    }
  }

  private static class RedirectionRuleTupleScheme extends TupleScheme<RedirectionRule> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RedirectionRule struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAccessPointId()) {
        optionals.set(0);
      }
      if (struct.isSetRuleId()) {
        optionals.set(1);
      }
      if (struct.isSetRedirectionProbability()) {
        optionals.set(2);
      }
      if (struct.isSetRuleTTL()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAccessPointId()) {
        oprot.writeI32(struct.accessPointId);
      }
      if (struct.isSetRuleId()) {
        oprot.writeI64(struct.ruleId);
      }
      if (struct.isSetRedirectionProbability()) {
        oprot.writeDouble(struct.redirectionProbability);
      }
      if (struct.isSetRuleTTL()) {
        oprot.writeI64(struct.ruleTTL);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RedirectionRule struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.accessPointId = iprot.readI32();
        struct.setAccessPointIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ruleId = iprot.readI64();
        struct.setRuleIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.redirectionProbability = iprot.readDouble();
        struct.setRedirectionProbabilityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ruleTTL = iprot.readI64();
        struct.setRuleTTLIsSet(true);
      }
    }
  }

}

