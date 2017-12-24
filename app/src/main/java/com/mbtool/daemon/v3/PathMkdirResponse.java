// automatically generated by the FlatBuffers compiler, do not modify

package com.mbtool.daemon.v3;

import com.google.flatbuffers.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class PathMkdirResponse extends Table {
  public static PathMkdirResponse getRootAsPathMkdirResponse(ByteBuffer _bb) { return getRootAsPathMkdirResponse(_bb, new PathMkdirResponse()); }
  public static PathMkdirResponse getRootAsPathMkdirResponse(ByteBuffer _bb, PathMkdirResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public PathMkdirResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String errorMsg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer errorMsgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public PathMkdirError error() { return error(new PathMkdirError()); }
  public PathMkdirError error(PathMkdirError obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createPathMkdirResponse(FlatBufferBuilder builder,
      boolean success,
      int error_msgOffset,
      int errorOffset) {
    builder.startObject(3);
    PathMkdirResponse.addError(builder, errorOffset);
    PathMkdirResponse.addErrorMsg(builder, error_msgOffset);
    PathMkdirResponse.addSuccess(builder, success);
    return PathMkdirResponse.endPathMkdirResponse(builder);
  }

  public static void startPathMkdirResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addErrorMsg(FlatBufferBuilder builder, int errorMsgOffset) { builder.addOffset(1, errorMsgOffset, 0); }
  public static void addError(FlatBufferBuilder builder, int errorOffset) { builder.addOffset(2, errorOffset, 0); }
  public static int endPathMkdirResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

