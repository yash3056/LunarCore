// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SwitchLineupIndexCsReqOuterClass {
  /**
   * Protobuf type {@code SwitchLineupIndexCsReq}
   */
  public static final class SwitchLineupIndexCsReq extends ProtoMessage<SwitchLineupIndexCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 index = 11;</code>
     */
    private int index;

    private SwitchLineupIndexCsReq() {
    }

    /**
     * @return a new empty instance of {@code SwitchLineupIndexCsReq}
     */
    public static SwitchLineupIndexCsReq newInstance() {
      return new SwitchLineupIndexCsReq();
    }

    /**
     * <code>optional uint32 index = 11;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 index = 11;</code>
     * @return this
     */
    public SwitchLineupIndexCsReq clearIndex() {
      bitField0_ &= ~0x00000001;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 11;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 11;</code>
     * @param value the index to set
     * @return this
     */
    public SwitchLineupIndexCsReq setIndex(final int value) {
      bitField0_ |= 0x00000001;
      index = value;
      return this;
    }

    @Override
    public SwitchLineupIndexCsReq copyFrom(final SwitchLineupIndexCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        index = other.index;
      }
      return this;
    }

    @Override
    public SwitchLineupIndexCsReq mergeFrom(final SwitchLineupIndexCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      return this;
    }

    @Override
    public SwitchLineupIndexCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      index = 0;
      return this;
    }

    @Override
    public SwitchLineupIndexCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SwitchLineupIndexCsReq)) {
        return false;
      }
      SwitchLineupIndexCsReq other = (SwitchLineupIndexCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIndex() || index == other.index);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(index);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SwitchLineupIndexCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.index, index);
      }
      output.endObject();
    }

    @Override
    public SwitchLineupIndexCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SwitchLineupIndexCsReq clone() {
      return new SwitchLineupIndexCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SwitchLineupIndexCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SwitchLineupIndexCsReq(), data).checkInitialized();
    }

    public static SwitchLineupIndexCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SwitchLineupIndexCsReq(), input).checkInitialized();
    }

    public static SwitchLineupIndexCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SwitchLineupIndexCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SwitchLineupIndexCsReq messages
     */
    public static MessageFactory<SwitchLineupIndexCsReq> getFactory() {
      return SwitchLineupIndexCsReqFactory.INSTANCE;
    }

    private enum SwitchLineupIndexCsReqFactory implements MessageFactory<SwitchLineupIndexCsReq> {
      INSTANCE;

      @Override
      public SwitchLineupIndexCsReq create() {
        return SwitchLineupIndexCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName index = FieldName.forField("index");
    }
  }
}