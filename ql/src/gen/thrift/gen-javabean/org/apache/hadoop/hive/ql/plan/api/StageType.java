/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum StageType implements org.apache.thrift.TEnum {
  CONDITIONAL(0),
  COPY(1),
  DDL(2),
  MAPRED(3),
  EXPLAIN(4),
  FETCH(5),
  FUNC(6),
  MAPREDLOCAL(7),
  MOVE(8),
  STATS(9),
  DEPENDENCY_COLLECTION(10),
  COLUMNSTATS(11);

  private final int value;

  private StageType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StageType findByValue(int value) { 
    switch (value) {
      case 0:
        return CONDITIONAL;
      case 1:
        return COPY;
      case 2:
        return DDL;
      case 3:
        return MAPRED;
      case 4:
        return EXPLAIN;
      case 5:
        return FETCH;
      case 6:
        return FUNC;
      case 7:
        return MAPREDLOCAL;
      case 8:
        return MOVE;
      case 9:
        return STATS;
      case 10:
        return DEPENDENCY_COLLECTION;
      case 11:
        return COLUMNSTATS;
      default:
        return null;
    }
  }
}
