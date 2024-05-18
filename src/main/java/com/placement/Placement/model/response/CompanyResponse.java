package com.placement.Placement.model.response;

import com.placement.Placement.constant.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CompanyResponse {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private Status status;
}
