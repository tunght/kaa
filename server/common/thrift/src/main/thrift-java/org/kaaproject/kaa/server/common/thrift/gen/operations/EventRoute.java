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
public class EventRoute implements org.apache.thrift.TBase<EventRoute, EventRoute._Fields>, java.io.Serializable, Cloneable, Comparable<EventRoute> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EventRoute");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TENANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tenantId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROUTE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("routeInfo", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField OPERATIONS_SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operationsServerId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EventRouteStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EventRouteTupleSchemeFactory());
  }

  public String userId; // required
  public String tenantId; // required
  public List<RouteInfo> routeInfo; // required
  public String operationsServerId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    TENANT_ID((short)2, "tenantId"),
    ROUTE_INFO((short)3, "routeInfo"),
    OPERATIONS_SERVER_ID((short)4, "operationsServerId");

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
        case 3: // ROUTE_INFO
          return ROUTE_INFO;
        case 4: // OPERATIONS_SERVER_ID
          return OPERATIONS_SERVER_ID;
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
    tmpMap.put(_Fields.ROUTE_INFO, new org.apache.thrift.meta_data.FieldMetaData("routeInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RouteInfo.class))));
    tmpMap.put(_Fields.OPERATIONS_SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("operationsServerId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EventRoute.class, metaDataMap);
  }

  public EventRoute() {
  }

  public EventRoute(
    String userId,
    String tenantId,
    List<RouteInfo> routeInfo,
    String operationsServerId)
  {
    this();
    this.userId = userId;
    this.tenantId = tenantId;
    this.routeInfo = routeInfo;
    this.operationsServerId = operationsServerId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EventRoute(EventRoute other) {
    if (other.isSetUserId()) {
      this.userId = other.userId;
    }
    if (other.isSetTenantId()) {
      this.tenantId = other.tenantId;
    }
    if (other.isSetRouteInfo()) {
      List<RouteInfo> __this__routeInfo = new ArrayList<RouteInfo>(other.routeInfo.size());
      for (RouteInfo other_element : other.routeInfo) {
        __this__routeInfo.add(new RouteInfo(other_element));
      }
      this.routeInfo = __this__routeInfo;
    }
    if (other.isSetOperationsServerId()) {
      this.operationsServerId = other.operationsServerId;
    }
  }

  public EventRoute deepCopy() {
    return new EventRoute(this);
  }

  @Override
  public void clear() {
    this.userId = null;
    this.tenantId = null;
    this.routeInfo = null;
    this.operationsServerId = null;
  }

  public String getUserId() {
    return this.userId;
  }

  public EventRoute setUserId(String userId) {
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

  public EventRoute setTenantId(String tenantId) {
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

  public int getRouteInfoSize() {
    return (this.routeInfo == null) ? 0 : this.routeInfo.size();
  }

  public java.util.Iterator<RouteInfo> getRouteInfoIterator() {
    return (this.routeInfo == null) ? null : this.routeInfo.iterator();
  }

  public void addToRouteInfo(RouteInfo elem) {
    if (this.routeInfo == null) {
      this.routeInfo = new ArrayList<RouteInfo>();
    }
    this.routeInfo.add(elem);
  }

  public List<RouteInfo> getRouteInfo() {
    return this.routeInfo;
  }

  public EventRoute setRouteInfo(List<RouteInfo> routeInfo) {
    this.routeInfo = routeInfo;
    return this;
  }

  public void unsetRouteInfo() {
    this.routeInfo = null;
  }

  /** Returns true if field routeInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetRouteInfo() {
    return this.routeInfo != null;
  }

  public void setRouteInfoIsSet(boolean value) {
    if (!value) {
      this.routeInfo = null;
    }
  }

  public String getOperationsServerId() {
    return this.operationsServerId;
  }

  public EventRoute setOperationsServerId(String operationsServerId) {
    this.operationsServerId = operationsServerId;
    return this;
  }

  public void unsetOperationsServerId() {
    this.operationsServerId = null;
  }

  /** Returns true if field operationsServerId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationsServerId() {
    return this.operationsServerId != null;
  }

  public void setOperationsServerIdIsSet(boolean value) {
    if (!value) {
      this.operationsServerId = null;
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

    case ROUTE_INFO:
      if (value == null) {
        unsetRouteInfo();
      } else {
        setRouteInfo((List<RouteInfo>)value);
      }
      break;

    case OPERATIONS_SERVER_ID:
      if (value == null) {
        unsetOperationsServerId();
      } else {
        setOperationsServerId((String)value);
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

    case ROUTE_INFO:
      return getRouteInfo();

    case OPERATIONS_SERVER_ID:
      return getOperationsServerId();

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
    case ROUTE_INFO:
      return isSetRouteInfo();
    case OPERATIONS_SERVER_ID:
      return isSetOperationsServerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EventRoute)
      return this.equals((EventRoute)that);
    return false;
  }

  public boolean equals(EventRoute that) {
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

    boolean this_present_routeInfo = true && this.isSetRouteInfo();
    boolean that_present_routeInfo = true && that.isSetRouteInfo();
    if (this_present_routeInfo || that_present_routeInfo) {
      if (!(this_present_routeInfo && that_present_routeInfo))
        return false;
      if (!this.routeInfo.equals(that.routeInfo))
        return false;
    }

    boolean this_present_operationsServerId = true && this.isSetOperationsServerId();
    boolean that_present_operationsServerId = true && that.isSetOperationsServerId();
    if (this_present_operationsServerId || that_present_operationsServerId) {
      if (!(this_present_operationsServerId && that_present_operationsServerId))
        return false;
      if (!this.operationsServerId.equals(that.operationsServerId))
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

    boolean present_routeInfo = true && (isSetRouteInfo());
    list.add(present_routeInfo);
    if (present_routeInfo)
      list.add(routeInfo);

    boolean present_operationsServerId = true && (isSetOperationsServerId());
    list.add(present_operationsServerId);
    if (present_operationsServerId)
      list.add(operationsServerId);

    return list.hashCode();
  }

  @Override
  public int compareTo(EventRoute other) {
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
    lastComparison = Boolean.valueOf(isSetRouteInfo()).compareTo(other.isSetRouteInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRouteInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.routeInfo, other.routeInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperationsServerId()).compareTo(other.isSetOperationsServerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationsServerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationsServerId, other.operationsServerId);
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
    StringBuilder sb = new StringBuilder("EventRoute(");
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
    sb.append("routeInfo:");
    if (this.routeInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.routeInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operationsServerId:");
    if (this.operationsServerId == null) {
      sb.append("null");
    } else {
      sb.append(this.operationsServerId);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EventRouteStandardSchemeFactory implements SchemeFactory {
    public EventRouteStandardScheme getScheme() {
      return new EventRouteStandardScheme();
    }
  }

  private static class EventRouteStandardScheme extends StandardScheme<EventRoute> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EventRoute struct) throws org.apache.thrift.TException {
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
          case 3: // ROUTE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.routeInfo = new ArrayList<RouteInfo>(_list8.size);
                RouteInfo _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new RouteInfo();
                  _elem9.read(iprot);
                  struct.routeInfo.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setRouteInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPERATIONS_SERVER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.operationsServerId = iprot.readString();
              struct.setOperationsServerIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EventRoute struct) throws org.apache.thrift.TException {
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
      if (struct.routeInfo != null) {
        oprot.writeFieldBegin(ROUTE_INFO_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.routeInfo.size()));
          for (RouteInfo _iter11 : struct.routeInfo)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.operationsServerId != null) {
        oprot.writeFieldBegin(OPERATIONS_SERVER_ID_FIELD_DESC);
        oprot.writeString(struct.operationsServerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EventRouteTupleSchemeFactory implements SchemeFactory {
    public EventRouteTupleScheme getScheme() {
      return new EventRouteTupleScheme();
    }
  }

  private static class EventRouteTupleScheme extends TupleScheme<EventRoute> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EventRoute struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetTenantId()) {
        optionals.set(1);
      }
      if (struct.isSetRouteInfo()) {
        optionals.set(2);
      }
      if (struct.isSetOperationsServerId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserId()) {
        oprot.writeString(struct.userId);
      }
      if (struct.isSetTenantId()) {
        oprot.writeString(struct.tenantId);
      }
      if (struct.isSetRouteInfo()) {
        {
          oprot.writeI32(struct.routeInfo.size());
          for (RouteInfo _iter12 : struct.routeInfo)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetOperationsServerId()) {
        oprot.writeString(struct.operationsServerId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EventRoute struct) throws org.apache.thrift.TException {
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
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.routeInfo = new ArrayList<RouteInfo>(_list13.size);
          RouteInfo _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new RouteInfo();
            _elem14.read(iprot);
            struct.routeInfo.add(_elem14);
          }
        }
        struct.setRouteInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.operationsServerId = iprot.readString();
        struct.setOperationsServerIdIsSet(true);
      }
    }
  }

}

