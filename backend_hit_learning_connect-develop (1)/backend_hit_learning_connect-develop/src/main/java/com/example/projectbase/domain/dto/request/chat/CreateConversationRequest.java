package com.example.projectbase.domain.dto.request.chat;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateConversationRequest {

    private List<Long> memberIds;
}
