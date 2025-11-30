package com.example.projectbase.domain.dto.response.chat;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ConversationResponse {

    private Long convoId;
    private LocalDateTime createdAt;
    private List<Long> memberIds;

}
