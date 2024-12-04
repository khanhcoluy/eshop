package com.khanhnguyen.eshop.modals;

import com.khanhnguyen.eshop.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Role")
public class Role {
    @Id
    private String id;

    private ERole name;
}
