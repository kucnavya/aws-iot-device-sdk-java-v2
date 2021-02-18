package software.amazon.awssdk.aws.greengrass.model;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import software.amazon.awssdk.eventstreamrpc.model.EventStreamJsonMessage;

public class UpdateStateResponse implements EventStreamJsonMessage {
  public static final String APPLICATION_MODEL_TYPE = "aws.greengrass#UpdateStateResponse";

  public static final UpdateStateResponse VOID;

  static {
    VOID = new UpdateStateResponse() {
      @Override
      public boolean isVoid() {
        return true;
      }
    };
  }

  public UpdateStateResponse() {
  }

  @Override
  public String getApplicationModelType() {
    return APPLICATION_MODEL_TYPE;
  }

  @Override
  public boolean equals(Object rhs) {
    if (rhs == null) return false;
    if (!(rhs instanceof UpdateStateResponse)) return false;
    if (this == rhs) return true;
    final UpdateStateResponse other = (UpdateStateResponse)rhs;
    boolean isEquals = true;
    return isEquals;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }
}