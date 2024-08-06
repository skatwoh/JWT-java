package sale.be.com.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

    public static <T> ResponseEntity<ApiResponse<T>> success(T data) {
        ApiResponse<T> response = new ApiResponse<>(true, data, null, HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(String errorMessage, HttpStatus status) {
        ApiResponse<T> response = new ApiResponse<>(false, null, errorMessage, status.value());
        return ResponseEntity.status(status).body(response);
    }

}
