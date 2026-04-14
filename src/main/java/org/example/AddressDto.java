package org.example;
import jakarta.validation.constraints.NotBlank;

public class AddressDto {
    @NotBlank(message = "Tên người nhận không được để trống")
    private String receiverName;
    @NotBlank(message = "Địa chỉ không được để trống")
    private String detailedAddress;
    // getters & setters
}
