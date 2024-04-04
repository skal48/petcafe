package com.puppycafe.stamp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "set")
@Builder
public class ResponseDto<D> {

  //ResponseDto 만드는 이유 : API의 요청에 대한 응답을 간편하게 생성하고 전송할 수 있다.
  private boolean result;
  private String message;
  private D data;

  public static <D> ResponseDto<D> setSuccess(String message) {
    return ResponseDto.set(true, message, null);
  }

  public static <D> ResponseDto<D> setFailed(String message) {
    return ResponseDto.set(false, message, null);
  }

  public static <D> ResponseDto<D> setSuccessData(String message, D data) {
    return ResponseDto.set(true, message, data);
  }

  public static <D> ResponseDto<D> setFailedData(String message, D data) {
    return ResponseDto.set(false, message, data);
  }


}
