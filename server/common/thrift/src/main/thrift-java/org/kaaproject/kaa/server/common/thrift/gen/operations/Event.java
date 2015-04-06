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
public class Event implements org.apache.thrift.TBase<Event, Event._Fields>, java.io.Serializable, Cloneable, Comparable<Event> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Event");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TENANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ENDPOINT_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointEvent", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ROUTE_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("routeAddress", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EventTupleSchemeFactory());
  }

  public String userId; // required
  public String tenantId; // required
  public EndpointEvent endpointEvent; // required
  public RouteAddress routeAddress; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    TENANT_ID((short)2, "tenantId"),
    ENDPOINT_EVENT((short)3, "endpointEvent"),
    ROUTE_ADDRESS((short)4, "routeAddress");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // TENANT_ID
          return TENANT_ID;
        case 3: // ENDPOINT_EVENT
          return ENDPOINT_EVENT;
        case 4: // ROUTE_ADDRESS
          return ROUTE_ADDRESS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "user_id")));
    tmpMap.put(_Fields.TENANT_ID, new org.apache.thrift.meta_data.FieldMetaData("tenantId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "tenant_id")));
    tmpMap.put(_Fields.ENDPOINT_EVENT, new org.apache.thrift.meta_data.FieldMetaData("endpointEvent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EndpointEvent.class)));
    tmpMap.put(_Fields.ROUTE_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("routeAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RouteAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Event.class, metaDataMap);
  }

  public Event() {
  }

  public Event(
    String userId,
    String tenantId,
    EndpointEvent endpointEvent,
    RouteAddress routeAddress)
  {
    this();
    this.userId = userId;
    this.tenantId = tenantId;
    this.endpointEvent = endpointEvent;
    this.routeAddress = routeAddress;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Event(Event other) {
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetTenantId()) {
      this.tenantId = other.tenantId;
    }
    if (other.isSetEndpointEvent()) {
      this.endpointEvent = new EndpointEvent(other.endpointEvent);
    }
    if (other.isSetRouteAddress()) {
      this.routeAddress = new RouteAddress(other.routeAddress);
    }
  }

  public Event deepCopy() {
    return new Event(this);
  }

  @Override
  public void clear() {
    this.userId = null;
    this.tenantId = null;
    this.endpointEvent = null;
    this.routeAddress = null;
  }

  public String getUserId() {
    return this.userId;
  }

  public Event setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public void unsetUserId() {
    this.userId = null;
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return this.userId != null;
  }

  public void setUserIdIsSet(boolean value) {
    if (!value) {
      this.userId = null;
    }
  }

  public String getTenantId() {
    return this.tenantId;
  }

  public Event setTenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  public void unsetTenantId() {
    this.tenantId = null;
  }

  /** Returns true if field tenantId is set (has been assigned a value) and false otherwise */
  public boolean isSetTenantId() {
    return this.tenantId != null;
  }

  public void setTenantIdIsSet(boolean value) {
    if (!value) {
      this.tenantId = null;
    }
  }

  public EndpointEvent getEndpointEvent() {
    return this.endpointEvent;
  }

  public Event setEndpointEvent(EndpointEvent endpointEvent) {
    this.endpointEvent = endpointEvent;
    return this;
  }

  public void unsetEndpointEvent() {
    this.endpointEvent = null;
  }

  /** Returns true if field endpointEvent is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointEvent() {
    return this.endpointEvent != null;
  }

  public void setEndpointEventIsSet(boolean value) {
    if (!value) {
      this.endpointEvent = null;
    }
  }

  public RouteAddress getRouteAddress() {
    return this.routeAddress;
  }

  public Event setRouteAddress(RouteAddress routeAddress) {
    this.routeAddress = routeAddress;
    return this;
  }

  public void unsetRouteAddress() {
    this.routeAddress = null;
  }

  /** Returns true if field routeAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetRouteAddress() {
    return this.routeAddress != null;
  }

  public void setRouteAddressIsSet(boolean value) {
    if (!value) {
      this.routeAddress = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((String)value);
      }
      break;

    case TENANT_ID:
      if (value == null) {
        unsetTenantId();
      } else {
        setTenantId((String)value);
      }
      break;

    case ENDPOINT_EVENT:
      if (value == null) {
        unsetEndpointEvent();
      } else {
        setEndpointEvent((EndpointEvent)value);
      }
      break;

    case ROUTE_ADDRESS:
      if (value == null) {
        unsetRouteAddress();
      } else {
        setRouteAddress((RouteAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case TENANT_ID:
      return getTenantId();

    case ENDPOINT_EVENT:
      return getEndpointEvent();

    case ROUTE_ADDRESS:
      return getRouteAddress();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case TENANT_ID:
      return isSetTenantId();
    case ENDPOINT_EVENT:
      return isSetEndpointEvent();
    case ROUTE_ADDRESS:
      return isSetRouteAddress();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Event)
      return this.equals((Event)that);
    return false;
  }

  public boolean equals(Event that) {
    if (that == null)
      return false;

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (!this.userId.equals(that.userId))
        return false;
    }

    boolean this_present_tenantId = true && this.isSetTenantId();
    boolean that_present_tenantId = true && that.isSetTenantId();
    if (this_present_tenantId || that_present_tenantId) {
      if (!(this_present_tenantId && that_present_tenantId))
        return false;
      if (!this.tenantId.equals(that.tenantId))
        return false;
    }

    boolean this_present_endpointEvent = true && this.isSetEndpointEvent();
    boolean that_present_endpointEvent = true && that.isSetEndpointEvent();
    if (this_present_endpointEvent || that_present_endpointEvent) {
      if (!(this_present_endpointEvent && that_present_endpointEvent))
        return false;
      if (!this.endpointEvent.equals(that.endpointEvent))
        return false;
    }

    boolean this_present_routeAddress = true && this.isSetRouteAddress();
    boolean that_present_routeAddress = true && that.isSetRouteAddress();
    if (this_present_routeAddress || that_present_routeAddress) {
      if (!(this_present_routeAddress && that_present_routeAddress))
        return false;
      if (!this.routeAddress.equals(that.routeAddress))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_tenantId = true && (isSetTenantId());
    list.add(present_tenantId);
    if (present_tenantId)
      list.add(tenantId);

    boolean present_endpointEvent = true && (isSetEndpointEvent());
    list.add(present_endpointEvent);
    if (present_endpointEvent)
      list.add(endpointEvent);

    boolean present_routeAddress = true && (isSetRouteAddress());
    list.add(present_routeAddress);
    if (present_routeAddress)
      list.add(routeAddress);

    return list.hashCode();
  }

  @Override
  public int compareTo(Event other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTenantId()).compareTo(other.isSetTenantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTenantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tenantId, other.tenantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointEvent()).compareTo(other.isSetEndpointEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointEvent, other.endpointEvent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRouteAddress()).compareTo(other.isSetRouteAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRouteAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.routeAddress, other.routeAddress);
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
    StringBuilder sb = new StringBuilder("Event(");
    boolean first = true;

    sb.append("userId:");
    if (this.userId == null) {
      sb.append("null");
    } else {
      sb.append(this.userId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tenantId:");
    if (this.tenantId == null) {
      sb.append("null");
    } else {
      sb.append(this.tenantId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointEvent:");
    if (this.endpointEvent == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointEvent);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("routeAddress:");
    if (this.routeAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.routeAddress);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (endpointEvent != null) {
      endpointEvent.validate();
    }
    if (routeAddress != null) {
      routeAddress.validate();
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

  private static class EventStandardSchemeFactory implements SchemeFactory {
    public EventStandardScheme getScheme() {
      return new EventStandardScheme();
    }
  }

  private static class EventStandardScheme extends StandardScheme<Event> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Event struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userId = iprot.readString();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TENANT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tenantId = iprot.readString();
              struct.setTenantIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENDPOINT_EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.endpointEvent = new EndpointEvent();
              struct.endpointEvent.read(iprot);
              struct.setEndpointEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROUTE_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.routeAddress = new RouteAddress();
              struct.routeAddress.read(iprot);
              struct.setRouteAddressIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Event struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userId != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.tenantId != null) {
        oprot.writeFieldBegin(TENANT_ID_FIELD_DESC);
        oprot.writeString(struct.tenantId);
        oprot.writeFieldEnd();
      }
      if (struct.endpointEvent != null) {
        oprot.writeFieldBegin(ENDPOINT_EVENT_FIELD_DESC);
        struct.endpointEvent.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.routeAddress != null) {
        oprot.writeFieldBegin(ROUTE_ADDRESS_FIELD_DESC);
        struct.routeAddress.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EventTupleSchemeFactory implements SchemeFactory {
    public EventTupleScheme getScheme() {
      return new EventTupleScheme();
    }
  }

  private static class EventTupleScheme extends TupleScheme<Event> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Event struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetTenantId()) {
        optionals.set(1);
      }
      if (struct.isSetEndpointEvent()) {
        optionals.set(2);
      }
      if (struct.isSetRouteAddress()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserId()) {
        oprot.writeString(struct.userId);
      }
      if (struct.isSetTenantId()) {
        oprot.writeString(struct.tenantId);
      }
      if (struct.isSetEndpointEvent()) {
        struct.endpointEvent.write(oprot);
      }
      if (struct.isSetRouteAddress()) {
        struct.routeAddress.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Event struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.userId = iprot.readString();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tenantId = iprot.readString();
        struct.setTenantIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.endpointEvent = new EndpointEvent();
        struct.endpointEvent.read(iprot);
        struct.setEndpointEventIsSet(true);
      }
      if (incoming.get(3)) {
        struct.routeAddress = new RouteAddress();
        struct.routeAddress.read(iprot);
        struct.setRouteAddressIsSet(true);
      }
    }
  }

}

